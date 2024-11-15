import java.util.stream.IntStream;

public class EggsManager {
    private final double[] eggDistances = new double[9];
    private final boolean[] eggs = new boolean[9];

    public void updateEggDistances() {
        IntStream.range(0, eggs.length)
                .filter(i->eggs[i])
                .forEach(i->eggDistances[i]++);
    }

    public void rewardNewEgg(int eggCount) {
        IntStream.range(0,eggs.length)
                .filter(i->!eggs[i])
                .limit(eggCount)
                .forEach(i->{
                    eggs[i]=true;
                    eggDistances[i]=0.0;
                });
    }

    public void hatchEggs(UserMonsterManager userMonsterManager, MonsterZukan monsterZukan) {
        IntStream.range(0,eggs.length)
                .filter(i->eggs[i]&&eggDistances[i]>=3)
                .forEach(i->{
                    System.out.println("卵が孵った！");
                    Monster monster = monsterZukan.getRandomMonster();
                    System.out.println(monster + "が産まれた！");

                    userMonsterManager.addUserMonster(monster.getName());
                    this.eggs[i] = false;
                    this.eggDistances[i] = 0.0;
                });
    }
}