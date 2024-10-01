const size = Number.parseInt(prompt("Enter array size:"))
let squares = []
for (let i = 0; i < size; i++) {
    let userInput = Number.parseInt(prompt(`Enter array element ${i + 1}:`))
    squares.push(Math.pow(userInput, 2))
}

console.log(squares)
