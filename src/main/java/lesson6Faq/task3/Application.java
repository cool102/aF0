package lesson6Faq.task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Map<DayOfWeek, List<Lesson>> diary = new HashMap<>();
        diary.put(DayOfWeek.MONDAY, Lesson.generatefLessons());
        diary.put(DayOfWeek.TUESDAY, Lesson.generatefLessons());
        diary.put(DayOfWeek.WEDNESDAY, Lesson.generatefLessons());
        diary.put(DayOfWeek.THURSDAY, Lesson.generatefLessons());
        diary.put(DayOfWeek.FRIDAY, Lesson.generatefLessons());
        diary.put(DayOfWeek.SATURDAY, Lesson.generatefLessons());
        System.out.println("Расписание уроков на неделю");
        System.out.println();

        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()) {
            System.out.println(entry.getKey().getDay() + ":" + entry.getValue());
        }
        System.out.println("-------------------------------------------");
        Map<String, Integer> resultInCycle = new HashMap<>();

        List<Lesson> allLessons = Arrays.asList(Lesson.MATH, Lesson.CODING, Lesson.BIOLOGY, Lesson.HISTORY, Lesson.GEOGRAPHY, Lesson.PHYSIC);
        for (Lesson currentLesson : allLessons
        ) {
            int currentLessonCounter = 0;
            for (Map.Entry<DayOfWeek, List<Lesson>> currentEntry : diary.entrySet()) {
                List<Lesson> currentEntryValues = currentEntry.getValue();
                for (Lesson currenLesson : currentEntryValues
                ) {
                    if (currenLesson == currentLesson) {
                        currentLessonCounter++;
                    }

                }
            }
            resultInCycle.put(currentLesson.getDescriptionOfLesson(), currentLessonCounter);
        }
        System.out.println(resultInCycle);

    }
}
