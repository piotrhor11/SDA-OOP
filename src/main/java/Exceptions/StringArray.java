package Exceptions;

public class StringArray {

    String[] stringArray = new String[]{"Konrad", "Piotrek", "Paweł", "Daniel"};

    public static void main(String[] args) {

        //

        try {
            String string = args[0];
            System.out.println();       //ToDo
        } catch (NullPointerException e) {
            System.out.println("Jest mi bardzo przykro :(");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nic nie podałeś!");
        }

    }

    public String findString(String string) {

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(string)) {
                return string;
            }
        }
        NullPointerException e = new NullPointerException("Nie znalazłem szukanego elementu.");
        throw e;
    }
}
