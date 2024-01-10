public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Иван", "Иванов", 10, 200);
        System.out.println(programmer.calculateSalary());
        programmer.showInfo();

        Manager manager = new Manager("Василий", "Петров", 20, 3000);
        System.out.println(manager.calculateSalary());
        manager.showInfo();

    }
}
