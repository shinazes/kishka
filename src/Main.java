public class Main {
    public static void main(String[] args) {
        var fish = new Fish("Asya");
        var dog = new Dog("Bodik");
        Swimmable myPet = dog;
        myPet.swim(10);
        myPet.dive(1);
    }
}
