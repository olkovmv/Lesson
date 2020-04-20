package Generic.garage;

public class MarshTaxi extends Bus implements krutPedali{

    public MarshTaxi(String departureSt, String destSt, String num, boolean wiFi) {
        super(departureSt, destSt, num, wiFi);
    }

    private void  scorDost(){
        scorDost();
    }


    @Override
    public void polShtraf() {
        System.out.println("Получить штрафы от ментов");
    }
}
