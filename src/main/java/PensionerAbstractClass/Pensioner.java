package PensionerAbstractClass;

public abstract class Pensioner implements IAppleCake {
    public static final int NUMBER_OF_EYES = 2;

    abstract void shoutAtChildren();
    abstract void figthForPlaceInTheBus();

    public static void runToTheShop(int distance, int speed){
        double time = (double)distance/speed;
        System.out.println("Biegnę po kiełbase, będę za " + time);
    }

    @Override
    public void bakeAppleCake() {
        System.out.println("Piekę nijaką szarlotkę.");
    }
}
