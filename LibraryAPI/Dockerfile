FROM openjdk
#This is the enviornement we want the container to run in

COPY . /workspace
#This will copy everything in our project and put it into a folder called workspace

WORKDIR /workspace
#Tell it what folder to work out of

EXPOSE 8080
#Tell it what port to connect to

ENTRYPOINT [ "java", "-jar", "target/LibraryAPI-1.0-SNAPSHOT-jar-with-dependencies.jar" ]
