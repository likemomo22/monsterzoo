public class EncounterEvent {
    private final ItemsManager itemsManager;
    private final MonsterZukan zukan;

    public EncounterEvent(ItemsManager itemsManager, MonsterZukan zukan) {
        this.itemsManager = itemsManager;
        this.zukan = zukan;
    }

    public void encounterZooStation() {
        System.out.println("ズーstationを見つけた！");
        this.itemsManager.rewardItem();
    }

    public void encouterMonster(UserMonsterManager userMonsterManager) {
        String monster = this.zukan.getRandomMonster();
        System.out.println(monster + "が現れた！");
        for (int i = 0; i < 3 && this.itemsManager.hasBalls(); i++) {
            int roll = this.itemsManager.useBallWithEffect();
            System.out.println(monster + "にボールを投げた");
            if (zukan.isMonsterCaught(monster, roll)) {
                System.out.println(monster + "を捕まえた！");
                userMonsterManager.addUserMonster(monster);
                return;
            } else {
                System.out.println(monster + "に逃げられた！");
            }
        }

    }
}
