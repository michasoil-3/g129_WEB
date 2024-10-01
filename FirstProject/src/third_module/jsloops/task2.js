const size = Number.parseInt(prompt("Enter array size:"))
let arr = []
for (let i = 0; i < size; i++) {
    arr.push(Number.parseInt(prompt(`Enter array element ${i + 1}:`)))
}
let biggest = arr[0]
for (let i of arr) {
    if (i > biggest) {
        biggest = i
    }
}
console.log(biggest)
