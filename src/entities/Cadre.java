package entities;

abstract class Cadre {

    protected String name;

    public String getName()
    {
        return this.name;
    }

    public Cadre setName(String name)
    {
        this.name = name;
        return this;
    }
}
