package Exceptions;

public class Calculator {

    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        for (int i = 0; i < args.length; i++) {

            try {
                number = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                number = 0;
                System.out.printf("\nWpis na pozycji %d (%s) to nie liczba\n", i, args[i]);
            }
            sum += number;
        }

        System.out.println("Wynik sumowania poprawnie podanych liczb to: " + sum);
    }

}
