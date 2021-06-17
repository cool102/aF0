package lesson3.task4;

public class Human {
    String name;
    Human[] friends = new Human[5];

    /**
     * создал КОнструктор инициализирующий поле name
     *
     * @param nameOfHuman
     */
    Human(String nameOfHuman) {
        this.name = nameOfHuman;
    }

    /**
     * создал метод
     * <p>
     * добавляет человек 2 в друзья человека 1 и сразу же добавляет человека 1 в друзья человека 2
     *
     * @param
     */
    public void addFriend(Human friend) {
        int index = 0;
        while (friends[index] != null) {
            if (friends[index] == friend) return;
            index++;
        }
        friends[index] = friend;
        friend.addFriend(this);
    }

    /**
     * метод печатает всех друзей вызвавшего метод
     */
    void printAllFriends() {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] != null)
                System.out.println(friends[i].name);

        }

    }

}







