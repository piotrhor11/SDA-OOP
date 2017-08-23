package PensionerAbstractClass;

public class Grandpa extends Pensioner {

    @Override
    void shoutAtChildren() {
        System.out.println("Za moich czasów...!!!");
    }

    @Override
    void figthForPlaceInTheBus() {
        System.out.println("Walę laską po nogach.");
    }

    public void lightCigarrete(){
        System.out.println("Palę szluga.");
    }
}
