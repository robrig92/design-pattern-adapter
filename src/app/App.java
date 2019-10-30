package app;

import app.adapters.SquarePegAdapter;
import app.models.RoundHole;
import app.models.RoundPeg;
import app.models.SquarePeg;

public class App {
    public static void main(String[] args) throws Exception {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(10);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(new SquarePeg(10));

        System.out.println(roundHole.fits(roundPeg));
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}