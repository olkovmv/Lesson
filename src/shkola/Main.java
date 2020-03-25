package shkola;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setSubject("Химия");

        Schoolboy schoolboy = new Schoolboy();
        schoolboy.setAge(7);
        schoolboy.setSubject("Химия");

        Schoolboy schoolboy1 = new Schoolboy();
        schoolboy1.setAge(8);
        schoolboy1.setSubject("Физика");

        Director director = new Director();
        director.setAge(40);

        School schoolName = new School("Средняя школа", director);
        schoolName.addSchoolboy(schoolboy);
        schoolName.addSchoolboy(schoolboy1);
        schoolName.addTeacher(teacher);

        schoolName.schoolDay();
    }
}
