package lesson15.task;

public class Customer {
    private String name;
    private String uuid;
    private int age;

    public Customer(String name, String uuid, int age) {
        this.name = name;
        this.uuid = uuid;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (age != customer.age) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return uuid != null ? uuid.equals(customer.uuid) : customer.uuid == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                ", age=" + age +
                '}';
    }
}
