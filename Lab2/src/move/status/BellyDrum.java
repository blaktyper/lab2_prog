package move.status;

import ru.ifmo.se.pokemon.*;

public final class BellyDrum extends StatusMove {
    public BellyDrum() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует Belly Drum ---------";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        int maxHP = (int) pokemon.getStat(Stat.HP);
        int damage = maxHP / 2;
        pokemon.setMod(Stat.HP, -damage);


        pokemon.setMod(Stat.ATTACK, 6);
        System.out.println(pokemon + " жертвует HP для максимальной атаки!------------");
    }
}