-- DDL (Data Defintion Langauge) this is a "sub-language of SQL"

CREATE TABLE books( -- SQL has things called constrains, they are keywords we can put on tables/variables to force something to be true
	id serial PRIMARY KEY, --dbeaver does not recognize serial as a keyword, serial is used to make an auto incrementing coulmn
	-- Primary key as a constraint, is muliple combined. It is not null and unique. So you cannot have 2 matching primary keys
	-- Manually adding values, WILL mess up serial, so be careful with that, and understand that you may have to power through some errors
	title varchar(40) NOT NULL, -- This means it CANNOT be null for any reason
	author varchar(40) NOT NULL,
	returnDate int
);


-- DML (Data Manipulation Language) update, insert, delete are here
-- insert
INSERT INTO books VALUES (DEFAULT, 'Great Gatsby', 'F. Scott Fitts Jerald', 0);
INSERT INTO books VALUES (DEFAULT, 'Great Expectations','Charles Dickens',0);
INSERT INTO books VALUES (DEFAULT, 'Beloved','Tonny Morison',0);

--delete
DELETE FROM books WHERE title = 'Great Gatsby';
-- This will delete stuff!


--update
UPDATE books SET title = 'It ends with us', author = 'Caleen Hoover' WHERE id = 2;
UPDATE books SET author = 'Patrick Orwin' WHERE title = 'Great Expectations';


-- DQL (Data Query Lanugage) This is wherre you have select statement 
SELECT * FROM books;


-- DCL (Data Control Language) We arent every going to use these, but know them

-- TCL (Transation Control Language) We arent ever going to use these, but know them

DROP TABLE IF EXISTS books;


