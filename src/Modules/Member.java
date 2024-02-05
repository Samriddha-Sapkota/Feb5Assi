package Modules;

public class Member {
    String name;
    int age;
    int salary;
    int contact;

    public Member(String name, int age, int salary, int contact) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getSalary(int leaves){
        int totalSalary = salary - (leaves * 1000);
        return totalSalary;
    }
}
