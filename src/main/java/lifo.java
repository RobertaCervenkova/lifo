import java.util.Stack;

public class lifo {
    public static void main(String[] args) {

        Stack<String> stackOfCards = new Stack<>();

        stackOfCards.push("Stôl");
        stackOfCards.push("Stolička");
        stackOfCards.push("Polička");
        stackOfCards.push("Kôš");

        System.out.println("Vypíš: " + stackOfCards);
        System.out.println();

        String cardAtTop = stackOfCards.pop();
        System.out.println("Odstráň slovo(pop): " + cardAtTop);
        System.out.println("Vypíš nový zoznam(stack): " + stackOfCards);

        cardAtTop = stackOfCards.pop();
        System.out.println("Odstráň slovo(pop): " + cardAtTop);
        System.out.println("Vypíš nový zoznam(stack): " + stackOfCards);

    }
}