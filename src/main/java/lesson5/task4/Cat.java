package lesson5.task4;

public class Cat {
    public String catName;
    public int catAge;

    public Cat(String catName, int catAge) {

        this.catName = catName;
        try {
            if (catAge < 0) {
                throw new AgeUnderZeroException();
            }
            if ((catAge > 20)) {
                throw new AgeTooHighException();
            }
            this.catAge = catAge;
        } catch (AgeTooHighException athe) {

        }

    }
}
