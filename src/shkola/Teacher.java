package shkola;

public class Teacher extends People implements CanTeach {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void teach(CanLearn child) {
        child.learn();
    }

    @Override
    public void setAge(int age) {
        if (age > 25) {
            this.age = age;
        }
    }
}
