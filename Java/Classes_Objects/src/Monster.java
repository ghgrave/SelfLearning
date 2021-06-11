public class Monster {

  // PRIVATE
  private String name = "The Other";
  private String family;
  private int attack = 50;
  private int defense = 50;
  private int hp = 50;

  // PUBLIC
  public Monster() {
    family = "Chimera";

  }

  public Monster(String name, String family, int attack, int defense, int hp) {
    this.name = name;
    this.family = family;
    this.attack = attack;
    this.defense = defense;
    this.hp = hp;
  }

  public void getStats() {
    System.out.println("----------STATS----------");
    System.out.printf("Name: %s\n", name);
    System.out.printf("Family: %s\n", family);
    System.out.printf("Attack: %s\n", attack);
    System.out.printf("Defense: %s\n", defense);
    System.out.printf("HP: %s", hp);
    System.out.println("\n");
  }

  public int getHp(){
    return hp;
  }

  public int getAttack(){
    return attack;
  }

  public int getDefense(){
    return defense;
  }

  public int updateHp(int hp, int attack, int defense){
    return this.hp = hp - ((attack - defense) < 0 ? 0 : attack - defense);
  

  }

}
