import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

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
        Monster monster = this.zukan.getRandomMonster();
        System.out.println(monster + "が現れた！");

        AtomicBoolean caught = new AtomicBoolean(false);

        IntStream.range(0, 3)
                .takeWhile(i -> itemsManager.hasBalls() && !caught.get())
                .forEach(i -> {
                    int roll = this.itemsManager.useBallWithEffect();
                    System.out.println(monster + "にボールを投げた");
                    if (zukan.isMonsterCaught(monster.getName(), roll)) {
                        System.out.println(monster + "を捕まえた！");
                        userMonsterManager.addUserMonster(monster.getName());
                        caught.set(true);
                    } else {
                        System.out.println(monster + "に逃げられた！");
                    }
                });
    }
}
