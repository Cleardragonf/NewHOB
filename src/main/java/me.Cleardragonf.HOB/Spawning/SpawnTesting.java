package me.Cleardragonf.HOB.Spawning;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import me.Cleardragonf.HOB.ConfigurationManager;
import me.Cleardragonf.HOB.DayCounter;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import org.spongepowered.api.Game;
import org.spongepowered.api.Server;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.data.property.block.GroundLuminanceProperty;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.living.Hostile;
import org.spongepowered.api.entity.living.animal.Animal;
import org.spongepowered.api.entity.living.monster.Monster;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.util.AABB;
import org.spongepowered.api.util.Direction;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.TeleportHelper;
import org.spongepowered.api.world.World;

public class SpawnTesting
{
    static Random random = new Random();

    public void getSpace(Player player)
    {
        Location<World> playersLocation = player.getLocation();
        List<Location<World>> spawnLocation = new LinkedList();
        if (player != null)
        {
            List<Class<? extends Entity>> classes = ImmutableList.of(Monster.class, Hostile.class);
            List<EntityType> list2 = Sponge.getRegistry().getAllOf(EntityType.class).stream()
                    .filter((x) -> classes.stream().anyMatch((y) -> y.isAssignableFrom(x.getEntityClass())))
                    .filter((p) -> !p.equals(EntityTypes.ENDER_DRAGON))
                    .collect(Collectors.toList());
            Collections.shuffle(list2);
            int weekNumber = DayCounter.getWeeklyConfig();
            String week;
            if(weekNumber != 5){
                week = "Week " + weekNumber;
            }else{
                week = "HOB Night";
            }

            for (int x = -20; x < 20; x++) {
                for (int y = -20; y < 20; y++) {
                    for (int z = -20; z < 20; z++)
                    {
                        List<String> testing = new LinkedList();
                        int range = 10;
                        Double newSpawnX = Double.valueOf(playersLocation.getX() + x);
                        Double newSpawnY = Double.valueOf(playersLocation.getY() + y);
                        Double newSpawnZ = Double.valueOf(playersLocation.getZ() + z);
                        if (Math.pow(newSpawnX.doubleValue() - playersLocation.getX(), 2.0D) + Math.pow(newSpawnY.doubleValue() - playersLocation.getY(), 2.0D) + Math.pow(newSpawnZ.doubleValue() - playersLocation.getZ(), 2.0D) <= Math.pow(ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", list2.get(0).getId(), week, "=====Natural Spawning=====", "Maximum Range: ").getDouble(), 2))
                        {
                            if (Math.pow(newSpawnX.doubleValue() - playersLocation.getX(), 2.0D) + Math.pow(newSpawnY.doubleValue() - playersLocation.getY(), 2.0D) + Math.pow(newSpawnZ.doubleValue() - playersLocation.getZ(), 2.0D) >= Math.pow(ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", list2.get(0).getId(), week, "=====Natural Spawning=====", "Minimum Range: ").getDouble(), 2)){
                                World world = (World)Sponge.getServer().getWorld("world").get();
                                Location<World> newSpawnLocation = new Location(world, newSpawnX.doubleValue(), newSpawnY.doubleValue(), newSpawnZ.doubleValue());
                                spawnLocation.add(newSpawnLocation);
                            }

                        }
                    }
                }
            }






                    for (int i = 1; i < ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", list2.get(0).getId(), week, "=====Natural Spawning=====", "Number of " + list2.get(0).getName() + "'s to attempt: ").getInt(); i++) {

                        Collections.shuffle(spawnLocation);
                        Optional<Location<World>> Spawn1 = Sponge.getGame().getTeleportHelper().getSafeLocation((Location) spawnLocation.get(0));
                        Location<World> Vector1 = (Location) Spawn1.get();
                        Double optional = (Double) ((GroundLuminanceProperty) Vector1.getProperty(GroundLuminanceProperty.class).get()).getValue();
                        SpawnDecision TimeToTry = new SpawnDecision();
                        if (optional.doubleValue() < 5.0D) {
                            if (Spawn1.isPresent()) {
                                Sponge.getServer().getBroadcastChannel().send(Text.of(Vector1.getBlockRelative(Direction.UP).getBlockType().toString()));
                                    Random roll = new Random();
                                    int answer = roll.nextInt(100) + 1;
                                    if (answer <= ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", list2.get(0).getId(), week, "=====Natural Spawning=====", "The Chance of each " + list2.get(0).getName() + "actually spawning: ").getInt()) {
                                        Collections.shuffle(spawnLocation);
                                        TimeToTry.newCreeper(Vector1, list2);
                                }else{
                                }
                            }else{
                                return;
                            }
                        }else {
                            return;
                        }
                    }

            }
            else {
        }
    }
}
