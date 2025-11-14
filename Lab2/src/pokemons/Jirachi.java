package pokemons;

import ru.ifmo.se.pokemon.*;
import move.special.Thunder;
import move.special.Confusion;
import move.special.ShadowBall;
import move.special.Psychic;

public final class Jirachi extends Pokemon {
    public Jirachi(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.PSYCHIC);
        setStats(100, 100, 100, 100, 100, 100);

        Thunder thunder = new Thunder();
        Confusion confusion = new Confusion();
        ShadowBall shadowBall = new ShadowBall();
        Psychic psychic = new Psychic();

        setMove(thunder, confusion, shadowBall, psychic);
    }
}