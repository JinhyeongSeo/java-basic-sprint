package example05;

public class MakeClassTest {
    public static void main(String[] args) {
        Person person1 = new Person("seo",15);
        Person person2 = new Person("kim",20);
        person1.PrintPerson();
        person2.PrintPerson();

        Book book1 = new Book("알고리즘","구종만",45000);
        book1.FieldPrint();
    }

    public static class Person {
        public String name;
        public int age;

        public Person (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void PrintPerson() {
            System.out.println(name + " " + age);
        }
    }

    public static class Book {
        public String title;
        public String author;
        public int price;


        public Book (String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void FieldPrint() {
            System.out.println(title + " " + author + " " + price);
        }
    }
}
