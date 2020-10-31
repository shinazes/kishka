public class Fish extends Pet implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println("I swim to " + distance + " meters");
    }

    @Override
    public void dive(int depth) {
        System.out.println("I dive to " + depth + " meters");
    }
}
