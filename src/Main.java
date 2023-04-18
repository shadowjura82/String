public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        System.out.println("Задание 2");
        task2();
        System.out.println("Задание 3");
        task3();
    }

    public static String fullNameFunction() {
        String firseName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        return lastName + " " + firseName + " " + middleName;
    }

    public static void task1() {
        String fullName = "ФИО сотрудника — " + fullNameFunction() + "\n";
        System.out.println(fullName);
    }

    public static void task2() {
        String fullName = fullNameFunction().toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName + "\n");
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}