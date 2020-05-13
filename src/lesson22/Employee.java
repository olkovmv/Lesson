package lesson22;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getCompany() {
        return company;
    }

    void setCompany(String company) {
        this.company = company;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getSalary() != employee.getSalary()) return false;
        if (getAge() != employee.getAge()) return false;
        if (getName() != null ? !getName().equals(employee.getName()) : employee.getName() != null) return false;
        return getCompany() != null ? getCompany().equals(employee.getCompany()) : employee.getCompany() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
        result = 31 * result + getSalary();
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
