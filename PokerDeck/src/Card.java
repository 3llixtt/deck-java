/**
 * Representa una carta de poker.
 */
public class Card {
    private final String palo;   // tréboles, corazones, picas o diamantes
    private final String color;  // rojo o negro
    private final String valor;  // 2 al 10, A, J, Q o K

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}
