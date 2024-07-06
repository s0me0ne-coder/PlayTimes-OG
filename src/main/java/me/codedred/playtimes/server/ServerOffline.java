package me.codedred.playtimes.server;
import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bukkit.Bukkit;

public class ServerOffline {

  @Nullable
  public static UUID getUUID(String name) {
    return Bukkit.getOfflinePlayer(name).getUniqueId();
  }
  @Nullable
  public static String getName(UUID uuid) {
    return Bukkit.getOfflinePlayer(uuid).getName();
  }
}
