class Car{

    public brand: string;
    private speed: number;
    protected fuel: string;

    constructor(brand: string, speed:number, fuel:string){
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
    }

    public accelerate() {
        this.speed += 10;
        console.log("Accelerating to :",this.speed, "km/h")
    }

    private refuel() {
        console.log("Refueling with ",this.fuel);
    }

    protected honk() {
        console.log("Honk Honk!");
    }

    public displayCarInfo() {
        console.log("Brand :", this.brand);
        console.log("Speed :", this.speed);
        console.log("Fuel: ", this.fuel);
        this.refuel();
        this.honk();
    }
}

let obj = new Car("Benz", 60, "Petrol")

console.log("Brand: ",obj.brand);
obj.accelerate();
obj.displayCarInfo();