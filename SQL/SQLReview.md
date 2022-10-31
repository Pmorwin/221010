# Joins 

- “A join is used in a query to combine rows from two tables, based on a related column between the tables (typically your primary/foreign keys).” -good QC line
- This is how we achieve multi-table queries!
    - We’ll typically join on PK/FK relationships to ensure matches, but you can do joins on any column.
    - For instance, in the krusty krab P1 demo, a role has a role_id PK, and an employee has a role_id as a FK. WE could do a join on those columns to get all data from both tables in one query.

- Types of Joins we’ll see:
    - Inner joins -> Return rows with matching values in both tables
    - Left outer joins -> Return every row in the left table, and matching rows in the right table
    - Right outer joins -> Return every row in the right table, and matching rows in the left table
    - Full outer joins -> Returns all rows from each table

    - “Left and Right” are dependent on the tables positions relative to the “join” keyword
        - The only thing matters when determining left vs right is the positioning around the join

- Bonus Joins:
    - Cross joins return the cartesian product of the joined tables
        - The cartesian product is all possible ordered pairs between the tables
        - In other words, you would use this to create a combination of all rows from each table
    - Self joins join a table to itself. You’d usually use this to compare rows to the same table
        - May be useful for hierarchical analysis. Consider a table of employees, with a column for “supervisor_id”. We can join the primary keys of employee_id with the supervisor_id in order to see who reports to whom. 

https://www.postgresqltutorial.com/postgresql-joins/ - if you need some extra content

# Set Operations

- “Set Operations combine two different queries into one view/resultset
- Similar to joins, but don’t get them confused
    - Joins combine tables, Set Operations combine queries
    - Joins join tables horizontally (columns), setops combine vertically (rows) 

- There are 4 types of set operations
    - Union returns all distinct rows from both queries (no duplicate rows)
    - Union All returns all rows from both queries (including duplicates)
    - Intersect returns the unique rows found in both queries
    - Except returns all unique rows in the first query that don’t appear in the second query

# Transactions

- A transaction is a group of one or more SQL statements that execute together, under a certain set of properties - ACID Properties
- Transactions are important for data integrity, or when you need a group of statements to either succeed or fail together - no in-between.

- A - Atomicity (atomic) 
    - The entire transaction happens in one go, or it doesn’t happen at all.
    - Every SQL statement in the transaction must complete successfully, or we undo everything the previous statement did.
        - If 99 statements succeed, and the last one fails, all 99 get rolled back!
    - Atomic (Atomus - The transaction can’t be broken down further. We can’t have a smaller piece of the total transaction succeed alone)
- C - Consistency (consistent)
    - The database has constraints… (PK/FK, Unique, Not Null, etc.)
    - While transactions are executing, we never enter a state where constraints are disregarded. 
        - Can’t deviate from the constraints of your DDL while transactions are executing. In other words, transactions are not above the law. 
- I - Isolation (isolated)
    - In practice, many transactions can be running concurrently (at the same time). 
    - Each individual transaction runs as if it was the only transaction running. This avoids collision of the database
    - Transactions can’t interfere with each other! The database implements this for us. 
        - SQL has different transaction isolation levels that we can change - the more isolated transactions are, the less they can affect each other, and the more reliable they become
        - BUT the more isolated we make a transaction, the slower our database will function. 
        - If you want to look into it, the levels are in the curriculum, and postgresql’s default level is “Read Committed”. 
- D - Durability (durable)
    - If the transaction successfully completes, all of the data is saved to the physical medium of the database. 
    - The data won’t be lost after a transaction completes. Saved forever!

# Indexes

- An index is a copy of selected columns of data from a table, designed to speed up data retrieval from a table. 
    - An index in a database acts pretty much like an index in a book. You don’t have to scour the entire database/table to find a certain set of information. It’s indexed for you, so you can flip right to where the data is located. 

- When creating an index, you specify one or more columns to create the index on 
    - E.g. CREATE INDEX index_name ON table_name (column1, column 2, …);

- Pros:
    - Speeds up data selection (since the data is indexed, DBeaver can jump directly to where the data is stored and retrieve it)
- Cons:
    - Takes up memory to create an index
    - Slows down the other CRUD operations (insert, update, delete)
        - Since the info is indexed, the data has to be changed in more than one place, obviously slowing down the process. 

- Clustered Indexes define the order in which data is physically stored in a table. It’ll actually follow the order that the records were inserted in.
    - The primary key constraint automatically created a clustered index on that particular column
    - We can only have one clustered index per table, since the records themself can be stored in only one order. 

- Non-Clustered Indexes are stored in a different location than the database tables. This allows for multiple non-clustered indexes per table. 
    - Non-Clustered indexes don’t sort the data inside the table. 
    - These are more like a textbook - data is stored in one place and the index is stored elsewhere. (In a structure called the heap).

# Views

- “A view is a database object of a stored query. A view is simply a virtual table returned to us based on the resultset of our SQL queries.”
- We can create our own views, which will act as a stored query for easier access.

- Syntax:
    - CREATE VIEW view_name AS (any DQL/select statement);
    - SELECT * FROM view_name;

- A Materialized View is a bit different from a regular view…
    - Materialized views are saved in memory whereas regular views are only displayed, never stored. The data they hold is static. The data is saved and ready to go, but you’ll need to update it if the data they’re reflecting changes.
        - In other words, regular views will execute their query every time they’re called, whereas materialized views have that data saved and ready to display. 
    - This means that regular views don’t take up space, but materialized views do. This is a common theme: more resources used = better perfor
