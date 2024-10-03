let arr = []
let input = -1
while (input !== 0) {
    input = Number.parseInt(prompt("Enter a number:"))
    if (input > 0)
        arr.push(input)
}
console.log(arr)
