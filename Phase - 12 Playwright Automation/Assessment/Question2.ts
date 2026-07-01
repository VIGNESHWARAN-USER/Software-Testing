import readlineSync from 'readline-sync';

const reverse = (num: number): number => {
    let reversed = 0;

    while (num > 0) {
        reversed = reversed * 10 + num % 10;
        num = Math.floor(num / 10);
    }

    return reversed;
};

const num: number = readlineSync.questionInt("Enter the Number: ");

console.log(`Reverse of ${num} is: ${reverse(num)}`);