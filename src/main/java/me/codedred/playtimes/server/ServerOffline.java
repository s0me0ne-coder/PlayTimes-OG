package me.codedred.playtimes.server;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.Bukkit;

public class ServerOffline implements ServerStatus {

  @Override
  @Nullable
  public UUID getUUID(String name) {
    return Bukkit.getOfflinePlayer(name).getUniqueId();
  }

  @Override
  public boolean isOnline() {
    return false;
  }

  @Override
  @Nullable
  public String getName(UUID uuid) throws IOException {
    return Bukkit.getOfflinePlayer(uuid).getName();
  }
}
