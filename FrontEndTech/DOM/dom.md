# DOM
- Document Object Model
    - Every web page behind the scenes is backed by a Document Object Model (DOM)
    - Tree of nodes representing the elements of our web page
    ![DOM](https://www.w3schools.com/js/pic_htmltree.gif)
- JavaScript was orignally for DOM Manipulation
    - Edit the nodes of the tree
    - Add new nodes (element/html tags)
    - Removing nodes

## JavaScript
- JS and web pages are ***event driven***
    - Everything that happens on your webpage is "an event"
    - Your broswer records all of these events
    - These events can be sent to JS functions you write for processing
- Event objects contain **A LOT** of helpful information about what happened
    - type of event (click, mouseover, mouseoff)
    - what element the event came from (target)
- JS is a single threaded lanaguge so it can only process one event at a time
    - That being said, nearly all events are process in literal nanoseconds
    - However, sometimes a snippet of code might block the processing of events for JS
        - Usually this is a good thing
        - You usually see this from Chrome stopping malicous websites from spamming you with popups