let books = [
    {name: "An Introduction to Physics", author: "Dr. Orion Electronvolt", priceUSD: 49.99},
    {name: "Of Mice and Men", author: "John Steinbeck", priceUSD: 9.99},
    {name: "An Introduction to Chemistry", author: "Dr. Orion Electronvolt", priceUSD: 49.99},
    {name: "An Introduction to Biology", author: "Dr. Orion Electronvolt", priceUSD: 49.99},
    {name: "Charlotte's Web", author: "E. B. White", priceUSD: 29.99},
    {name: "1984", author: "George Orwell", priceUSD: 39.99}
]

let author = prompt("Enter book author:")
let selectedBooks = []

for (let obj of books) {
    if (obj.author === author) {
        selectedBooks.push(obj)
    }
}

if (selectedBooks.length > 0) {
   console.log("Successfully found matches.")
    for (let selectedBook of selectedBooks)
        console.log(`"${selectedBook.name}" by ${selectedBook.author} for ${selectedBook.priceUSD}`)
} else {
    console.log("No matches found.")
}
