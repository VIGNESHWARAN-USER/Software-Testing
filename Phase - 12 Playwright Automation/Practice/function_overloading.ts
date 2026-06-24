function addition(a:any, b:any):any {
    return a+b
}

function addition(a:number, b:number):number {
    return a+b
}

function addition(a:string, b:string):string {
    return a+b
}



console.log(addition(10, 20));
console.log(addition("Hello", "world"));
console.log(addition("Hello", 20));