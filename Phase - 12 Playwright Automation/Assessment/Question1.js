import readlineSync from 'readline-sync';
const add = (a, b) => {
    return a + b;
};
const sub = (a, b) => {
    return a - b;
};
const mul = (a, b) => {
    return a * b;
};
const div = (a, b) => {
    return a / b;
};
const num1 = readlineSync.questionInt();
const num2 = readlineSync.questionInt();
console.log(`Addition of ${num1} and ${num2} is: ${add(num1, num2)}`);
console.log(`Subraction of ${num1} and ${num2} is: ${sub(num1, num2)}`);
console.log(`Multiplication of ${num1} and ${num2} is: ${mul(num1, num2)}`);
console.log(`Division of ${num1} and ${num2} is: ${div(num1, num2)}`);
