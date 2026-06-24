interface Shape{
    name: String;
    color: String;
    area(length:number, breadth:number): number;
}

class Square implements Shape{

    name: String;
    color: String;

    constructor(name: String, color: String) {
        this.name = name;
        this.color = color;
    }

    public area(length:number, breadth:number):number {
        return length*breadth;
    }   
}