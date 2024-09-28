let branch = parseInt(prompt("Select branch:\n1 - Science\n2 - Humanities\n3 - Art\n4 - Sport"))
let subBranch = null
let decision = null
switch (branch) {
    case 1:
        subBranch = parseInt(prompt("Select one:\n1 - Math\n2 - Physics"))
        if (subBranch === 1) {decision = "Financier"}
        else {decision = "Engineer"}
        break
    case 2:
        subBranch = parseInt(prompt("Select one:\n1 - History\n2 - Foreign Languages"))
        if (subBranch === 1) {decision = "Historian or Diplomat"}
        else {decision = "Translator"}
        break
    case 3:
        subBranch = parseInt(prompt("Select one:\n1 - Drawing\n2 - Singing"))
        if (subBranch === 1) {decision = "Painter or Architect"}
        else {decision = "Singer or Tamada"}
        break
    case 4:
        subBranch = parseInt(prompt("Select one:\n1 - Team\n2 - Individual"))
        if (subBranch === 1) {decision = "Footballer or Basketball Player"}
        else {decision = "Boxer or Tennis Player"}
        break
    default:
        alert("Invalid input")
        break
}
alert("Your ideal job is " + decision)
