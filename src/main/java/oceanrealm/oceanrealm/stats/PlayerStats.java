package oceanrealm.oceanrealm.stats;

import java.util.EnumMap;

public class PlayerStats {

    private final EnumMap<StatType, Double> stats = new EnumMap<>(StatType.class);

    public PlayerStats() {

        stats.put(StatType.HEALTH, 100.0);
        stats.put(StatType.DEFENSE, 0.0);
        stats.put(StatType.STRENGTH, 0.0);
        stats.put(StatType.CRIT_CHANCE, 30.0);
        stats.put(StatType.CRIT_DAMAGE, 50.0);
        stats.put(StatType.SPEED, 100.0);

    }

    public double getStat(StatType type) {
        return stats.getOrDefault(type, 0.0);
    }

    public void setStat(StatType type, double value) {
        stats.put(type, value);
    }

    public void addStat(StatType type, double value) {
        stats.put(type, getStat(type) + value);
    }
}