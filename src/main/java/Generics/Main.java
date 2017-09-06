package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scarf szalik = new Scarf("Szaliczek", 3, "Niezwykły szaliczek w kratkę");
        Suitcase<Scarf> suitcase = new Suitcase<>();    //Od teraz suitcase przyjmuje tylko obiekty typu Strapon
        suitcase.setThing(szalik);

        System.out.println("Name: " + suitcase.getName());
        System.out.println("Size: " + suitcase.getSize());
        System.out.println("Tag: " + suitcase.getTag());
        System.out.println();

        FruitBasket<IFruit> basket = new FruitBasket<>();
        Banana banana = new Banana();
        Apple apple = new Apple();
        basket.addThing(banana);
        basket.addThing(apple);

        List<IFruit> fruits = new ArrayList<>();
        fruits = basket.getThings();

        System.out.println("Eating from basket:");
        for (IFruit fruit : fruits) {
            fruit.eat();
        }

    }
}
