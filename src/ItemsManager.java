public class ItemsManager {
    private final EggsManager eggsManager;
    private Integer balls;
    private Integer fruits;

    public ItemsManager(Integer initBalls, Integer initFruits, EggsManager eggsManager) {

        this.balls = initBalls;
        this.fruits = initFruits;
        this.eggsManager = eggsManager;
    }

    public void rewardItem() {
        int b = (int) (Math.random() * 3);//ball,fruits,eggがランダムに出る
        int f = (int) (Math.random() * 2);
        int e = (int) (Math.random() * 2);
        System.out.println("ボールを" + b + "個，" + "フルーツを" + f + "個" + "卵を" + e + "個Getした！");
        this.balls = this.balls + b;
        this.fruits = this.fruits + f;
        if (e >= 1) {//卵を1つ以上Getしたら
            //egg[]に10個以上卵がない場合は新しい卵データをセットする
            this.eggsManager.rewardNewEgg(e);
        }
    }

    public int getBalls(){
        return this.balls;
    }

    public boolean hasBalls() {
        return this.balls > 0;
    }

    public int useBallWithEffect() {
        this.balls--;
        int roll = (int) (6 * Math.random());//0~5までの数字をランダムに返す
        if (this.fruits > 0) {
            System.out.println("フルーツを投げた！捕まえやすさが倍になる！");
            this.fruits--;
            roll = roll * 2;
        }

        return roll;
    }

    public int getFruits() {
        return fruits;
    }
}
