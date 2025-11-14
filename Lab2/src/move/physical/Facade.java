package move.physical;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "использует Facade ------- ";
    }

    @Override
    protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
        double damage = super.calcBaseDamage(attacker, defender);


        if (attacker.getCondition() == Status.BURN ||
                attacker.getCondition() == Status.POISON ||
                attacker.getCondition() == Status.PARALYZE) {
            damage *= 2;
            System.out.println("Facade наносит двойной урон из-за статуса! ----------");
        }
        return damage;
    }
}