package RockPaperScissorsSpockLizard;

public enum Symbols {               //Do poszczególnych wartości przypisana jest tablica wyników względem pozostałyc wartości

    PAPER(new int[]{0,1,-1}),
    ROCK(new int[]{-1,0,1}),
    SCISSORS(new int[]{1,-1,0});

    int[] values = new int[3];

    Symbols(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public static Symbols getRandom(){
        return values()[(int)(Math.random() * values().length)];
    }
}