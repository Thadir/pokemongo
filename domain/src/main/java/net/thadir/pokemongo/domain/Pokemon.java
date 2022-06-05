package net.thadir.pokemongo.domain;

import lombok.NonNull;
import lombok.Value;

import java.util.Optional;

public class Pokemon {
  String name;
  @NonNull
  PokeType type1;
  Optional<PokeType> type2;

  @Value
  class ID {
    @NonNull
    int nationaleditionnumber;
    RegionalDex dex;
    int dexnumber;
  }
}
