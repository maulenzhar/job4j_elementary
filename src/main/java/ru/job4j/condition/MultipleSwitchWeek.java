package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "monday" -> 1;
            case "Вторник", "tuesday" -> 2;
            case "Среда", "wednesday" -> 3;
            case "Четверг", "thursday" -> 4;
            case "Пятница", "friday" -> 5;
            case "Суббота", "saturday" -> 6;
            case "Воскресенье", "sunday" -> 7;
            default -> -1;
        };
    }
}
