let size = 0
let input = 1
let product = 1
while (input !== 0) {
    input = Number.parseInt(prompt(`Enter a number:`))
    if (input !== 0) {
        product *= input
        size++
    }
}
if (size !== 0) {
    let geometricMean = Math.pow(product, 1/size)
    alert(`Geometric mean: ${geometricMean}`)
}
