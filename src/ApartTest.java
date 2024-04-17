public class ApartTest {
    public static void main(String[] args) {
        Apartment apt = new Apartment();
        Apartment apt1 = new Apartment(2);
        Apartment apt2 = new Apartment(1,3);
        Apartment apt3 = new Apartment(2,3,29);
        Apartment apt4 = new Apartment(2,3,26,"Seoul");
        Apartment apt5 = new Apartment(2,3,26,"Seoul",105);

        System.out.println(apt);
        System.out.println(apt1);
        System.out.println(apt2);
        System.out.println(apt3);
        System.out.println(apt4);
        System.out.println(apt5);

        System.out.println(apt1.elevator);
        System.out.println(apt1.room);

        System.out.println(apt2.room);
        System.out.println(apt2.floor);

        System.out.println(apt3.floor);
        System.out.println(apt3.location);

        System.out.println(apt4.location);
        System.out.println(apt4.dong);

        System.out.println(apt5.elevator);
        System.out.println(apt5.room);
        System.out.println(apt5.floor);
        System.out.println(apt5.location);
        System.out.println(apt5.dong);


    }
}
