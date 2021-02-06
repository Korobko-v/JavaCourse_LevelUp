package org.levelup.lesson10.lambda;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskApp {
    public static void main(String[] args) {
        Task task1 = new Task("1", "task1", TaskType.CODING, LocalDate.of(2021, 1, 12), true, new HashSet<>(Arrays.asList("#app")), LocalDate.of(2021, 1, 14));
        Task task2 = new Task("2", "task2", TaskType.READING, LocalDate.of(2021, 2, 1), true, new HashSet<>(Arrays.asList("#articles")), LocalDate.of(2021, 2, 3));
        Task task3 = new Task("3", "task3", TaskType.WRITING, LocalDate.of(2021, 1, 5), true, new HashSet<>(Arrays.asList("#poem")), LocalDate.of(2021, 1, 7));
        Task task4 = new Task("4", "task4", TaskType.READING, LocalDate.of(2012, 4, 12), true , new HashSet<>(Arrays.asList("#books")), LocalDate.of(2014, 5, 23));
        Task task5 = new Task("5", "task5", TaskType.CODING, LocalDate.of(2021, 2, 1), false, new HashSet<>(Arrays.asList("#app", "#lambda")), LocalDate.of(2021, 2, 7));
        Task task6 = new Task("6", "task6", TaskType.CODING, LocalDate.of(2021, 2, 4), false, new HashSet<>(Arrays.asList("#server", "#app")), LocalDate.of(2021, 4, 15));
        Task task7 = new Task("7", "task7", TaskType.READING, LocalDate.of(2019, 6, 21), true, new HashSet<>(Arrays.asList("#books")), LocalDate.of(2020, 11, 3));
        Task task8 = new Task("8", "task7", TaskType.WRITING, LocalDate.of(2015, 9, 5), false, new HashSet<>(Arrays.asList("#autobiography")), LocalDate.of(2023, 3, 11));
        Task task9 = new Task("9", "task9", TaskType.CODING, LocalDate.of(2017, 7, 19), true, new HashSet<>(Arrays.asList("#app", "#project", "#tasks")), LocalDate.of(2019, 2, 8));
        Task task10 = new Task("10", "task12", TaskType.READING, LocalDate.of(2020, 12, 10), true, new HashSet<>(Arrays.asList("#books")), LocalDate.of(2021, 1, 28));
        Task task11 = new Task("11", "task11", TaskType.READING, LocalDate.of(2007, 9, 3), true, new HashSet<>(Arrays.asList("#books")), LocalDate.of(2010, 1, 1));
        Task task12 = new Task("12", "task12", TaskType.READING, LocalDate.of(2011, 8, 10), true, new HashSet<>(Arrays.asList("#books")), LocalDate.of(2011, 11, 4));

        List<Task> allTasks = new ArrayList<>();
        allTasks.add(task1);
        allTasks.add(task2);
        allTasks.add(task3);
        allTasks.add(task4);
        allTasks.add(task5);
        allTasks.add(task6);
        allTasks.add(task7);
        allTasks.add(task8);
        allTasks.add(task9);
        allTasks.add(task10);
        allTasks.add(task11);
        allTasks.add(task12);


        //1. Найти все задачи типа READING, отсортированные по дате создания.
        System.out.println("Задачи, отсортированные по дате создания");
        allTasks.stream()
                .filter(t -> t.getType().equals(TaskType.READING))
                .sorted(new Comparator<Task>() {
                    @Override
                    public int compare(Task o1, Task o2) {
                        return o1.getCreatedOn().compareTo(o2.getCreatedOn());
                    }
                })
                .forEach(t -> System.out.println(t.getTitle() + " " + t.getCreatedOn()));
        System.out.println();


        //2. Получить список задач, которые уникальны (уникальность проверяйте по полям title и type).
        System.out.println("Уникальные задачи");
        Comparator<Task> comparator = Comparator.comparing((Task t)->t.getTitle())
         .thenComparing(t->t.getType());
//        Set<Task> uniqueTasks = new TreeSet<>(Comparator.comparing((Task t)->t.getTitle())
//                .thenComparing(t->t.getType()));
//
//        allTasks.stream()
//                .forEach( t -> uniqueTasks.add(t));
//        uniqueTasks.stream()
//                .forEach(ut -> System.out.println(ut.getId() + " " + ut.getTitle() + " " + ut.getType()));

        List<Task> uniqueTasks = allTasks.stream()
                .collect(Collectors.groupingBy(task -> task.getTitle()))
                .entrySet().stream().filter(stringListEntry -> stringListEntry.getValue().size()==1)
                .map(stringListEntry -> { return stringListEntry.getValue().get(0); })
                .collect(Collectors.toList());
        uniqueTasks.stream()
                .forEach(ut -> System.out.println(ut.getId() + " " + ut.getTitle() + " " + ut.getType()));


        //3. Найти пять первых задач типа READING, отсортированных по дате создания
        System.out.println("Первые 5 задач READING по дате создания:");
         allTasks.stream()
                .filter(t -> t.getType().equals(TaskType.READING))
                .sorted((o1, o2) -> o1.getCreatedOn().compareTo(o2.getCreatedOn()))
                 .limit(5)
                .forEach(t -> System.out.println(t.getTitle() + " " + t.getCreatedOn()));
        System.out.println();

        //4. Посчитать количество задач, у которых type - CODING.
        System.out.println("Задач типа CODING:");
        System.out.println(allTasks.stream()
                .filter(task -> task.getType().equals(TaskType.CODING))
                .count());
        System.out.println();


        //5. Проверить, у всех ли задач, у которых стоит type READING, есть тег #books
        System.out.println("У всех READING есть тег #books ");
        System.out.println(allTasks.stream()
                .filter(task -> task.getType().equals(TaskType.READING))
                .allMatch(task -> task.getTags().contains("#books")));
        System.out.println();


        //6. Собрать все заголовки задач в единую строку (используйте разделитель ***)
        System.out.println("Все заголовки:");

        List<String> titles = new ArrayList<>();
        allTasks.stream()
                .forEach(task -> titles.add(task.getTitle()));

        System.out.println(titles.stream()
                .collect(Collectors.joining("***")));
    }
}
