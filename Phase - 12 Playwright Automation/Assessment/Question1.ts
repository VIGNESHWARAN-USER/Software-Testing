import readlineSync from 'readline-sync'

const add = (a:number, b:number) : number => {
    return a + b;
}

const sub = (a:number, b:number) : number => {
    return a - b;
}

const mul = (a:number, b:number) : number => {
    return a * b;
}

const div = (a:number, b:number) : number => {
    return a / b;
}


const num1:number = readlineSync.questionInt("Enter First Number:");
const num2:number = readlineSync.questionInt("Enter Second Number:");

if(num1 < 0 || num2 < 0) {
    console.log("Invalid Input");
}
else {
    console.log(`Addition of ${num1} and ${num2} is: ${add(num1, num2)}`)
    console.log(`Subraction of ${num1} and ${num2} is: ${sub(num1, num2)}`)
    console.log(`Multiplication of ${num1} and ${num2} is: ${mul(num1, num2)}`)
    console.log(`Division of ${num1} and ${num2} is: ${div(num1, num2)}`)
}