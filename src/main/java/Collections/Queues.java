package Collections;

import java.util.ArrayDeque;

public class Queues {

    public static void main(String[] args) {

//        Queue<QueuesPerson> line = new ArrayDeque<>();
        ArrayDeque<QueuesPerson> line = new ArrayDeque<>();

        line.add(new QueuesPerson("Konrad", "Szlugi o smaku soku z ziemniaków"));
        line.add(new QueuesPerson("Paweł", "Dwa chomiki, mały chomiczy toporek, małą chomiczą dzidę i małą chomiczą arenę do chomiczych walk"));
        line.add(new QueuesPerson("Piotrek", "Kawa o smaku herbaty ze smalcem"));
        line.add(new QueuesPerson("Daniel", "Pierogi z jarzębiną"));

        while (!line.isEmpty()) {
            QueuesPerson currentClient = line.removeFirst();
            System.out.println(currentClient.getName());
            System.out.println(currentClient.getShoppingList());
        }


    }

}
