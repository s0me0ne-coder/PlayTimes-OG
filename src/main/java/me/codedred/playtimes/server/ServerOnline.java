package me.codedred.playtimes.server;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bukkit.Bukkit;

public class ServerOnline{

  @Nullable
  public static UUID getUUID(String name) {
    return Bukkit.getPlayer(name).getUniqueId();
  }
  @Nullable
  public static String getName(UUID uuid) {
    return Bukkit.getPlayer(uuid).getName();
  }
}
