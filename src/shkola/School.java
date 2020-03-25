package shkola;

public class School {
    private final String schoolName;
    private Director director;

    private Schoolboy[] schoolboys = new Schoolboy[3];
    private Teacher[] teachers = new Teacher[3];

    public School(String schoolName, Director director) {
        this.schoolName = schoolName;
        this.director = director;
    }
    public void schoolDay (){
        director.beginLessons();
        for (Teacher c: teachers) {
            if (c != null) {
                for (Schoolboy g: schoolboys) {
                    if (g != null) {
                        if (c.getSubject().equals(g.getSubject())) {
                            c.teach(g);
                        }
                    }
                }
            }
        }
        director.endLessons();
    }
    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
            }
        }
    }
    public void addSchoolboy(Schoolboy schoolboy) {
        for (int i = 0; i < schoolboys.length; i++) {
            if (schoolboys[i] == null) {
                schoolboys[i] = schoolboy;
            }
        }
    }
}
