let speedKmph = parseFloat(prompt("How fast are you moving? (km/h)"))
let distanceKm = parseFloat(prompt("How far away are you? (m)"))
const timeTaken = distanceKm/speedKmph
if (timeTaken <= 2.25) {
    alert("YES, YOU CAN REACH")
} else {
    alert("NO, YOU CAN NOT REACH")
}
