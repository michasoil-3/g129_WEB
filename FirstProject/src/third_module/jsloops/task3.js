const size = Number.parseInt(prompt("Enter array size:"))
let arr = []
let total = 0
let userInput = 0
for (let i = 0; i < size; i++) {
    userInput = Number.parseInt(prompt("Enter a number:"))
    total += userInput
    arr.push(userInput)
}
console.log(total, total/arr.length)
