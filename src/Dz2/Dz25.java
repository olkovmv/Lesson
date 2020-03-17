package Dz2;

public class Dz25 {
    public static void main(String[] args) {
        String[] slovar = {"hot", "dot", "dog", "log", "lot"};
        String firSlov = "hit";
        String SecSlov = "cog";
        System.out.println("Из слова hit в слово " + firSlov.replace("i", "o").replace("h","d")
        .replace("t","g").replace("d","l").replace("g","t")
                .replace("t","g").replace("l", "d").replace("d","c"));
    }
}
/// Я тут немного заборщил. Дошел до конца и обратно ушел