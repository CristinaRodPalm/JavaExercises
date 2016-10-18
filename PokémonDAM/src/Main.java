import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pokemon agua1 = new PokemonAgua("gyarados", 40, 14, 28);
        Pokemon agua2 = new PokemonAgua("Squirtle", 1, 1, 1);

        Pokemon fuego1 = new PokemonFuego("Magmar", 52, 39, 60);
        Pokemon fuego2 = new PokemonFuego("Charmander", 2, 2, 2);

        Pokemon planta1 = new PokemonPlanta("Tangela", 33, 29, 70);
        Pokemon planta2 = new PokemonPlanta("Bulbasur", 3, 3, 3);

        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(agua1); pokemons.add(agua2);
        pokemons.add(fuego1); pokemons.add(fuego2);
        pokemons.add(planta1); pokemons.add(planta2);

        for (Pokemon pokemon: pokemons){
            System.out.println(pokemon.toString());
            if(pokemon.Capturable() == true) System.out.println(pokemon.getNombre()+" capturado!!");
            else System.out.println(pokemon.getNombre()+" no capturado :(");
            System.out.println();
        }

        Costipado costi1 = new Costipado();
        Costipado costi2 = new Costipado();

        ArrayList<Capturable> pupurri = new ArrayList<>();
        pupurri.add(agua2); pupurri.add(fuego2); pupurri.add(planta2);
        pupurri.add(costi1); pupurri.add(costi2);

        for(Capturable capturable: pupurri){
            if(capturable.Capturable() == true) System.out.println(capturable+" Se puede capturar");
            else System.out.println(capturable+" No se puede capturar");
        }

    }
}
