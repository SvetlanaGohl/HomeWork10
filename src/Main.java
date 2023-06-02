public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }


    public static void task1() {
        System.out.println("ЗАДАЧА 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
    }
    public static void task2() {
        System.out.println("ЗАДАЧА 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }


}