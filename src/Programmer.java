public class Programmer implements Employee{
    private String name;
    private String surname;
    private int experience;
    private double hourlyRate;

    public Programmer(String name, String surname, int experience, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return this.experience * this.hourlyRate * 20;
    }

    @Override
    public void showInfo() {
        System.out.println("Сотрудник:");
        System.out.println("Имя: " + this.name);
        System.out.println("Фамилия: " + this.surname);
        System.out.println("Стаж работы: " + this.experience);
        System.out.println("Часовая ставка: " + this.hourlyRate);
        System.out.println("Заработная плата: " + this.calculateSalary());
    }
}
