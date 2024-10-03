const size = Number.parseInt(prompt("Enter array size:"))
let product = 1
let input = 0
for (let i = 0; i < size; i++) {
    input = Number.parseInt(prompt(`Enter element ${i+1}:`))
    if (input !== 0)
        product *= input
}
alert(product)
