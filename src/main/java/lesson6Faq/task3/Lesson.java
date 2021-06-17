package lesson6Faq.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATH("математика"),
    PHYSIC("физика"),
    CODING("программирование"),
    HISTORY("история"),
    BIOLOGY("Биология"),
    GEOGRAPHY("география");

    private String descriptionOfLesson;

    Lesson(String descrip){
        this.descriptionOfLesson = descrip;
    }

    public String getDescriptionOfLesson() {
        return descriptionOfLesson;
    }


    public static List<Lesson> generateListOfLessons() {
        List<Lesson> lessons = new ArrayList<>();
        List<Lesson> lessonsAsArray = Arrays.asList(Lesson.values());
        int numberOfLesson = 4 + new Random().nextInt(2);
        for (int i = 0; i < numberOfLesson; i++) {
            lessons.add(i, lessonsAsArray.get(new Random().nextInt(5)));
        }
        return lessons;
    }
}
