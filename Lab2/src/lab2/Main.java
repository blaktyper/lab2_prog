package lab2;
import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {

        Battle battle = new Battle();


        Jirachi jirachi = new Jirachi("\u001B[33m"+"JIRACHI"+ "\u001B[0m", 1);
        Kabutops kabutops = new Kabutops("\u001B[31m"+ "KABUTOPS" + "\u001B[0m", 1);
        Azumarill azumarill = new Azumarill("AZUMARILL", 1);


        Kabuto kabuto = new Kabuto("\u001B[31m" + "KABUTO"+"\u001B[0m", 1);
        Marill marill = new Marill( "\u001B[94m" + "MARILL"+ "\u001B[0m", 1);
        Azurill azurill = new Azurill("\u001B[96m" + "AZUMARILL"+"\u001B[0m", 1);

        battle.addAlly(jirachi);
        battle.addAlly(kabutops);
        battle.addAlly(azumarill);


        battle.addFoe(kabuto);
        battle.addFoe(marill);
        battle.addFoe(azurill);

        battle.go();
    }
}