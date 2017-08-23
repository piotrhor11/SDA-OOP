package PensionerAbstractClass;

public class Grandma extends Pensioner{

    @Override
    void shoutAtChildren() {
        System.out.println("Zjedz wszystko!!!");
    }

    @Override
    void figthForPlaceInTheBus() {
        System.out.println("Uderzam torebką!");
    }

    @Override
    public void bakeAppleCake() {
        System.out.println("Piekę super szarlotkę!!!");
    }
}
