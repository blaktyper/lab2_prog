package move.special;

import ru.ifmo.se.pokemon.*;

public final class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected String describe() {
        return "использует Blizzard ------ ";
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        if (Math.random() <= 0.1) {
            Effect.freeze(opponent);
            System.out.println(opponent + " заморожен! ------- ");
        }
    }
}