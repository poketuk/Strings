public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Egor";
        String middleName = "Sergeevich";
        String lastName = "Veselov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Задание 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }
}