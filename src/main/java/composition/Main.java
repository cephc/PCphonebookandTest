package composition;

public class Main {
    public static void main(String[] args) {

        Dimension d = new Dimension(5,4,9);

        Case c = new Case("Dell", "hyper 8000", "external", new Dimension(3,4,5));

        Resolution r = new Resolution(7,8);

        Monitor m = new Monitor("Acer", "turbo 3000", 34, new Resolution(8,9));

        MotherBoard o = new MotherBoard("Apple", "MAC", 6, 9, "i dont even know");

        PC computer = new PC(o, c, m);

        computer.powerUp();


    }
}
