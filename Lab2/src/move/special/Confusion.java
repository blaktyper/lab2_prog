package move.special;

import ru.ifmo.se.pokemon.*;

public final class Confusion extends SpecialMove {
    public Confusion() {
        super(Type.PSYCHIC, 50, 100);
    }

    @Override
    protected String describe() {
        return "использует Confusion --------";
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        if (Math.random() <= 0.1) {
            Effect.confuse(opponent);
            System.out.println(opponent + " сбит с толку! --------");
        }
    }
}