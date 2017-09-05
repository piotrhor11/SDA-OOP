package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        //Zaawansowane OOP, slajd 34

        //Zad 1

        int[] tabInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] tabInteger = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List tabIntL = Arrays.asList(tabInt);
        List tabIntegerL = Arrays.asList(tabInteger);

        //Zad 2

        java.util.ArrayList<String> lista1 = new java.util.ArrayList<String>();
        lista1.add("Konrad");
        lista1.add("Piotrek");
        lista1.add("Paweł");
        lista1.add("Daniel");

        java.util.ArrayList<String> lista2 = new java.util.ArrayList<String>();
        lista2.addAll(lista1);

        // Medival way alternative below :)
//        for (int i = 0; i < lista1.size(); i++) {
//            lista2.add(lista1.get(i));
//        }

        //Zad 3

        java.util.ArrayList<String> lista3 = new java.util.ArrayList<String>();
        lista3.addAll(lista2);
        Collections.reverse(lista3);

        // Medival way alternative below :)
//        for (int i = lista1.size() - 1; i >= 0; i--) {
//            lista3.add(lista1.get(i));
//        }

        //Zad 4
        java.util.ArrayList<String> lista4 = new java.util.ArrayList<String>();
        lista4.addAll(lista2);
        lista4.addAll(lista3);
    }

}
