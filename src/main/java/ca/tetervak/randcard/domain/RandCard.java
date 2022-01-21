// Alex Tetervak, Sheridan College, Ontario

package ca.tetervak.randcard.domain;

public class RandCard {

    private final static String[] SUITS
            = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private final static String[] FACES
            = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    final private int number;
    final private String name;

    public RandCard(){
        int rand = (int) (52 * Math.random());
        name = FACES[rand % 13] + " of " + SUITS[rand / 13];
        number = rand + 1;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
