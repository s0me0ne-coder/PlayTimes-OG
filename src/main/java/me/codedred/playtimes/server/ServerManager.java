package me.codedred.playtimes.server;
import java.util.UUID;
import javax.annotation.Nullable;

public class ServerManager {

  private static final ServerManager instance = new ServerManager();

  public static ServerManager getInstance() {
    return instance;
  }

  @Nullable
  public UUID getUUID(String name) {
    UUID id = ServerOnline.getUUID(name);
    if (id == null) {
      id = ServerOffline.getUUID(name);
    }
    return id;
  }

  public String getName(UUID uuid) {
    String name = ServerOnline.getName(uuid);
    if(name == null) {
      name = ServerOffline.getName(uuid);
    }
    return name;
  }
  
}
