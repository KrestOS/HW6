package Animals;

public abstract class Animals {

    String name;
    int limitRun = 0;
    int limitSwim = 0;

    public Animals() {

    }

    public abstract void Run(int distance);
    public abstract void Swim(int distance);

}

