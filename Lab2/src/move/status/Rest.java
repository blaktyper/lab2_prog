package move.status;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует Rest------------";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect restEffect = new Effect().turns(2).condition(Status.SLEEP);
        pokemon.restore();
        pokemon.addEffect(restEffect);
        System.out.println(pokemon + " восстановил здоровье и уснул!------------");
    }
}