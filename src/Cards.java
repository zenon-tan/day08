import java.security.SecureRandom;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Cards {

    private String number;
    private String suite;

    private static final List<String> NUMBERLIST = Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King");
    private static final List<String> SUITELIST = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");

    // Final values can only be set in the constructor

    public Cards() {

        generateDeck();
    }

    public String getNumber() {
        return number;

    }

    public String getSuite() {
        return suite;
    }

    private void getRandomNumber() {

        Random rnd = new SecureRandom();
        int rndNum = rnd.nextInt(NUMBERLIST.size());
        this.number = NUMBERLIST.get(rndNum);

    }

    private String getRandomSuite() {

        Random rnd = new SecureRandom();
        int rndNum = rnd.nextInt(SUITELIST.size());
        return SUITELIST.get(rndNum);

    }

    public String drawCard(List<String> deck) {

        try {

            Random rnd = new SecureRandom();
            int rndNum = rnd.nextInt(deck.size());
            String output = "My card is %s".formatted(deck.get(rndNum));
            deck.remove(rndNum);
            return output;
            
        } catch (IllegalArgumentException e) {
            return "The deck is empty";
        }

    }

    public List<String> generateDeck() {

        List<String> deck = new LinkedList<>();

        for(String num : NUMBERLIST) {
            for(String suite : SUITELIST) {

                String card = "%s of %s".formatted(num, suite);
                deck.add(card);
                //System.out.println(card);

            }
        }

        return deck;
    }

    

    
    
}
