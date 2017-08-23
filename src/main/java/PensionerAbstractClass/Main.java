package PensionerAbstractClass;

public class Main {
    public static void main(String[] args) {

        Pensioner.runToTheShop(43,7);       //Wywołujemy metodę statyczną

        Grandpa dziadek = new Grandpa();
        dziadek.shoutAtChildren();

        Pensioner babcia = new Grandma();
        babcia.bakeAppleCake();                 //Mimo, że babcia jest typem Pensioner to i tak bakeAppleCake() zostanie wywołany z klasy Grandma
    }
}
