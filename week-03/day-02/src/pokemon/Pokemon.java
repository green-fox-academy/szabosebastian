package pokemon;

public class Pokemon {
  String name;
  String type;
  String effectiveAgainst;

  public Pokemon(String name, String type, String effectiveAgainst) {
    this.name = name;
    this.type = type;
    this.effectiveAgainst = effectiveAgainst;
  }

  boolean IsEffectiveAgainst(Pokemon anotherPokemon) {
    return this.effectiveAgainst.equals(anotherPokemon.type);
  }
}