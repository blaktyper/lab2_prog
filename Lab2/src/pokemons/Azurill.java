package pokemons;

import ru.ifmo.se.pokemon.*;
import move.special.Blizzard;
import move.status.Rest;

public class Azurill extends Pokemon {

    protected Blizzard blizzard;
    protected Rest rest;

    public Azurill(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FAIRY);
        setStats(50, 20, 40, 20, 40, 20);

        this.blizzard = new Blizzard();
        this.rest = new Rest();

        setMove(blizzard, rest);
    }
}