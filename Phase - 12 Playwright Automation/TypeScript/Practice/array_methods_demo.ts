let array: Array<number> = [1, 2, 3, 4, 10, 20, 5]

console.log(array.concat([1, 2, 3, 4]))
console.log(array.sort((a:number, b:number) => b - a ))
array.shift()
console.log(array)


