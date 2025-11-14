package pokemons;

import ru.ifmo.se.pokemon.*;
import move.status.BellyDrum;

public class Marill extends Azurill {

    protected BellyDrum bellyDrum;

    public Marill(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FAIRY);
        setStats(70, 20, 50, 20, 50, 40);

        this.bellyDrum = new BellyDrum();


        setMove(blizzard, rest, bellyDrum);
    }
}