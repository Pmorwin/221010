export interface Book{
    id: number
    title: string
    author: string
    returnDate: number
}

// Interfaces vs classes in TS
// Interfaces in TS, unlike Java can have fields no just abstract methods
// Interfaces define propertes that should be on an object. You still have to create the object
// When should you use an interface vs a class, if you are going to have functions from your "object"
// If you are not (which most dont) use an interface
// It also changes the syntax of creating an object
// const myBook:Book = {id:101, title:`Franken the dude`, author:`Some Hobo`, returnDate:0}