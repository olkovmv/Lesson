package Generic;
// <> неоюходимо указать что в классе будет использоваться generic mun

// Вместо T может быть лбаяч букава
public class User<T> { //   если надо определить тип данных поля в момент создания обьекта
    // То используем generic mun
    private T id;
    private String login;
    private String pwn;



    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwn() {
        return pwn;
    }

    public void setPwn(String pwn) {
        this.pwn = pwn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pwn='" + pwn + '\'' +
                '}';
    }
}

