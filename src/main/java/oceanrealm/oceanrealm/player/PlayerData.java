package oceanrealm.oceanrealm.player;

import oceanrealm.oceanrealm.stats.PlayerStats;

import java.util.UUID;

public class PlayerData {

    private final UUID uuid;
    private final PlayerStats stats;

    public PlayerData(UUID uuid) {
        this.uuid = uuid;
        this.stats = new PlayerStats();
    }

    public UUID getUuid() {
        return uuid;
    }

    public PlayerStats getStats() {
        return stats;
    }
}