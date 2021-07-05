package lesson5.task4;

public class Cat {
    String name;
    int age;

    public Cat(String catName, int ageOfCat) {

        this.name = catName;
        try {
            if (ageOfCat < 0) {
                throw new AgeUnderZeroException();
            }
            if ((ageOfCat > 20)) {
                throw new AgeTooHighException();
            }
            this.age = ageOfCat;
        } catch (AgeTooHighException athe) {

        }

    }
}
