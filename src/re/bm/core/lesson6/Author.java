package re.bm.core.lesson6;

public class Author {
    // свойства
    private String name;
    private String surname;

    // методы
    public void setName(String name) {
        // длина от 2 символов
//      !"".equals(name)
//        name != null
        if (name.length() >= 2) {
            this.name = name;
        }
//        return;
    }
    // метод геттер - возвращает значение свойства
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
