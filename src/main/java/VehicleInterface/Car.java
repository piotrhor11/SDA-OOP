package VehicleInterface;

public class Car implements IHasFourWheels {

    @Override
    public void smash() {
        System.out.println("Jadę na czołówkę!!!");
    }

    @Override
    public void go() {
        System.out.println("JEDZIEMY!");
    }

    @Override
    public void breakNow() {
        System.out.println("Hamujemy!");
    }

    public void openDoor(){
        breakNow();
        System.out.println("Otwieram drzwi!");
    }

    public int getNumberOfWheels(){
        return NumberOfWheels;
    }

}
