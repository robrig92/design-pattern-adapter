package app.adapters;

import app.models.RoundPeg;
import app.models.SquarePeg;

/**
 * SquarePegAdapter
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}