package RockPaperScissorsSpockLizard;

import java.util.Scanner;                   //ToDo Spock i Lizard

public class Game {                       //ToCheck: Kuba, widzisz tu jakieś nieprawidłowości lub miejsce na optymalizację?

    private boolean endOfGame = false;
    private Scanner playerInput = new Scanner(System.in);
    private String playerChoice;
    private Symbols playerSymbol;
    private Symbols computerSymbol;
    private int computerWins;
    private int playerWins;


    public void startGame() {

        while(!endOfGame) {
            askPlayerForSymbol();                                  //Wybór gracza
            if(!endOfGame) {
                computerSymbol = Symbols.getRandom();              //Wybór komputera
                System.out.printf("Computer has chosen %s\n", computerSymbol);
                play(playerSymbol, computerSymbol);                 //Porównanie wyników
            }
        }
        showStatisctic();
    }

    private void askPlayerForSymbol() {
        do {
            System.out.println("Make your choice (p,r,s) or quit (q): ");
            playerChoice = playerInput.next();

            switch(playerChoice.charAt(0)){
                case 'p':
                    playerSymbol = Symbols.PAPER;
                    break;
                case 'r':
                    playerSymbol = Symbols.ROCK;
                    break;
                case 's':
                    playerSymbol = Symbols.SCISSORS;
                    break;
                case 'q':
                    endOfGame = true;
                    return;
                default:
                    System.out.println("Not allowed symbol, try again!");
                    playerChoice = "";
            }
        }while(playerChoice.length()!=1);                   //Żądamy od użytkownika podania 1 symbolu

        System.out.printf("You have chosen %s\n",playerSymbol);
    }

    private void play(Symbols playerSymbol, Symbols computerSymbol) {
        int[] result = playerSymbol.getValues();                        //Bieżemy tablicę wyników dla wyboru gracza
        int index = computerSymbol.ordinal();                           //ustawiamy index w zależności od wyboru komputera
        if(result[index]>0){
            playerWins++;
            System.out.printf("You have won!\n");
        }else if (result[index]<0){
            computerWins++;
            System.out.printf("Computer has won!\n");
        }else{
            System.out.printf("It's a draw!\n");
        }
    }

    private void showStatisctic() {
        System.out.printf("\nComputer has won %d times and you %d times.", computerWins, playerWins);
    }

}
