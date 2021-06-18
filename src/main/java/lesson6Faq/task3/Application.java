package lesson6Faq.task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Scholar scholar = new Scholar();

        Map<DayOfWeek, List<Lesson>> diary = new HashMap<>();
        diary.put(DayOfWeek.MONDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.TUESDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.WEDNESDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.THURSDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.FRIDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.SATURDAY, Lesson.generateListOfLessons());
        System.out.println("Расписание уроков на неделю");
        System.out.println();
        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()
        ) {
            System.out.println(entry.getKey().getDay() + ":" + entry.getValue());

        }
        System.out.println("-------------------------------------------");
        Map<String, Integer> resultInCycle = new HashMap<>();

        List<Lesson> AllLessons = Arrays.asList(Lesson.MATH, Lesson.CODING, Lesson.BIOLOGY, Lesson.HISTORY, Lesson.GEOGRAPHY, Lesson.PHYSIC);
        for (Lesson curLesson : AllLessons
        ) {
            int currentLessonCounter = 0;
            for (Map.Entry<DayOfWeek, List<Lesson>> currentEntry : diary.entrySet()) {
                List<Lesson> currentEntryValues = currentEntry.getValue();
                for (Lesson currenLesson : currentEntryValues
                ) {
                    if (currenLesson == curLesson) {
                        currentLessonCounter++;
                    }

                }
            }
            resultInCycle.put(curLesson.getDescriptionOfLesson(), currentLessonCounter);
        }
        System.out.println(resultInCycle);

    }
}
