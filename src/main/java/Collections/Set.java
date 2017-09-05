package Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {

        //Zaawansowane OOP, slajd 37

        //Zad 1

        TreeSet<String> zbiorImion = new TreeSet<String>();
        zbiorImion.add("Konrad");
        zbiorImion.add("Piotek");
        zbiorImion.add("Paweł");
        zbiorImion.add("Daniel");

        for (String s : zbiorImion) {
            System.out.println(s);
        }

//        Iterator<String> iterator = zbiorImion.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


        //Zad 2
        System.out.println();
        HashSet<String> raw2 = new HashSet<String>();
        raw2.add("Sławek");
        raw2.add("Lukasz");
        raw2.add("Damian");
        raw2.add("Wojtek");
        raw2.add("Paweł");

        HashSet<String> raw3 = new HashSet<String>();
        raw3.add("Konrad");
        raw3.add("Piotrek");
        raw3.add("Paweł");
        raw3.add("Daniel");

        HashSet<String> samePeople = new HashSet<String>();
        samePeople = raw2;
        samePeople.retainAll(raw3);
        System.out.println(samePeople);

        //Zad 3

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(4);
        ts.add(7);
        Integer number = ts.ceiling(5);
        System.out.println(number);

    }

}
