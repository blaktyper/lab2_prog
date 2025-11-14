package pokemons;

import ru.ifmo.se.pokemon.*;
import move.status.DoubleTeam;
import move.status.Leer;
import move.physical.Facade;

public class Kabuto extends Pokemon { // УБРАЛИ final

    protected DoubleTeam doubleTeam;
    protected Leer leer;
    protected Facade facade;

    public Kabuto(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.WATER);
        setStats(30, 80, 90, 55, 45, 55);

        this.doubleTeam = new DoubleTeam();
        this.leer = new Leer();
        this.facade = new Facade();

        setMove(doubleTeam, leer, facade);
    }
}