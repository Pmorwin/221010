# *Containerizing your Project and Database*
- Step 1
    - Create a network for our containers
    - Use: **docker network create (network-name)** in cmd to achieve this

- Step 2
    - We need to create a containerized PostgresSQL DB in our network. This is super easy!
    - Use: **docker run --name postgre_container -p 5433:5432 -e POSTGRES_PASSWORD=password --network (network-name) -d postgres**
    - This will create a new DB that we can connect through on DBeaver through port 5433
        - Check that this worked with DBeaver
        - If it did, create your schema and tables
    - If that worked, we can move on to containerizing our project

- Step 3
    - Add this to your pom.xml:
        ``` 
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-assembly-plugin</artifactId>
                    <version>3.4.2</version>
                    <configuration>
                        <archive>
                            <manifest>
                                <mainClass>dev.orwin.driver.Driver</mainClass>
                            </manifest>
                        </archive>
                        <descriptorRefs>
                            <descriptorRef>jar-with-dependencies</descriptorRef>
                        </descriptorRefs>
                    </configuration>
                    <executions>
                        <execution>
                            <id>assemble-all</id>
                            <phase>package</phase>
                            <goals>
                                <goal>single</goal>
                            </goals>
                        </execution>
                    </executions>
                </plugin>
            </plugins>
        </build>
        ```

- Step 4
    - Change your ConnectionFactory to this:
    ``` 
    String url = System.getenv("POSTGRES_SQL_DB");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("PASSWORD");
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

- Step 5
    - Click Maven
        - It is on the far right of your screen and is sideways
    - Open (Name of Project)
    - Open Lifecycle
    - Double click package
    - This will create a .Jar file in the target folder

- Step 6
    - Create a Dockerfile
        - Right click your project and make a new file
        - Name the file "Dockerfile" exactly like this
        - Open the Dockerfile and put this as its contents: 
        ```
         FROM openjdk

         COPY . /workspace

         WORKDIR /workspace

         EXPOSE 8080

         ENTRYPOINT [ "java", "-jar", "target/(Name of the Jar file with dependencies)"]

- Step 7
    - Open CMD and create the docker imagine using this code:
    - **docker build . -t (name of image)**
    - This will create a docker image that we can view on docker

- Step 8
    - Created the container for our application
    - Use: **docker run -itd --name api_container -p 8888:8080 -e POSTGRES_SQL_DB=jdbc:postgresql://postgre_container:5432/postgres?currentSchema=practice -e DB_USERNAME=postgres -e PASSWORD=password --network (network-name) (name of image)**

- With this, you should be able to call to 8888(or whatever port you decide to use) in postman.