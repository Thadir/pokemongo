package net.thadir.pokemongo.domain;

/**
 * PokeDex entrie. Here we track the several forms and types (some pokemon have diviating sub forms).
 */
public class Pokedex {
  Pokemon.ID pokemonId;
  boolean    caught;
  boolean    shiny;
  boolean    lucky;
  boolean    shadow;
  boolean    purified;
}
