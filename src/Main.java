import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Cards card = new Cards();

        List<String> deck = card.generateDeck();
        System.out.println(deck);
        System.out.println(deck.size());

        for(int i = 0; i < 51; i++) {
            System.out.println(card.drawCard(deck));

        }

        

        System.out.println(card.drawCard(deck));
        System.out.println(card.drawCard(deck));

        //System.out.println(deck);
        System.out.println(deck.size());
    }
    
}
