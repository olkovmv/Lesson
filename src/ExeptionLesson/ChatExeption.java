package ExeptionLesson;
// exeption он не стал до наследования
// Если хотим создать не обрабатываемое то пишем extend RunTimeexeption
//Если нет то от Exeption

public class ChatExeption  extends  Exception {
    //Можем создаьб необходимые свойства и методы
    // Можем создать свои или переопределить
// Можем переропределять методы родителя (РАсширять их или использовать свою реализацию

    public ChatExeption(String massage){
        super(massage);

    }
    @Override
    public String getMessage() {
        return super.getMessage() + " Следите за кодом!!!";
    }
}
