package Animals;

public class Dog extends Animals {

    public Dog(String name) {

        this.name = name;

    }

    @Override
    public void Run(int distance) {

        limitRun = 500;
        if (distance <= limitRun){

            System.out.printf("Собака %s пробежала %d метров\n", name, distance);

        }else {

            System.out.printf("Собака %s не сможет пробежать больше %d м !\n",name, limitRun);

        }

    }

    @Override
    public void Swim(int distance) {
        limitSwim = 10;
        if (distance <= limitSwim){

            System.out.printf("Собака %s проплыла %d метров\n", name, distance);

        }else {

            System.out.printf("Собака %s не сможет проплыть больше %d м !\n",name, limitSwim);

        }
    }
}

