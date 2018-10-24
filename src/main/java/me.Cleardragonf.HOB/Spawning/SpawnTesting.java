package me.Cleardragonf.HOB.Spawning;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import me.Cleardragonf.HOB.ConfigurationManager;
import me.Cleardragonf.HOB.DayCounter;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import org.spongepowered.api.Game;
import org.spongepowered.api.Server;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.property.block.GroundLuminanceProperty;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.living.Hostile;
import org.spongepowered.api.entity.living.animal.Animal;
import org.spongepowered.api.entity.living.monster.Monster;
import org.spongepowered.api.entity.living.player.Player;
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
            for (int x = -10; x < 10; x++) {
                for (int y = -10; y < 10; y++) {
                    for (int z = -10; z < 10; z++)
                    {
                        String coord = x + "," + y + "," + z;
                        List<String> testing = new LinkedList();
                        int range = 10;
                        Double newSpawnX = Double.valueOf(playersLocation.getX() + x);
                        Double newSpawnY = Double.valueOf(playersLocation.getY() + y);
                        Double newSpawnZ = Double.valueOf(playersLocation.getZ() + z);
                        if (Math.pow(newSpawnX.doubleValue() - playersLocation.getX(), 2.0D) + Math.pow(newSpawnY.doubleValue() - playersLocation.getY(), 2.0D) + Math.pow(newSpawnZ.doubleValue() - playersLocation.getZ(), 2.0D) <= 64.0D)
                        {
                            if (Math.pow(newSpawnX.doubleValue() - playersLocation.getX(), 2.0D) + Math.pow(newSpawnY.doubleValue() - playersLocation.getY(), 2.0D) + Math.pow(newSpawnZ.doubleValue() - playersLocation.getZ(), 2.0D) >= 16.0D){
                                World world = (World)Sponge.getServer().getWorld("world").get();
                                Location<World> newSpawnLocation = new Location(world, newSpawnX.doubleValue(), newSpawnY.doubleValue(), newSpawnZ.doubleValue());
                                spawnLocation.add(newSpawnLocation);
                            }

                        }
                    }
                }
            }
            Collections.shuffle(spawnLocation);
            Optional<Location<World>> Spawn1 = Sponge.getGame().getTeleportHelper().getSafeLocation((Location)spawnLocation.get(0), 2, 2);
            while (!Spawn1.isPresent()){
                int i = 0;
                spawnLocation.get(i);
                Spawn1 = Optional.ofNullable(spawnLocation.get(i));
                i++;
                if(((LinkedList<Location<World>>) spawnLocation).size() == i){
                    Spawn1 = Optional.ofNullable(playersLocation);
                }
            }
            Location<World> Vector1 = (Location)Spawn1.get();
            SpawnDecision TimeToTry = new SpawnDecision();

            List<Class<? extends Entity>> classes = ImmutableList.of(Animal.class, Monster.class, Hostile.class);
            List<EntityType> list2 = Sponge.getRegistry().getAllOf(EntityType.class).stream().filter((x) -> {
                return classes.stream().anyMatch((y) -> {
                    return y.isAssignableFrom(x.getEntityClass());
                });
            }).collect(Collectors.toList());
            Collections.shuffle(list2);
            int weekNumber = DayCounter.getWeeklyConfig();
            String week;
            if(weekNumber != 5){
                week = "Week " + weekNumber;
            }else{
                week = "HOB Night";
            }

            if (Spawn1.isPresent())
            {
                Double optional = (Double)((GroundLuminanceProperty)Vector1.getProperty(GroundLuminanceProperty.class).get()).getValue();
                if (optional.doubleValue() < 5.0D) {
                    for (int i = 0; i < ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", list2.get(0).getName(), week, "=====Natural Spawning=====", "Number of " + list2.get(0).getName() + "'s to attempt: ").getInt(); i++)
                    {
                        Random roll = new Random();
                        int answer = roll.nextInt(100) + 1;
                        if (answer <= ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", list2.get(0).getName(), week, "=====Natural Spawning=====", "The Chance of each " + list2.get(0).getName() + "actually spawning: ").getInt())
                        {
                            Collections.shuffle(spawnLocation);
                            Vector1 = (Location)spawnLocation.get(0);
                            TimeToTry.newCreeper(Vector1, list2);
                        }
                    }
                } else {
                    return;
                }
            }
            else {}
        }
    }
}
