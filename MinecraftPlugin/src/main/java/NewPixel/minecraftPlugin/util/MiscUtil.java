package NewPixel.minecraftPlugin.util;

import NewPixel.minecraftPlugin.MinecraftPlugin;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


public class MiscUtil implements Listener {
    private static final MinecraftPlugin instance = MinecraftPlugin.main;
    private static  FileConfiguration config;


    public static void reload() {
        instance.reloadConfig();
        config = instance.getConfig();

    }

    // 暂未应用至项目本体
    // 待日后所需再使用该方法
    // 使用例子:
    // MiscUtil.sendClickableLink(sender, message, link);
    public static void sendClickableLink(CommandSender sender, String message, String link) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            ComponentBuilder cb = new ComponentBuilder(message);
            cb.event(new ClickEvent(ClickEvent.Action.OPEN_URL, link));
            p.spigot().sendMessage(cb.create());
        } else {
            sender.sendMessage(message);
        }
    }

    public static void sendMessage(CommandSender sender, String message) {
        if (message !=null) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        }
    }
}
