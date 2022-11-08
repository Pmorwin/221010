const url = "http://localhost:8080"; //putting our base URL in a variable for cleaner fetch code
//this will be used in our fetch requests to send HTTP reuqests to our javalin handlers

//I like to add all my event listeners at the top
document.getElementById("getBooksButton").onclick = getBooks; //this button will GET all books
document.getElementById("submitBookButton").onclick = submitBook; //this button will POST a new book


//I like to add all my functinos at the bottom--------------------------------

//This function is an async function which uses a fetch request to get data from our API
//async functions return promise objects, which PROMISE that some HTTP response will be returned.
async function getBooks(){

    //a variable that holds the result of a fetch request for Book data from the API
    let response = await fetch(url + "/books") 

    //async & await? 
    //async makes a function asynchronous 
    //await pauses the function until the promise object is returned 

    console.log(response) //print out the response
    
    //take the HTTP response and turn it into a readable format (from JSON to JS)
    let data = await response.json();

    console.log(data) //now, we can print out the javascript array and use it to render some data

    //if the HTTP Response status code is 200 (OK)...
    if(response.status === 200){

        //For every book object we get back from our fetch, we want to render it in the table
        //"book" is simply the variable name we're giving to each of the Array's elements
        for(let book of data){

            //create a new table body row (tr) for the incoming book
            let row = document.createElement("tr");

            //create a table data cell (td) for each of the book's fields
            let cell1 = document.createElement("td");
            //fill the cell with the appropriate data
            cell1.innerHTML = book.id;
            //add the new cell to the row
            row.appendChild(cell1)

            let cell2 = document.createElement("td");
            cell2.innerHTML = book.title;
            row.appendChild(cell2)

            let cell3 = document.createElement("td");
            cell3.innerHTML = book.author;
            row.appendChild(cell3)

            let cell4 = document.createElement("td");
            cell4.innerHTML = book.returnDate;
            row.appendChild(cell4)

            //finally, we need to actually APPEND THE ROW to the table body
            //a new row will be appended FOR EVERY BOOK that got returned in the fetch
            document.getElementById("booksBody").appendChild(row);
        }

    } 

}//end of get all books function


//This function will take in user input, and create a book object to send in a POST request
async function submitBook(){

    //gather the user's input from the submit book input boxes
    //when the submit button is clicked, these variables will be populated
    let titleInput = document.getElementById("title").value; //we can gather inputs with .value 
    let authorInput = document.getElementById("author").value;

    //now we have the inputs, but we need to put them in an object to send in the fetch 
    let newBook = {
        id: 0, //this will be changed by the DAO
        title: titleInput,
        author: authorInput,
        returnDate: 0 //this will be changed when the book is returned
    } //NOTE: the variable names MUST match the variable names in your API.

    //now that we have a Book object, we're ready to send a POST request

    //any fetch request besides GET requires a few more parameters
        //It will include: URL, and a config object 
    let response = await fetch(url + "/books",{
        method: "POST", //send a POST requests (would be GET if we didn't specify)
        body: JSON.stringify(newBook) //turn the newBook into JSON, and send it in the request body
    });

    //log the response just so we can see what comes back
    console.log(response)

    //popup to tell the user their new book was created
    if(response.status === 201){
        alert("Book Created: " + titleInput + " by " + authorInput)
    }

} //end of submit book function