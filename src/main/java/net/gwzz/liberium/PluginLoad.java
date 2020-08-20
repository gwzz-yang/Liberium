package net.gwzz.liberium;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

import org.bukkit.plugin.Plugin;


import static net.gwzz.liberium.Main.*;

public class PluginLoad {

  private static File lkgFolder = null;

  public static void loadPlugins() {
    lkgFolder = new File(dataFolder, "lackages");
    if (!lkgFolder.exists()) {
      lkgFolder.mkdirs();
      return;
    }
    if (!lkgFolder.isDirectory()) {
      lkgFolder.delete();
      lkgFolder.mkdirs();
      return;
    }
    Arrays.stream(lkgFolder.listFiles((FilenameFilter) ((f, s) -> s.endsWith(".lkg"))))
    .forEach(f -> {try{
      Plugin p = inst.getPluginLoader().loadPlugin(f);
      server.getPluginManager().enablePlugin(p);
      logger.info("Liberium加载了"+p.getName());
    }
    catch(Exception e){e.printStackTrace();}});
  }

}