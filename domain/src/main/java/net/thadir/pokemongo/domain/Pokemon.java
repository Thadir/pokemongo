package net.thadir.pokemongo.domain;

import lombok.NonNull;
import lombok.Value;

import java.util.Optional;

/**
 * This represents the base information we have on Pokémon. This does not represent your Pokémon dex. We got a nother implementation for that.
 */
public class Pokemon {
  String name;
  @NonNull PokeType type1;
  Optional<PokeType> type2;

  Integer attack;
  Integer degense;
  Integer Stamina;

  Gender[] geners;

  @Value
  class ID {
    @NonNull int nationaleditionnumber;
    RegionalDex dex;
    int         dexnumber;
  }
}
