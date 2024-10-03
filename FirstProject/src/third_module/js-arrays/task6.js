let students = []
let input = -1
do {
    input = Number.parseInt(prompt("PRESS 1 TO ADD STUDENT\nPRESS 2 TO LIST STUDENTS\nPRESS 0 TO EXIT"))
    switch (input) {
        case 1:
            let name = prompt("ENTER NAME:")
            let surname = prompt("ENTER SURNAME:")
            let gpa = Number.parseFloat(prompt("ENTER GPA:"))
            students.push({name: name, surname: surname, gpa: gpa})
            break
        case 2:
            for (let student of students) {
                console.log(student)
            }
            break
        default:
            break
    }
} while (input !== 0)
