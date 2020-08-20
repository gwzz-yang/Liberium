package net.gwzz.liberium;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

  public static Main inst = null;
  public static File dataFolder = null;
  public static Server server = null;
  public static Logger logger = null;
  //public static FileConfiguration config = null;

  public Main() {
    inst = this;
  }

  @Override
  public void onEnable() {
    dataFolder = getDataFolder();
    server = getServer();
    logger = getLogger();
    //setupConfig();
    logger.info("Liberium已经加载");
    PluginLoad.loadPlugins();
  }

  @Override
  public void onDisable() {
    logger.info("Liberium已经卸载");
  }

  /*
  private static void setupConfig() {
    File conf = new File(dataFolder, "config.yml");
    if (!conf.exists()) {
      inst.saveResource("config.yml", true);
    }
    config = YamlConfiguration.loadConfiguration(conf);
  }
  */

}
