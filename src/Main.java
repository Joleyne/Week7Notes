// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Storm storm1 = new Storm(39.97,-82.98, 33.3, Direction.EAST);
        storm1.display();

        System.out.println((Storm.numOfStorms));
        ThunderStorm storm2 = new ThunderStorm(139.97, -82.98,35, Direction.NORTH,true);
                storm2.display();

        SharkNato nado1 = new SharkNato(132.23, 35.45, 45, Direction.NORTH,true,15);
        nado1.display();
    }
}