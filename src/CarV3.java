public class CarV3 {
    public String model;
    public String color;
    public int fuel;

    public CarV3(){}

    public CarV3(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public CarV3(String model, String color, int fuel) {
        this.model = model;
        this.color = color;
        this.fuel = fuel;
    }
}
