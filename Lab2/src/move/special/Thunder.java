package move.special;

import ru.ifmo.se.pokemon.*;

public final class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected String describe() {
        return "использует Thunder --------";
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        if (Math.random() <= 0.3) {
            Effect.paralyze(opponent);
            System.out.println(opponent + " парализован! --------");
        }
    }
}