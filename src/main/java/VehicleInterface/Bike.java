package VehicleInterface;

public class Bike implements IHasTwoWheels {

    @Override
    public void fall() {
        System.out.println("O kurcze, chyba muszę się wyp*****lić!!!");
    }

    @Override
    public void go() {
        System.out.println("Jadę!");
    }

    @Override
    public void breakNow() {
        System.out.println("Hamuję!!!");
    }
}
