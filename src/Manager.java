public class Manager implements Employee{
    private String name;
    private String surname;
    private int experience;
    private double fixedSalary;

    public Manager(String name, String surname, int experience, double fixedSalary) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return this.fixedSalary;
    }

    @Override
    public void showInfo() {
        System.out.println("Сотрудник:");
        System.out.println("Имя: " + this.name);
        System.out.println("Фамилия: " + this.surname);
        System.out.println("Стаж работы: " + this.experience);
        System.out.println("Фиксированная заработная плата: " + this.fixedSalary);
    }

}



