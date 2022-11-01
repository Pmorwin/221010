# HTML
- HyperText Markup Lanugage
- Content and structure of our webpages
- **HTML IS NOTTTTTT A PROGRAMMING LANGUAGE**
    - It is effectively something that lets make pretty shapes
    - It is a fancy version of MS paint
- Web Pages load from top to bottom
    - Make sure to link CSS before applying the style in a style tag

# Syntax
- Tag/element based language
- Tags can have attributes
- Tags *can* be self closing
- Tags can be nested
- Careful about Overlapping your tags

```html
<!-- <TagType attributes> Content of tag </TagType>    -->
<p> This is a paragraph tag </p>
<h1>I am a heading tag</h1>
<h6>I am also a heading tag, but am smaller</h6>

<!--  self closing tags -->
<br/>
<img src = "some_random_image.png"/>

<p> Hello my name is <s>Dillan</s> <b>Patrick</b> </p>


<!--  This is overlapping tags  -->
<p> Hello my name is <s>Dillan</s> <b>Patrick</p></b> 
<!--  This will cause issues, this wont work -->

```
