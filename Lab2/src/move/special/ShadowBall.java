package move.special;

import ru.ifmo.se.pokemon.*;

public final class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected String describe() {
        return "использует Shadow Ball --------";
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        if (Math.random() <= 0.2) {
            opponent.setMod(Stat.SPECIAL_DEFENSE, -1);
            System.out.println("Special Defense противника понижена! --------");
        }
    }
}