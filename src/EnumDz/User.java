package EnumDz;

public class User {
    String fulName;
    int salary;
    Position position;
    User users[];

    public User(String fulName, int salary, Position position) {
        this.fulName = fulName;
        this.salary = salary;
        this.position = position;



    }


    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void getPosition(Position position) {
        if (this.position.toString().toCharArray()[0] == position.toString().toCharArray()[0])
            System.out.println("ИМя " + getFulName() + " Зарплата "  + " Позиция " + getPosition());
    }
}
