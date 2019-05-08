package me.Cleardragonf.HOB;

import com.google.common.collect.ImmutableList;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.living.Hostile;
import org.spongepowered.api.entity.living.animal.Animal;
import org.spongepowered.api.entity.living.monster.Monster;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ConfigurationManager
{
    private static ConfigurationManager instance = new ConfigurationManager();
    private File configDir;
    private ConfigurationLoader<CommentedConfigurationNode> configLoader1;
    private ConfigurationLoader<CommentedConfigurationNode> TimeTrackLoader;
    private CommentedConfigurationNode config1;
    private CommentedConfigurationNode TimeTracker;

    public static ConfigurationManager getInstance()
    {
        return instance;
    }

    public void ConfigurationManager2(File configDir)
    {
        this.configDir = configDir;
    }

    public void enable()
    {
        File Week1 = new File(this.configDir, "Entity.conf");
        File TimeTrackerTime = new File(this.configDir, "TimeTracking.conf");

        this.configLoader1 = HoconConfigurationLoader.builder().setFile(Week1).build();
        this.TimeTrackLoader = HoconConfigurationLoader.builder().setFile(TimeTrackerTime).build();
        try
        {
            if (!this.configDir.isDirectory()) {
                this.configDir.mkdirs();
            }
            if (!TimeTrackerTime.isFile()) {
                try
                {
                    TimeTrackerTime.createNewFile();
                    loadTime();
                    this.TimeTracker.getNode("========Time Tracking========").setComment("The Point of this config is to keep track of the Time and Date");
                    this.TimeTracker.getNode("========Time Tracking========", "Day: ").setComment("Day number in Game. Between 1-30").setValue("1");
                    this.TimeTracker.getNode("========Time Tracking========", "Time: ").setComment("Set the Time in Game. Between 0 - 24000").setValue("0");
                    saveTime();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            if (!Week1.isFile()) {
                try
                {
                    Week1.createNewFile();
                    load1();
                    List<Class<? extends Entity>> classes = ImmutableList.of(Monster.class, Hostile.class);
                    List<EntityType> cet = Sponge.getRegistry().getAllOf(EntityType.class).stream().filter((x) -> {
                        return classes.stream().anyMatch((y) -> {
                            return y.isAssignableFrom(x.getEntityClass());
                        });
                    }).collect(Collectors.toList());
                    this.config1.getNode("=============Entity Control============").setComment("This Portion of the Config is dedicated to the Control of Entities");
                    for (EntityType entity : cet){
                        for (int weekNumber = 1; weekNumber <= 5; weekNumber++) {
                            String week = null;
                            if(weekNumber != 5){
                                week = "Week " + weekNumber;
                            }else{
                               week = "HOB Night";
                            }
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Natural Spawning=====", "Number of " + entity.getName() + "'s to attempt: ").setComment("Any Whole Number ~99999").setValue(10);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Natural Spawning=====", "The Chance of each " + entity.getName() + "actually spawning: ").setComment("0-100").setValue(100);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Natural Spawning=====", "Minimum Range: ").setValue(3);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Natural Spawning=====", "Maximum Range: ").setValue(5);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Enable Custom Health: ").setValue(false);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Enable Anger: ").setValue(false);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Enable Custom Projectile Damage: ").setValue(false);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Projectile Damage: ").setValue(10);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Enable Custom Explosion Damage: ").setValue(false);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Explosion Radius: ").setValue(5);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Custom Health: ").setValue(100);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Enable Custom Explosion: ").setValue(false);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Properties=====", "Explosion Radius: ").setValue(10);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Drops=====", "Enable Custom Drops: ").setValue(false);
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Custom Drops=====", "Custom Drops: ").setValue("");
                            this.config1.getNode("=============Entity Control============", entity.getId(), week, "=====Monetary Benifits=====", "Per Kill: ").setComment("For Each Kill this is what you recieve").setValue(5);



                        }
                    }

                    this.config1.getNode("========General Week Properties========").setComment("The Below is used for Week 1's General Configuration");
                    this.config1.getNode("========General Week Properties========", "Time Between Waves");
                    this.config1.getNode("========General Week Properties========", "Time Between Waves", "Time").setComment("In Ticks(20ticks per second)").setValue("460");

                    save1();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            this.config1 = this.configLoader1.load();
            this.TimeTracker = this.TimeTrackLoader.load();
        }
        catch (IOException e) {}
    }

    private void loadTime()
    {
        try
        {
            this.TimeTracker = this.TimeTrackLoader.load();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void load1()
    {
        try
        {
            this.config1 = this.configLoader1.load();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void saveTime()
    {
        try
        {
            this.TimeTrackLoader.save(this.TimeTracker);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void save1()
    {
        try
        {
            this.configLoader1.save(this.config1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void loadConfig()
    {
        try
        {
            this.config1 = this.configLoader1.load();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public CommentedConfigurationNode getConfig()
    {
        return this.config1;
    }

    public CommentedConfigurationNode getTimeTrack()
    {
        return this.TimeTracker;
    }
}
