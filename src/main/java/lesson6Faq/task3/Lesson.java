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

    private final String description;

    Lesson(String description) {
        this.description = description;
    }

    public static List<Lesson> generatefLessons() {
        List<Lesson> lessons = new ArrayList<>();
        List<Lesson> lessonsAsArray = Arrays.asList(Lesson.values());
        int numberOfLesson = getRandomLesson();
        for (int i = 0; i < numberOfLesson; i++) {
            lessons.add(i, lessonsAsArray.get(new Random().nextInt(6)));
        }
        return lessons;
    }

    private static int getRandomLesson() {
        return 4 + new Random().nextInt(2);
    }

    public String getDescriptionOfLesson() {
        return description;
    }
}
