public class Main {
    public static void main(String[] args) {
        System.out.println(" Task 1");
        task1();
        System.out.println(" Task 2");
        task2();
        System.out.println(" Task 3");
        task3();
    }
    public static void task1(){
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
    }
    public static void task2(){
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.replace("Ivanov Ivan Ivanovich","IVANOV IVAN IVANOVICH");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);
    }
    public static void task3(){
        String fullName = "Иванов Семён Семёнович";
        for (int i = 0; i < fullName.length(); i++){
            if (fullName.charAt(i) == 'ё'){
                fullName = fullName.replace("ё", "е");
            }
        }
        System.out.println("Данные ФИО сотрудника — "+fullName);
    }
}