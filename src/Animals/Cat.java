package Animals;

public class Cat extends Animals {

    public Cat(String name) {

        this.name = name;

    }

    @Override
    public void Run(int distance) {
        limitRun = 200;
        if (distance <= limitRun){

            System.out.printf("Кошка %s пробежала %d метров\n", name, distance);

        }else {

            System.out.printf("Кошка %s не сможет пробежать больше %d м !\n",name, limitRun);

        }
    }

    @Override
    public void Swim(int distance) {

        System.out.printf("Кошка %s не умеет плавать ):\n",name);

    }
}

