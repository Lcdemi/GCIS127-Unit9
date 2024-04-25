package unit09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PokemonComparator implements Comparator<Pokemon> {

    @Override
    public int compare(Pokemon p1, Pokemon p2) {
        String p1Name = p1.getName();
        String p2Name = p2.getName();
        return p1Name.compareToIgnoreCase(p2Name);
    }

    public static void main(String[] args) {
        List<Pokemon> pokemon = new ArrayList<>();
        pokemon.add(new Pokemon(7, "Squirtle"));
        pokemon.add(new Pokemon(25, "Pikachu"));
        pokemon.add(new Pokemon(1, "Bulbasaur"));
        pokemon.add(new Pokemon(4, "Charmander"));

        System.out.println(pokemon);
        Collections.sort(pokemon, new PokemonComparator());
        System.out.println(pokemon);
    }
    
}
