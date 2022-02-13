package entities;

public class Engineer extends Worker{
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Come back later");
        super.work();
    }
}
