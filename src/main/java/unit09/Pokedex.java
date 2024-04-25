package unit09;

public class Pokedex {
    private final BinarySearchTree<Pokemon> bst;

    public Pokedex() {
        this.bst = new NodeBST<>();
    }

    public void addPokemon(Pokemon pokemon) {
        bst.insert(pokemon);
    }

    public boolean containsPokemon(Pokemon pokemon) {
        return bst.search(pokemon);
    }

    @Override
    public String toString() {
        return bst.toString();
    }

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.addPokemon(new Pokemon(7, "Squirtle"));
        pokedex.addPokemon(new Pokemon(1, "Bulbasaur"));
        pokedex.addPokemon(new Pokemon(4, "Charmander"));
        pokedex.addPokemon(new Pokemon(2, "Ivysaur"));
        pokedex.addPokemon(new Pokemon(43, "Pikachu"));
        pokedex.addPokemon(new Pokemon(100, "Dugtrio"));
        pokedex.addPokemon(new Pokemon(150, "Moltres"));

        System.out.println(pokedex);

        System.out.println(pokedex.containsPokemon(new Pokemon(7, "Squirtle")));
        System.out.println(pokedex.containsPokemon(new Pokemon(100, "Dugtrio")));

        //false options
        System.out.println(pokedex.containsPokemon(new Pokemon(124, "Cloyster")));
        System.out.println(pokedex.containsPokemon(new Pokemon(100, "Diglett")));
        System.out.println(pokedex.containsPokemon(new Pokemon(101, "Dugtrio")));
    }
}
