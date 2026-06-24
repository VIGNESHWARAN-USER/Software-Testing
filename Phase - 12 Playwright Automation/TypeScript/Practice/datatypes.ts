let num: number = 10
let hexa: number = 0X67CF
let octal: number = 0o334
let bin: number = 0b1100

console.log(num)
console.log(hexa)
console.log(octal)
console.log(bin)
console.log(typeof num)

let message = "Hello world!";

console.log(message)
console.log(typeof message)

let flag: boolean = true
let val = true

console.log(flag)
console.log(typeof flag)

let a = null
let b

let array1: string[] = ["Apple", "Orange", "Banana"];
let array2: Array<number> = [1, 2, 3, 4, 5]
let i = 0;
for(i = 0; i<array1.length; i++){
    console.log(array1[i])
}
i=0;
while(i < array2.length){
    console.log(array2[i]);
    i++;
}


