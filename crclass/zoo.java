package crclass;

public class zoo {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.name = "Барсик";
        pet1.type = "собака";
        pet1.price = 40;
        pet1.ageRestriction = 13;
        pet1.showPetInfo();

        Pet pet2 = new Pet();
        pet1.name = "Мята";
        pet1.type = "кошка";
        pet1.price = 30;
        pet1.ageRestriction = 13;
        pet1.showPetInfo();

        Pet pet3 = new Pet();
        pet1.name = "Дарвин";
        pet1.type = "рыба";
        pet1.price = 15;
        pet1.ageRestriction = 13;
        pet1.showPetInfo();

    }
}
