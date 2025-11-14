package move.special;

import ru.ifmo.se.pokemon.*;

public final class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "использует Psychic -------";
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        if (Math.random() <= 0.1) {
            opponent.setMod(Stat.SPECIAL_DEFENSE, -1);
            System.out.println("Special Defense противника понижена! ------- ");
        }
    }
}