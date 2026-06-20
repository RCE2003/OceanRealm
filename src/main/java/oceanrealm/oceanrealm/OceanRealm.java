package oceanrealm.oceanrealm;
import oceanrealm.oceanrealm.listener.PlayerJoinListener;
import oceanrealm.oceanrealm.manager.PlayerManager;
import org.bukkit.plugin.java.JavaPlugin;

public class OceanRealm extends JavaPlugin {

    private static OceanRealm instance;

    private PlayerManager playerManager;

    @Override
    public void onEnable() {

        instance = this;

        // Manager initialisieren
        playerManager = new PlayerManager();

        // Listener registrieren
        getServer().getPluginManager().registerEvents(
                new PlayerJoinListener(),
                this
        );

        getLogger().info("OceanRealm enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("OceanRealm disabled!");
    }

    public static OceanRealm getInstance() {
        return instance;
    }

    public PlayerManager getPlayerManager() {
        return playerManager;
    }
}