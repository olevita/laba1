package entities;

final public class Administrator extends Worker{
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Do not disturb me!");
        super.work();
    }
}
