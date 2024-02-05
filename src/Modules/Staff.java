package Modules;

public class Staff extends Member{
    int specialization;

    public Staff(String name, int age, int salary, int contact, int specialization) {
        super(name, age, salary, contact);
        this.specialization = specialization;
    }

    public int getSpecialization() {
        return specialization;
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    public void getsalary(int leaves){
        int salary = super.getSalary(leaves);
        int totalSalary = salary * specialization;
        System.out.println("Total Salary: " + totalSalary);
    }
}
