const size = Number.parseInt(prompt("Enter array size:"))
let arr = []
for (let i = 0; i < size; i++) {
    arr.push(Number.parseInt(prompt(`Enter array element ${i + 1}:`)))
}
console.log(arr.reverse())
