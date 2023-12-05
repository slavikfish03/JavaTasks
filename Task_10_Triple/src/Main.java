import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Triple<Integer> triple = new Triple<>(1, 2, 3);
        System.out.println(triple.toString());
        System.out.println("Elements of triple: ");
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());

        Triple<Integer> triple2 = new Triple<>(1, 2, 3);
        System.out.println("Are triple and triple 2 equal? : " + triple.equals(triple2));

        Triple<Integer> triple3 = new Triple<>(1, 20, 3);
        System.out.println("Are triple and triple 3 equal? : " + triple.equals(triple3));

        System.out.println("Minimum triple: " + triple.min());
        System.out.println("Maximum triple: " + triple.max());
        System.out.println("Mean triple: " + triple.mean());

        Color color1 = new Color(1, 2, 3);
        Color color2 = new Color(24, 87, 90);
        Color color3 = new Color(235, 210, 98);

        Triple<Color> triple_color = new Triple<>(color1, color2, color3);
        Triple<String> triple_string = new Triple<>("a", "b", "c");
        // java.lang.RuntimeException: The minimum is impossible to calculate
        // System.out.println(triple_color.min());

    }
}