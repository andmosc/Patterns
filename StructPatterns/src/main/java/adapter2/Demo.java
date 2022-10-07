package adapter2;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        RoundPeg smallSqr = new AdapterPegSquare(smallSqPeg);
        RoundPeg largeSqr = new AdapterPegSquare(largeSqPeg);

        if (hole.fits(smallSqr)) {
        System.out.println("Square peg w2 fits round hole r5.");
        }
    }
}
