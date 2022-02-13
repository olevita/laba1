package entities;

public class Worker extends Cadre{
    public Worker(String name)
    {
        this.name = name;
    }

    public void work()
    {
        System.out.println("I'm working");
    }
}
