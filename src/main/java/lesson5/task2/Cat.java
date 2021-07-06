package lesson5.task2;

public class Cat {
    String name;
    int age;

    public Cat(String nameOfCat, int ageOfCat) {
        this.name = nameOfCat;
        this.age = ageOfCat;
    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        Cat cat0 = new Cat("Томас", 1);
        Cat cat1 = new Cat("мырау", 4);

        Cat cat3 = new Cat("Барсик", 3);
        Cat cat4 = new Cat("Клубок", 2);

        cats[0] = cat0;
        cats[1] = cat1;
        cats[3] = cat3;
        cats[4] = cat4;
        for (Cat currentCat :
                cats) {
            try {
                System.out.printf("Имя:%s,возраст:%d.\n", currentCat.name, currentCat.age);
            } catch (NullPointerException npe) {
                System.out.println("Ошибка - кот не проинициализирован");
                break;
            }
        }
    }


    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }
}
