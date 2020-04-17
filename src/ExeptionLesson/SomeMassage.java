package ExeptionLesson;

public class SomeMassage {
    private String tittle;
    private String text;

    public SomeMassage(String tittle, String text) throws ChatExeption {
       setTittle(tittle);
       setText(text);
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) throws ChatExeption {
        if(tittle.length()<3){throw new ChatExeption("ДЛинна Tittlr не может быть меньше 3");
        }
        this.tittle = tittle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
