import Animals.*;


public class MainHW6 {
    public static void main(String[] args) {

        int countAnimals = 0;
        int countDog = 0;
        int countCat;

        Animals[] animals = {
                new Dog("Tobi"),
                new Cat("Myrka"),
                new Dog("Lucky"),
                new Cat("Marta"),
                new Cat("Pushok"),
                new Dog("Mr. Mails"),
                new Dog("Topotun"),

        };



        for (int i = 1; i <= animals.length ; i++) {

            //Задается разная дистанция
            int distanceRun = i * 100;
            int distanceSwim = i + 5;

            animals[i-1].Run(distanceRun);
            animals[i-1].Swim(distanceSwim);
            System.out.println();

            //Счетчик животных
            if (animals[i - 1] instanceof Dog){

                countDog++;

            }
            countAnimals++;
        }
        countCat = countAnimals - countDog;
        System.out.printf("Всего животных %d\nИз них:\nКошек = %d\nСобак = %d",countAnimals,countCat,countDog);

    }
}