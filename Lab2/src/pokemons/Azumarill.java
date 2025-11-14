package pokemons;

import ru.ifmo.se.pokemon.*;
import move.status.TailWhip;

public class Azumarill extends Marill {
    public Azumarill(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FAIRY);
        setStats(100, 50, 80, 60, 80, 50);

        TailWhip tailWhip = new TailWhip();

        setMove(blizzard, rest, bellyDrum, tailWhip);
    }
}