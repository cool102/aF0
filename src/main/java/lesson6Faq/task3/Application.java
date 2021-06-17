package lesson6Faq.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<DayOfWeek, List<Lesson>> diary = new HashMap<>();
        diary.put(DayOfWeek.MONDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.TUESDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.WEDNESDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.THURSDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.FRIDAY, Lesson.generateListOfLessons());
        diary.put(DayOfWeek.SATURDAY, Lesson.generateListOfLessons());


        Scholar scholar = new Scholar();

        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()
        ) {
            System.out.printf(entry.getKey().getDay() + ":" + entry.getValue() + " \n");

        }


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        Map<String, Integer> result = new HashMap<>();
        int mathCounter = 0;
        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()
        ) {
            List<Lesson> dayLessons = entry.getValue();
            for (Lesson currentLesson : dayLessons
            ) {
                if (currentLesson == Lesson.MATH) {
                    mathCounter++;
                }

            }
        }
        result.put("Количество уроков математики:", mathCounter);

        int histCounter = 0;
        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()
        ) {
            List<Lesson> dayLessons = entry.getValue();
            for (Lesson currentLesson : dayLessons
            ) {
                if (currentLesson == Lesson.HISTORY) {
                    histCounter++;
                }

            }
        }
        result.put("Количество уроков истории:", histCounter);

        int phusCounter = 0;
        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()
        ) {
            List<Lesson> dayLessons = entry.getValue();
            for (Lesson currentLesson : dayLessons
            ) {
                if (currentLesson == Lesson.PHYSIC) {
                    phusCounter++;
                }

            }
        }
        result.put("Количество уроков физики:", phusCounter);

        int codCounter = 0;
        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()
        ) {
            List<Lesson> dayLessons = entry.getValue();
            for (Lesson currentLesson : dayLessons
            ) {
                if (currentLesson == Lesson.CODING) {
                    codCounter++;
                }

            }
        }
        result.put("Количество уроков программирования:", codCounter);


        int bioCounter = 0;
        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()
        ) {
            List<Lesson> dayLessons = entry.getValue();
            for (Lesson currentLesson : dayLessons
            ) {
                if (currentLesson == Lesson.BIOLOGY) {
                    bioCounter++;
                }

            }
        }
        result.put("Количество уроков биологии:", bioCounter);

        System.out.println(result);
    }
}
