package me.Cleardragonf.HOB.Spawning;

import java.util.*;
import java.util.stream.Collectors;

import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.property.block.GroundLuminanceProperty;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;
import scala.tools.cmd.gen.AnyVals;

public class SpawnTesting {
    static Random random = new Random();
    public void getSpace(final Player player){
        if (!(player == null)){
            Location<World> playersLocation = player.getLocation();
            List<Location<World>> spawnLocation = new LinkedList<>();
            for (int x = -5; x < 5; x++) {
                for (int y = -5; y < 5; y++)
                    for (int z = -5; z < 5; z++) {
                        String coord = x + "," + y + "," + z;
                        List<String> testing = new LinkedList<>();
                        int range = 10;
                        Double newSpawnX = playersLocation.getX() + x;
                        Double newSpawnY = playersLocation.getY() + y;
                        Double newSpawnZ = playersLocation.getZ() + z;
                        if(Math.pow(newSpawnX - playersLocation.getX(), 2) + Math.pow(newSpawnY - playersLocation.getY(), 2) + Math.pow(newSpawnZ - playersLocation.getZ(), 2)<= 4){
                            World world = Sponge.getServer().getWorld("world").get();
                            Location<World> newSpawnLocation = new Location(world, newSpawnX, newSpawnY, newSpawnZ);
                            spawnLocation.add(newSpawnLocation);
                        }
                    }
            }
            Collections.shuffle(spawnLocation);
            playersLocation = spawnLocation.get(0);
            Optional<Location<World>> Spawn1 = Sponge.getGame().getTeleportHelper().getSafeLocation(playersLocation, 50, 30);
            Location<World> Vector1 = Spawn1.get();
            SpawnDecision TimeToTry = new SpawnDecision();
            if(Spawn1.isPresent()){
                final Double optional = Vector1.getProperty(GroundLuminanceProperty.class).get().getValue();
                if(optional < 5){
                    TimeToTry.newCreeper(Vector1);
                    //Sponge.getServer().getBroadcastChannel().send(Text.of("Vector 1 is performing"));
                }else{
                    return;
                }
            }else{
                return;
            }
        }
    }
}