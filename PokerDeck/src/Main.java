public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("--- shuffle ---");
        deck.shuffle();

        System.out.println("--- head ---");
        deck.head();

        System.out.println("--- pick ---");
        deck.pick();

        System.out.println("--- hand ---");
        deck.hand();
    }
}
