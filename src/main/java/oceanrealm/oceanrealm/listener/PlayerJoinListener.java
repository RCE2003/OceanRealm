package oceanrealm.oceanrealm.listener;

import oceanrealm.oceanrealm.OceanRealm;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        OceanRealm.getInstance()
                .getPlayerManager()
                .getPlayer(event.getPlayer().getUniqueId());

    }
}