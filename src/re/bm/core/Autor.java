package re.bm.core;

public class Autor {
    //Свойства
    private String name;
    private String surname;

    //Геттер - метод   - возвращает значение свойства
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    //Сеттеры  - Когда мы присваиваем значению свойство
    public void setSurname(String surname) {   //Имя метода и аргумент
        this.surname = surname;   // а тут сам метод


    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name; ///this этор сссылка на текущий обьект



    }
}

// Lkbyyf jn lde[ xbvdjkjd
//!"".equals(name)
// name != null




//return - Прекращает работу метода, после него нич


// void ничего не возвращает вообще но return можно использовать тоб прервать методј