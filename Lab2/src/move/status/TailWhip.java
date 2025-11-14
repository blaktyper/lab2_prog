package move.status;

import ru.ifmo.se.pokemon.*;

public final class TailWhip extends StatusMove {
    public TailWhip() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "использует Tail Whip------------";
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        opponent.setMod(Stat.DEFENSE, -1);
        System.out.println("Defense противника понижена!------------");
    }
}
