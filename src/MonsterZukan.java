import java.util.Map;

public class MonsterZukan {
    private final Map<String, Monster> monsterMap;

    public MonsterZukan() {
        this.monsterMap = MonsterData.getMonsters();
    }

    public Monster getRandomMonster() {
        int monsterIndex = (int) (this.monsterMap.size() * Math.random());
        return this.monsterMap.values().stream().skip(monsterIndex).findFirst().orElse(null);
    }

    public boolean isMonsterCaught(String monsterName, int roll) {
        Monster monster = monsterMap.get(monsterName);
        return monster.canCatch(roll);
    }

}
