function sum(...arr:number[]) {

    let res:number = 0;

    for(let val of arr)
    {
        res += val;
    }

    return res;
}

console.log("The sum of the array is: ", sum(1, 2, 3, 4, 5))