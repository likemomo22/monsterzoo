public class MonsterZoo {
    MonsterZukan zukan = new MonsterZukan();
    UserMonsterManager userMonsterManager = new UserMonsterManager();
    EggsManager eggsManager = new EggsManager();
    ItemsManager itemsManager = new ItemsManager(10, 0, eggsManager);
    EncounterEvent encounterEvent = new EncounterEvent(itemsManager, zukan);

    double distance = 0.0;//歩いた距離
    Integer fruits = 0;//ぶつけるとモンスターが捕まえやすくなるフルーツ
    //ユーザがGetしたモンスター一覧
    String userMonster[] = new String[100];


    //呼び出すと1km distanceが増える
    void move() {
        this.distance++;
        eggsManager.updateEggDistances();

        int flg1 = (int) (Math.random() * 10);//0,1の場合はズーstation，7~9の場合はモンスター
        if (flg1 <= 1) {
            encounterEvent.encounterZooStation();
        } else if (flg1 >= 7) {
            encounterEvent.encouterMonster(userMonsterManager);
        }
        eggsManager.hatchEggs(userMonsterManager, zukan);
    }

    public void printStatus() {
        System.out.println("手持ちのボールは" + itemsManager.getBalls() + "個，フルーツは" + itemsManager.getFruits() + "個");
        System.out.println(this.distance + "km歩いた．");
    }

    public String[] getUserMonster() {
        return userMonster;
    }

    public int getBalls() {
        return itemsManager.getBalls();
    }

    public void showCatchMonsters() {
        userMonsterManager.showCatchMonsters();
    }
}
