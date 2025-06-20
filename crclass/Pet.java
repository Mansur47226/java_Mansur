package crclass;
public class Pet {
    String name;
    String type;
    int price;
    int ageRestriction;

    void showPetInfo() {
        System.out.println("name: " + name);
        System.out.println("poroda: " + type);
        System.out.println("price: $" + price);
        System.out.println("age limit: " + ageRestriction + "+");
    }
}
