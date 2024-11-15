public class EggsManager {
    private final double[] eggDistances = new double[9];
    private final boolean[] eggs = new boolean[9];

    public void updateEggDistances() {
        for (int i = 0; i < this.eggs.length; i++) {//卵は移動距離が進むと孵化するため，何km移動したかを更新する
            if (this.eggs[i] == true) {
                this.eggDistances[i]++;
            }
        }
    }

    public void rewardNewEgg(int eggCount) {
        for (int i = 0; i < eggs.length && i < eggCount; i++) {
            if (!eggs[i]) {
                eggs[i] = true;
                eggDistances[i] = 0.0;
            }
            eggCount--;
        }
    }

    public void hatchEggs(UserMonsterManager userMonsterManager, MonsterZukan monsterZukan) {
        for (int i = 0; i < this.eggs.length; i++) {
            if (this.eggs[i] && this.eggDistances[i] >= 3) {
                System.out.println("卵が孵った！");
                String monster = monsterZukan.getRandomMonster();
                System.out.println(monster + "が産まれた！");

                userMonsterManager.addUserMonster(monster);
                this.eggs[i] = false;
                this.eggDistances[i] = 0.0;
            }
        }

    }
}