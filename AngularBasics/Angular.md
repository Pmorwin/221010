# Angular

## The Problem
- Modern front ends are very large and complicated
- JS and other popular JS librariess JQuery couldn't scale to the level needed for the largest of applications
- Vanilla JS can be really teadious and diffcult to write on mass
    - manually adding event listeners
    - DOM manipulation can feel like a chore
        - Create elements and attaching children isnt as simple as it should be
- Data management is also tricky 
    - Getting values in JS into the web page and vice versa isnt "simple"

## The Solution
- There are lots and lots of different JS frameworks
    - So many that is almost turned into a meme of how many there are
- The Big 3
    - React
        - Facebook
    - Angular
        - Google
    - Vue
        - One guy, Evan You, he wrote fun and it became very popular

## Angular
- AngularJS is the original Anuglar
    - But it is depricated and not supported by Google
- Angular 2.0 (which people just call Angular)
    - Big restructure of the framework
    - Made TS **MANDATORY**
    - Adressed some fundamental issues with AngularJS
- Angular Framework
    - You write code in a format so that it fits into the Angular framework and how Angular does webpages
    - Angular is EXTREMELY oppinionated. So you do it the Angular way, or it just wont work

## Angular Architecture
- **Components**
    - Reuseable custome chunks of HTML/CSS/TS
    - They are the visual aspect of any Angular Application
        - Template
            - HTML
        - Selctor
            - Custom HTML Tag that we use to call the component
        - TS Class
            - logic and variables for that compoent
- **app.module.ts**
    - Heart of your Angular Application
        - You will register components you  create here
        - Register services you create here
        - label boostrap components
            - The intial component that is loaded into your page, index.tml
            - generally you leave that as app-root, this default and we wont need to change it

## Binding
- We can tie values in TS to the HTML template
- We can listen to events from the DOM/HTML and process them in TS really easily in angular
- There are 3 types of binding
- Interpolation
    - A value in the TS is put into the HTML
- Event Binding
    - An event is process by a method in TS
- Two-way
    - Binds the value in an input field to a variable in TS in real-time and synchoronously updates it