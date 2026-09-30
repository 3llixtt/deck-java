import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Representa el deck (baraja) de 52 cartas de poker.
 * Atributos del Collection Framework:
 *  - cartas: cartas que quedan en el deck.
 *  - removidas: cartas que ya salieron del deck.
 */
public class Deck {
    private static final String[] PALOS = {"tréboles", "corazones", "picas", "diamantes"};
    private static final String[] VALORES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    private final List<Card> cartas = new ArrayList<>();
    private final List<Card> removidas = new ArrayList<>();
    private final Random random = new Random();

    public Deck() {
        for (String palo : PALOS) {
            String color = (palo.equals("corazones") || palo.equals("diamantes")) ? "rojo" : "negro";
            for (String valor : VALORES) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }

    /** Mezcla el deck. */
    public void shuffle() {
        Collections.shuffle(cartas, random);
        System.out.println("Se mezcló el Deck.");
    }

    /** Muestra y remueve la primera carta del deck. */
    public Card head() {
        if (cartas.isEmpty()) {
            System.out.println("El deck está vacío.");
            return null;
        }
        Card carta = cartas.remove(0);
        removidas.add(carta);
        System.out.println(carta);
        System.out.println("Quedan " + cartas.size());
        return carta;
    }

    /** Selecciona al azar una carta y la remueve del deck. */
    public Card pick() {
        if (cartas.isEmpty()) {
            System.out.println("El deck está vacío.");
            return null;
        }
        Card carta = cartas.remove(random.nextInt(cartas.size()));
        removidas.add(carta);
        System.out.println(carta);
        System.out.println("Quedan " + cartas.size());
        return carta;
    }

    /** Regresa un arreglo de cinco cartas y las remueve del deck. */
    public Card[] hand() {
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas en el deck.");
            return new Card[0];
        }
        Card[] mano = new Card[5];
        for (int i = 0; i < 5; i++) {
            mano[i] = cartas.remove(0);
            removidas.add(mano[i]);
            System.out.println(mano[i]);
        }
        System.out.println("Quedan " + cartas.size());
        return mano;
    }
}
