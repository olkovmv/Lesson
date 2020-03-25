package shkola;

public class Schoolboy extends People implements CanLearn {
    private String subject;
    private int level;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void learn() {
        level += 2;
    }


}
