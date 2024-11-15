public class MonsterZukan {
    private final String[] monsterNames;
    private final double[] monsterRares;

    public MonsterZukan() {
        this.monsterNames = MonsterData.getMonsterNames();
        this.monsterRares = MonsterData.getMonsterRares();
    }

    public String getRandomMonster() {
        int monsterIndex = (int) (this.monsterNames.length * Math.random());
        return this.monsterNames[monsterIndex];
    }

    public boolean isMonsterCaught(String monster, int roll) {
        int monsterIndex = getMonsterIndex(monster);
        return monsterRares[monsterIndex] <= roll;
    }

    private int getMonsterIndex(String monster) {
        for (int i = 0; i < monsterNames.length; i++) {
            if (monsterNames[i].equals(monster)) {
                return i;
            }
        }
        return -1;
    }
}
