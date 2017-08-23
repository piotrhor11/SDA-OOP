package VehicleInterface;

public class Main {
    public static void main(String[] args) {

        IVehicle samochod1 = new Car();
        samochod1.go();
                                                //Polimorfizm: samochod1 i samochod2 sa obiektami tej samej klasy ale widziane jako różne typy
        Car samochod2 = new Car();
        samochod2.go();
        samochod2.openDoor();

        System.out.printf("Liczba kół %d",samochod2.getNumberOfWheels());

    }
}
