package unit09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pokemon implements Comparable<Pokemon> {
    private final int number;
    private String name;

    public Pokemon(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getNumber() + ": " + getName();
    }

    @Override
    public int compareTo(Pokemon other) {
        if (this.number < other.number) {
            return -1;
        } else if (this.number > other.number) {
            return 1;
        } else {
            return this.name.compareTo(other.name);
        }
    }

    public static void main(String[] args) {
        List<Pokemon> pokemon = new ArrayList<>();
        pokemon.add(new Pokemon(7, "Squirtle"));
        pokemon.add(new Pokemon(1, "Bulbasaur"));
        pokemon.add(new Pokemon(4, "Charmander"));

        System.out.println(pokemon);
        Collections.sort(pokemon);
        System.out.println(pokemon);
    }
    
}
