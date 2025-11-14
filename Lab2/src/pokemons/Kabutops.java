package pokemons;

import ru.ifmo.se.pokemon.*;
import move.physical.NightSlash;

public class Kabutops extends Kabuto { // УБРАЛИ final
    public Kabutops(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.WATER);
        setStats(60, 115, 105, 65, 70, 80);

        NightSlash nightSlash = new NightSlash();


        setMove(doubleTeam, leer, facade, nightSlash);
    }
}