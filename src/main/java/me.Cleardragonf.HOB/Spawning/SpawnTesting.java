package me.Cleardragonf.HOB.Spawning;

import java.util.*;

import me.Cleardragonf.HOB.ConfigurationManager;
import me.Cleardragonf.HOB.DayCounter;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.property.block.GroundLuminanceProperty;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class SpawnTesting {
    static Random random = new Random();

    public void getSpace(final Player player) {
        Location<World> playersLocation = player.getLocation();
        List<Location<World>> spawnLocation = new LinkedList<>();
        if (!(player == null)) {

            for (int x = -5; x < 5; x++) {
                for (int y = -5; y < 5; y++)
                    for (int z = -5; z < 5; z++) {
                        String coord = x + "," + y + "," + z;
                        List<String> testing = new LinkedList<>();
                        int range = 10;
                        Double newSpawnX = playersLocation.getX() + x;
                        Double newSpawnY = playersLocation.getY() + y;
                        Double newSpawnZ = playersLocation.getZ() + z;
                        if (Math.pow(newSpawnX - playersLocation.getX(), 2) + Math.pow(newSpawnY - playersLocation.getY(), 2) + Math.pow(newSpawnZ - playersLocation.getZ(), 2) <= 4) {
                            World world = Sponge.getServer().getWorld("world").get();
                            Location<World> newSpawnLocation = new Location(world, newSpawnX, newSpawnY, newSpawnZ);
                            spawnLocation.add(newSpawnLocation);
                        }
                    }
            }
            Collections.shuffle(spawnLocation);
            Optional<Location<World>> Spawn1 = Sponge.getGame().getTeleportHelper().getSafeLocation(spawnLocation.get(0), 50, 30);
            Location<World> Vector1 = Spawn1.get();
            SpawnDecision TimeToTry = new SpawnDecision();
            List<EntityType> list2 = Arrays.asList(EntityTypes.BLAZE, EntityTypes.BAT);
            Collections.shuffle(list2);

            if (Spawn1.isPresent()) {
                final Double optional = Vector1.getProperty(GroundLuminanceProperty.class).get().getValue();
                if (optional < 5) {
                    for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", list2.get(0).getName(), "#").getInt()); i++) {
                        Random roll = new Random();
                        int answer = roll.nextInt(100) + 1;
                        if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", list2.get(0).getName(), "%").getInt())) {
                            Collections.shuffle(spawnLocation);
                            Vector1 = spawnLocation.get(0);
                            TimeToTry.newCreeper(Vector1, list2);

                        }
                    }
                    //Sponge.getServer().getBroadcastChannel().send(Text.of("Vector 1 is performing"));
                } else {
                    return;
                }
            } else {
                return;
            }

        }

    }
}