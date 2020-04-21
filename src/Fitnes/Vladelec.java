package Fitnes;

public class Vladelec {
    protected String name;
    protected String surname;
    protected String birthday;
    protected String startDate;
    protected String finishedDate;


    public Vladelec() {
    }

    public Vladelec(String name, String surname, String birthday, String startDate, String finishedDate) {
        setName(name);
        setSurname(surname);
        setBirthday(birthday);
        setStartDate(startDate);
        setFinishedDate(finishedDate);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(String finishedDate) {
        this.finishedDate = finishedDate;
    }
}
