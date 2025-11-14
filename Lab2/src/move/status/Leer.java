package move.status;

import ru.ifmo.se.pokemon.*;

public final class Leer extends StatusMove {
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "использует Leer----------";
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        opponent.setMod(Stat.DEFENSE, -1);
        System.out.println("Defense противника понижена!-----------");
    }
}
