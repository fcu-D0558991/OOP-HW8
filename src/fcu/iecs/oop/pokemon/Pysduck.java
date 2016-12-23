package fcu.iecs.oop.pokemon;

import fcu.iecs.oop.pokemon.Pokemon;

public class Pysduck extends Pokemon {

	public Pysduck(String nickName, PokemonType type, int cp) {
		super(nickName, type, cp);
	}

	@Override
	public void attack() {
	System.out.println("Aqua Tail...");

	}

}
