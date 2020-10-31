public class Dog extends Pet implements Swimmable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println("I swim to " + distance + " meters");
    }

    @Override
    public void dive(int depth) {
        System.out.println("I not have time to dive");
    }
}

