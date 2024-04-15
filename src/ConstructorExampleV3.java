public class ConstructorExampleV3 {
    public static void main(String[] args) {
        CarV3 model3 = new CarV3("Model3", "Black");

        System.out.println(model3.model);
        System.out.println(model3.color);
        System.out.println(model3.fuel);

        CarV3 gv80 = new CarV3("GV80","White",80);

        System.out.println(gv80.model);
        System.out.println(gv80.color);
        System.out.println(gv80.fuel);

    }
}
