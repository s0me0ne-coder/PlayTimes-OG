package me.codedred.playtimes.server;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bukkit.Bukkit;

public class ServerManager {

  private static final ServerManager instance = new ServerManager();

  public static ServerManager getInstance() {
    return instance;
  }

  @Nullable
  public UUID getUUID(String name) {
    if(Bukkit.getPlayer(name) != null) {
      return Bukkit.getPlayer(name).getUniqueId();
    } else if(Bukkit.getOfflinePlayer(name) != null) {
      return Bukkit.getOfflinePlayer(name).getUniqueId();
    } else {
      return null;
    }
  }

  @Nullable
  public String getName(UUID uuid) {
     if(Bukkit.getPlayer(uuid) != null) {
      return Bukkit.getPlayer(uuid).getName();
    } else if(Bukkit.getOfflinePlayer(uuid) != null) {
      return Bukkit.getOfflinePlayer(uuid).getName();
    } else {
      return null;
    }
  }
  
}
