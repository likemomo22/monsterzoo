public class Monster {
    private final String name;
    private final int rare;

    public Monster(String name, int rare) {
        this.name = name;
        this.rare = rare;
    }

    public boolean canCatch(int r) {
        return rare <= r;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
