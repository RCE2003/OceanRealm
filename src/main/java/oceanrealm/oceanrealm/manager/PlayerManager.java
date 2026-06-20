package oceanrealm.oceanrealm.manager;

import oceanrealm.oceanrealm.player.PlayerData;

import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {

    private final HashMap<UUID, PlayerData> players = new HashMap<>();

    public PlayerData getPlayer(UUID uuid) {
        return players.computeIfAbsent(uuid, PlayerData::new);
    }

    public void removePlayer(UUID uuid) {
        players.remove(uuid);
    }
}