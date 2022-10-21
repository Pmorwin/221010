# Docker

## The Problem
- Deploying and maintaining applications is difficult
    - There is a whole division of programing called DevOps whos job it is to do that
    - To be able to deploy an app you need to build it into a widely usable format
    - You need an enviornment set up that can run the code
        - installing the correct JDK, or version of python
        - setting up the enviornment variables
        - and you have to have identical folder/file structure
    - Just because it works on my machine, doesnt else where
- This is where the glory of containerazation comes in
    - You can containerize an app to hold all of that information

## Docker Basics
- Docker is a containerazation software
- Container
    - A virtual environment for an application to run in
    - They are very light weight
        - This means making and creating containers is super fast (matters of seconds)
    - A container runs on any compauter like any other program
        - Because, running a container is fundamentally the same to your computer as having microsoft word open
- Image
    - A template for a container
    - Image is to container as class is to object
- Dockerfile
    - It needs to be named exactly as above
    - This is a script that is used to create your image from your application

