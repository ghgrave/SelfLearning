public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\tMonster Maker\n");
        Monster monster = new Monster();
        monster.getStats();
        Monster monster1 = new Monster("Dracula", "vampire", 100, 75, 125);
        monster1.getStats();
        int newHp = monster1.updateHp(monster1.getHp(), monster1.getAttack(), monster1.getDefense());
        System.out.println(newHp);
        newHp = monster1.updateHp(monster1.getHp(), monster1.getAttack(), monster1.getDefense());
        System.out.println(newHp);
        newHp = monster1.updateHp(monster1.getHp(), monster1.getAttack(), monster1.getDefense());
        System.out.println(newHp);
    }
}
