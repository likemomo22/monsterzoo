public class UserMonsterManager {
    private final String[] userMonsters = new String[100];

    public void addUserMonster(String monster) {
        for (int m = 0; m < userMonsters.length; m++) {
            if (userMonsters[m] == null) {
                userMonsters[m] = monster;
                break;
            }
        }
    }

    public void showCatchMonsters() {
        for (int i = 0; i < userMonsters.length; i++) {
            if (userMonsters[i] != null) {
                System.out.println(userMonsters[i] + "を捕まえた．");
            }
        }
    }
}