const size = Number.parseInt(prompt("Enter array size:"))
let arr = []
for (let i = 0; i < size; i++) {
    arr[i] = Number.parseInt(prompt(`Enter element ${i+1}:`))
}
let toFind = Number.parseInt(prompt("Which number do you want to check?"))
let index = arr.indexOf(toFind)
if (index === -1) {
    alert("No")
} else {
    alert(`Yes ${index}`)
}
