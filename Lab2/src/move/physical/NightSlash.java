package move.physical;

import ru.ifmo.se.pokemon.*;

public final class NightSlash extends PhysicalMove {
    public NightSlash() {
        super(Type.DARK, 70, 100);
    }

    @Override
    protected String describe() {
        return "использует Night Slash ---------";
    }

    @Override
    protected double calcCriticalHit(Pokemon attacker, Pokemon defender) {
       
        return super.calcCriticalHit(attacker, defender) * 2;
    }
}
