package NewPixel.minecraftPlugin;

import NewPixel.minecraftPlugin.util.MiscUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftPlugin extends JavaPlugin {

    public static MinecraftPlugin main;

    @Override
    public void onEnable() {
        main = this;
        MiscUtil.reload();
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
