package me.Cleardragonf.HOB;

import java.io.File;
import java.io.IOException;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader.Builder;
import ninja.leaping.configurate.loader.ConfigurationLoader;

public class ConfigurationManager
{
    private static ConfigurationManager instance = new ConfigurationManager();
    private File configDir;
    private ConfigurationLoader<CommentedConfigurationNode> configLoader1;
    private ConfigurationLoader<CommentedConfigurationNode> configLoader2;
    private ConfigurationLoader<CommentedConfigurationNode> configLoader3;
    private ConfigurationLoader<CommentedConfigurationNode> configLoader4;
    private ConfigurationLoader<CommentedConfigurationNode> configLoader5;
    private ConfigurationLoader<CommentedConfigurationNode> TimeTrackLoader;
    private CommentedConfigurationNode config1;
    private CommentedConfigurationNode config2;
    private CommentedConfigurationNode config3;
    private CommentedConfigurationNode config4;
    private CommentedConfigurationNode config5;
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
        File Week1 = new File(this.configDir, "Week1.conf");
        File Week2 = new File(this.configDir, "Week2.conf");
        File Week3 = new File(this.configDir, "Week3.conf");
        File Week4 = new File(this.configDir, "Week4.conf");
        File Week5 = new File(this.configDir, "Week5.conf");
        File TimeTrackerTime = new File(this.configDir, "TimeTracking.conf");

        this.configLoader1 = ((HoconConfigurationLoader.Builder)HoconConfigurationLoader.builder().setFile(Week1)).build();
        this.configLoader2 = ((HoconConfigurationLoader.Builder)HoconConfigurationLoader.builder().setFile(Week2)).build();
        this.configLoader3 = ((HoconConfigurationLoader.Builder)HoconConfigurationLoader.builder().setFile(Week3)).build();
        this.configLoader4 = ((HoconConfigurationLoader.Builder)HoconConfigurationLoader.builder().setFile(Week4)).build();
        this.configLoader5 = ((HoconConfigurationLoader.Builder)HoconConfigurationLoader.builder().setFile(Week5)).build();
        this.TimeTrackLoader = ((HoconConfigurationLoader.Builder)HoconConfigurationLoader.builder().setFile(TimeTrackerTime)).build();
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
                    this.TimeTracker.getNode(new Object[] { "========Time Tracking========" }).setComment("The Point of this config is to keep track of the Time and Date");
                    this.TimeTracker.getNode(new Object[] { "========Time Tracking========", "Day: " }).setComment("Day number in Game. Between 1-30").setValue("1");
                    this.TimeTracker.getNode(new Object[] { "========Time Tracking========", "Time: " }).setComment("Set the Time in Game. Between 0 - 24000").setValue("0");
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
                    this.config1.getNode(new Object[] { "Natural Spawning!" }).setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "bat" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "bat", "#" }).setComment("Number of bats to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "bat", "%" }).setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "blaze" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "blaze", "#" }).setComment("Number of Blazes to Attempt").setValue("0");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "blaze", "%" }).setComment("Chances for each Blazes Spawn.  1-100%").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "CaveSpider" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "#" }).setComment("Number of CaveSpider to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "%" }).setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Chicken" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Chicken", "#" }).setComment("Number of Chicken to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Chicken", "%" }).setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Cow" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Cow", "#" }).setComment("Number of Cow to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Cow", "%" }).setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Creeper" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Creeper", "#" }).setComment("Number of Creeper to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Creeper", "%" }).setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "EnderDragon" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "#" }).setComment("Number of EnderDragon to attempt").setValue("0");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "%" }).setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Enderman" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Enderman", "#" }).setComment("Number of Enderman to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Enderman", "%" }).setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Ghast" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("0");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Ghast", "%" }).setComment("Chances for each Ghast Spawn.  1-100%").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Giant" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Giant", "%" }).setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Guardian" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Guardian", "#" }).setComment("Number of Guardian to attempt").setValue("0");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Guardian", "%" }).setComment("Chances for each Guardian Spawn.  1-100%").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Horse" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Horse", "#" }).setComment("Number of Horse to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Horse", "%" }).setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "IronGolemn" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "#" }).setComment("Number of IronGolemn to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "%" }).setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "MagmaCube" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "#" }).setComment("Number of MagmaCube to attempt").setValue("0");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "%" }).setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "MushroomCow" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "#" }).setComment("Number of MushroomCow to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "%" }).setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Ocelot" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Ocelot", "#" }).setComment("Number of Ocelot to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Ocelot", "%" }).setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Pig" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Pig", "#" }).setComment("Number of Pig to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Pig", "%" }).setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "PigZombie" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "PigZombie", "#" }).setComment("Number of PigZombie to attempt").setValue("0");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "PigZombie", "%" }).setComment("Chances for each PigZombie Spawn.  1-100%").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Rabbit" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Rabbit", "#" }).setComment("Number of Rabit to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Rabbit", "%" }).setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Sheep" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Sheep", "#" }).setComment("Number of Sheep to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Sheep", "%" }).setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "SilverFish" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "SilverFish", "#" }).setComment("Number of SilverFish to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "SilverFish", "%" }).setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Skeleton" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Skeleton", "#" }).setComment("Number of Skeleton to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Skeleton", "%" }).setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Slime" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Slime", "#" }).setComment("Number of Slime to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Slime", "%" }).setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Snowman" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Snowman", "#" }).setComment("Number of Snowman to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Snowman", "%" }).setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Spider" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Spider", "#" }).setComment("Number of Spider to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Spider", "%" }).setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Squid" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Squid", "#" }).setComment("Number of Squid to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Squid", "%" }).setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Witch" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Witch", "#" }).setComment("Number of Witch to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Witch", "%" }).setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Wither" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Wither", "#" }).setComment("Number of Wither to attempt").setValue("0");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Wither", "%" }).setComment("Chances for each Wither Spawn.  1-100%").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Wolf" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Wolf", "#" }).setComment("Number of Wolf to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Wolf", "%" }).setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Zombie" });
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Zombie", "#" }).setComment("Number of Zombie to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Natural Spawning!", "Zombie", "%" }).setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!" }).setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon" });
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "Enabled" }).setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "#" }).setComment("Number of Ender Dragons to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Ghast" });
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "Enabled" }).setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Giant" });
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Giant", "Enabled" }).setComment("If value is set to True, Giant may spawn.").setValue("False");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config1.getNode(new Object[] { "Spawning Bonuses!", "Giant", "%" }).setComment("The Chance for each Giant to be spawned 1-100").setValue("1");

                    this.config1.getNode(new Object[] { "Custom Properties!" }).setComment("This Controls the Settings of Mobs");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Bat" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Enabled" }).setComment("Enable Custom Bat Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Total" }).setComment("Total Amount of HP for a bat. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Enabled" }).setComment("Enable Custom Bat Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Total" }).setComment("Total Amount of Damage for a bat. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Blaze" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Enabled" }).setComment("Enable Custom Blaze Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Total" }).setComment("Total Amount of HP for a Blaze. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Enabled" }).setComment("Enable Custom Blaze Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Total" }).setComment("Total Amount of Damage for a Blaze. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "CaveSpider" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Enabled" }).setComment("Enable Custom CaveSpider Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Total" }).setComment("Total Amount of HP for a CaveSpider. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Enabled" }).setComment("Enable Custom CaveSpider Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Total" }).setComment("Total Amount of Damage for a CaveSpider. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Chicken" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Enabled" }).setComment("Enable Custom Chicken Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Total" }).setComment("Total Amount of HP for a Chicken. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Enabled" }).setComment("Enable Custom Chicken Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Total" }).setComment("Total Amount of Damage for a Chicken. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Cow" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Enabled" }).setComment("Enable Custom Cow Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Total" }).setComment("Total Amount of HP for a Cow. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Enabled" }).setComment("Enable Custom Cow Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Total" }).setComment("Total Amount of Damage for a Cow. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Creeper" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Enabled" }).setComment("Enable Custom Creeper Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Total" }).setComment("Total Amount of HP for a Creeper. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Enabled" }).setComment("Enable Custom Creeper Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Total" }).setComment("Total Amount of Damage for a Creeper. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "EnderDragon" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Enabled" }).setComment("Enable Custom EnderDragon Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Total" }).setComment("Total Amount of HP for a EnderDragon. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Enabled" }).setComment("Enable Custom EnderDragon Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Total" }).setComment("Total Amount of Damage for a EnderDragon. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Enderman" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Enabled" }).setComment("Enable Custom Enderman Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Total" }).setComment("Total Amount of HP for a Enderman. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Enabled" }).setComment("Enable Custom Enderman Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Total" }).setComment("Total Amount of Damage for a Enderman. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ghast" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Enabled" }).setComment("Enable Custom Ghast Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Total" }).setComment("Total Amount of HP for a Ghast. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Enabled" }).setComment("Enable Custom Ghast Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Total" }).setComment("Total Amount of Damage for a Ghast. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Giant" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Enabled" }).setComment("Enable Custom Giant Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Total" }).setComment("Total Amount of HP for a Giant. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Enabled" }).setComment("Enable Custom Giant Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Total" }).setComment("Total Amount of Damage for a Giant. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Guardian" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Enabled" }).setComment("Enable Custom Guardian Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Total" }).setComment("Total Amount of HP for a Guardian. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Enabled" }).setComment("Enable Custom Guardian Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Total" }).setComment("Total Amount of Damage for a Guardian. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Horse" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Enabled" }).setComment("Enable Custom Horse Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Total" }).setComment("Total Amount of HP for a Horse. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Enabled" }).setComment("Enable Custom Horse Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Total" }).setComment("Total Amount of Damage for a Horse. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "IronGolem" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Enabled" }).setComment("Enable Custom IronGolem Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Total" }).setComment("Total Amount of HP for a IronGolem. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Enabled" }).setComment("Enable Custom IronGolem Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Total" }).setComment("Total Amount of Damage for a IronGolem. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "MagmaCube" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Enabled" }).setComment("Enable Custom MagmaCube Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Total" }).setComment("Total Amount of HP for a MagmaCube. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Enabled" }).setComment("Enable Custom MagmaCube Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Total" }).setComment("Total Amount of Damage for a MagmaCube. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "MushroomCow" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Enabled" }).setComment("Enable Custom MushroomCow Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Total" }).setComment("Total Amount of HP for a MushroomCow. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Enabled" }).setComment("Enable Custom MushroomCow Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Total" }).setComment("Total Amount of Damage for a MushroomCow. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ocelot" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Enabled" }).setComment("Enable Custom Ocelot Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Total" }).setComment("Total Amount of HP for a Ocelot. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Enabled" }).setComment("Enable Custom Ocelot Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Total" }).setComment("Total Amount of Damage for a Ocelot. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Pig" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Enabled" }).setComment("Enable Custom Pig Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Total" }).setComment("Total Amount of HP for a Pig. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Enabled" }).setComment("Enable Custom Pig Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Total" }).setComment("Total Amount of Damage for a Pig. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "PigZombie" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Enabled" }).setComment("Enable Custom PigZombie Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Total" }).setComment("Total Amount of HP for a PigZombie. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Enabled" }).setComment("Enable Custom PigZombie Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Total" }).setComment("Total Amount of Damage for a PigZombie. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Rabbit" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Enabled" }).setComment("Enable Custom Rabbit Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Total" }).setComment("Total Amount of HP for a Rabbit. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Enabled" }).setComment("Enable Custom Rabbit Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Total" }).setComment("Total Amount of Damage for a Rabbit. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Sheep" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Enabled" }).setComment("Enable Custom Sheep Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Total" }).setComment("Total Amount of HP for a Sheep. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Enabled" }).setComment("Enable Custom Sheep Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Total" }).setComment("Total Amount of Damage for a Sheep. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "SilverFish" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Enabled" }).setComment("Enable Custom SilverFish Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Total" }).setComment("Total Amount of HP for a SilverFish. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Enabled" }).setComment("Enable Custom SilverFish Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Total" }).setComment("Total Amount of Damage for a SilverFish. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Skeleton" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Enabled" }).setComment("Enable Custom Skeleton Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Total" }).setComment("Total Amount of HP for a Skeleton. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Enabled" }).setComment("Enable Custom Skeleton Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Total" }).setComment("Total Amount of Damage for a Skeleton. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Slime" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Enabled" }).setComment("Enable Custom Slime Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Total" }).setComment("Total Amount of HP for a Slime. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Enabled" }).setComment("Enable Custom Slime Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Total" }).setComment("Total Amount of Damage for a Slime. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Snowman" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Enabled" }).setComment("Enable Custom Snowman Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Total" }).setComment("Total Amount of HP for a Snowman. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Enabled" }).setComment("Enable Custom Snowman Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Total" }).setComment("Total Amount of Damage for a Snowman. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Spider" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Enabled" }).setComment("Enable Custom Spider Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Total" }).setComment("Total Amount of HP for a Spider. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Enabled" }).setComment("Enable Custom Spider Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Total" }).setComment("Total Amount of Damage for a Spider. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Squid" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Enabled" }).setComment("Enable Custom Squid Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Total" }).setComment("Total Amount of HP for a Squid. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Enabled" }).setComment("Enable Custom Squid Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Total" }).setComment("Total Amount of Damage for a Squid. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Witch" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Enabled" }).setComment("Enable Custom Witch Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Total" }).setComment("Total Amount of HP for a Witch. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Enabled" }).setComment("Enable Custom Witch Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Total" }).setComment("Total Amount of Damage for a Witch. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wither" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Enabled" }).setComment("Enable Custom Wither Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Total" }).setComment("Total Amount of HP for a Wither. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Enabled" }).setComment("Enable Custom Wither Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Total" }).setComment("Total Amount of Damage for a Wither. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wolf" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Enabled" }).setComment("Enable Custom Wolf Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Total" }).setComment("Total Amount of HP for a Wolf. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Enabled" }).setComment("Enable Custom Wolf Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Total" }).setComment("Total Amount of Damage for a Wolf. Default ??").setValue("2");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Zombie" });
                    this.config1.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Enabled" }).setComment("Enable Custom Zombie Health?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Total" }).setComment("Total Amount of HP for a Zombie. Default ??").setValue("10");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Enabled" }).setComment("Enable Custom Zombie Damage?").setValue("False");
                    this.config1.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Total" }).setComment("Total Amount of Damage for a Zombie. Default ??").setValue("2");

                    this.config1.getNode(new Object[] { "========General Week Properties========" }).setComment("The Below is used for Week 1's General Configuration");
                    this.config1.getNode(new Object[] { "========General Week Properties========", "Time Between Waves" });
                    this.config1.getNode(new Object[] { "========General Week Properties========", "Time Between Waves", "Time" }).setComment("In Ticks(20ticks per second)").setValue("460");

                    save1();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            if (!Week2.isFile()) {
                try
                {
                    Week2.createNewFile();
                    load2();
                    this.config2.getNode(new Object[] { "Natural Spawning!" }).setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Bat" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Bat", "#" }).setComment("Number of bats to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Bat", "%" }).setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Blaze" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Blaze", "#" }).setComment("Number of Blazes to Attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Blaze", "%" }).setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "CaveSpider" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "#" }).setComment("Number of CaveSpider to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "%" }).setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Chicken" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Chicken", "#" }).setComment("Number of Chicken to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Chicken", "%" }).setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Cow" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Cow", "#" }).setComment("Number of Cow to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Cow", "%" }).setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Creeper" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Creeper", "#" }).setComment("Number of Creeper to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Creeper", "%" }).setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "EnderDragon" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "#" }).setComment("Number of EnderDragon to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "%" }).setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Enderman" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Enderman", "#" }).setComment("Number of Enderman to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Enderman", "%" }).setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Ghast" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Ghast", "%" }).setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Giant" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Giant", "%" }).setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Guardian" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Guardian", "#" }).setComment("Number of Guardian to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Guardian", "%" }).setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Horse" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Horse", "#" }).setComment("Number of Horse to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Horse", "%" }).setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "IronGolemn" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "#" }).setComment("Number of IronGolemn to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "%" }).setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "MagmaCube" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "#" }).setComment("Number of MagmaCube to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "%" }).setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "MushroomCow" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "#" }).setComment("Number of MushroomCow to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "%" }).setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Ocelot" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Ocelot", "#" }).setComment("Number of Ocelot to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Ocelot", "%" }).setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Pig" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Pig", "#" }).setComment("Number of Pig to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Pig", "%" }).setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "PigZombie" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "PigZombie", "#" }).setComment("Number of PigZombie to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "PigZombie", "%" }).setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Rabbit" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Rabbit", "#" }).setComment("Number of Rabit to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Rabbit", "%" }).setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Sheep" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Sheep", "#" }).setComment("Number of Sheep to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Sheep", "%" }).setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "SilverFish" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "SilverFish", "#" }).setComment("Number of SilverFish to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "SilverFish", "%" }).setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Skeleton" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Skeleton", "#" }).setComment("Number of Skeleton to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Skeleton", "%" }).setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Slime" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Slime", "#" }).setComment("Number of Slime to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Slime", "%" }).setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Snowman" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Snowman", "#" }).setComment("Number of Snowman to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Snowman", "%" }).setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Spider" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Spider", "#" }).setComment("Number of Spider to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Spider", "%" }).setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Squid" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Squid", "#" }).setComment("Number of Squid to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Squid", "%" }).setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Witch" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Witch", "#" }).setComment("Number of Witch to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Witch", "%" }).setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Wither" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Wither", "#" }).setComment("Number of Wither to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Wither", "%" }).setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Wolf" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Wolf", "#" }).setComment("Number of Wolf to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Wolf", "%" }).setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Zombie" });
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Zombie", "#" }).setComment("Number of Zombie to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Natural Spawning!", "Zombie", "%" }).setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!" }).setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon" });
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "Enabled" }).setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "#" }).setComment("Number of Ender Dragons to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Ghast" });
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "Enabled" }).setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Giant" });
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Giant", "Enabled" }).setComment("If value is set to True, Giant may spawn.").setValue("False");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config2.getNode(new Object[] { "Spawning Bonuses!", "Giant", "%" }).setComment("The Chance for each Giant to be spawned 1-100").setValue("1");

                    this.config2.getNode(new Object[] { "Custom Properties!" }).setComment("This Controls the Settings of Mobs");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Bat" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Enabled" }).setComment("Enable Custom Bat Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Total" }).setComment("Total Amount of HP for a bat. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Enabled" }).setComment("Enable Custom Bat Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Total" }).setComment("Total Amount of Damage for a bat. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Blaze" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Enabled" }).setComment("Enable Custom Blaze Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Total" }).setComment("Total Amount of HP for a Blaze. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Enabled" }).setComment("Enable Custom Blaze Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Total" }).setComment("Total Amount of Damage for a Blaze. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "CaveSpider" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Enabled" }).setComment("Enable Custom CaveSpider Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Total" }).setComment("Total Amount of HP for a CaveSpider. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Enabled" }).setComment("Enable Custom CaveSpider Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Total" }).setComment("Total Amount of Damage for a CaveSpider. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Chicken" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Enabled" }).setComment("Enable Custom Chicken Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Total" }).setComment("Total Amount of HP for a Chicken. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Enabled" }).setComment("Enable Custom Chicken Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Total" }).setComment("Total Amount of Damage for a Chicken. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Cow" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Enabled" }).setComment("Enable Custom Cow Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Total" }).setComment("Total Amount of HP for a Cow. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Enabled" }).setComment("Enable Custom Cow Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Total" }).setComment("Total Amount of Damage for a Cow. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Creeper" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Enabled" }).setComment("Enable Custom Creeper Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Total" }).setComment("Total Amount of HP for a Creeper. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Enabled" }).setComment("Enable Custom Creeper Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Total" }).setComment("Total Amount of Damage for a Creeper. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "EnderDragon" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Enabled" }).setComment("Enable Custom EnderDragon Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Total" }).setComment("Total Amount of HP for a EnderDragon. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Enabled" }).setComment("Enable Custom EnderDragon Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Total" }).setComment("Total Amount of Damage for a EnderDragon. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Enderman" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Enabled" }).setComment("Enable Custom Enderman Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Total" }).setComment("Total Amount of HP for a Enderman. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Enabled" }).setComment("Enable Custom Enderman Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Total" }).setComment("Total Amount of Damage for a Enderman. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ghast" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Enabled" }).setComment("Enable Custom Ghast Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Total" }).setComment("Total Amount of HP for a Ghast. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Enabled" }).setComment("Enable Custom Ghast Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Total" }).setComment("Total Amount of Damage for a Ghast. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Giant" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Enabled" }).setComment("Enable Custom Giant Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Total" }).setComment("Total Amount of HP for a Giant. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Enabled" }).setComment("Enable Custom Giant Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Total" }).setComment("Total Amount of Damage for a Giant. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Guardian" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Enabled" }).setComment("Enable Custom Guardian Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Total" }).setComment("Total Amount of HP for a Guardian. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Enabled" }).setComment("Enable Custom Guardian Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Total" }).setComment("Total Amount of Damage for a Guardian. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Horse" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Enabled" }).setComment("Enable Custom Horse Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Total" }).setComment("Total Amount of HP for a Horse. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Enabled" }).setComment("Enable Custom Horse Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Total" }).setComment("Total Amount of Damage for a Horse. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "IronGolem" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Enabled" }).setComment("Enable Custom IronGolem Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Total" }).setComment("Total Amount of HP for a IronGolem. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Enabled" }).setComment("Enable Custom IronGolem Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Total" }).setComment("Total Amount of Damage for a IronGolem. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "MagmaCube" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Enabled" }).setComment("Enable Custom MagmaCube Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Total" }).setComment("Total Amount of HP for a MagmaCube. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Enabled" }).setComment("Enable Custom MagmaCube Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Total" }).setComment("Total Amount of Damage for a MagmaCube. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "MushroomCow" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Enabled" }).setComment("Enable Custom MushroomCow Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Total" }).setComment("Total Amount of HP for a MushroomCow. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Enabled" }).setComment("Enable Custom MushroomCow Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Total" }).setComment("Total Amount of Damage for a MushroomCow. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ocelot" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Enabled" }).setComment("Enable Custom Ocelot Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Total" }).setComment("Total Amount of HP for a Ocelot. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Enabled" }).setComment("Enable Custom Ocelot Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Total" }).setComment("Total Amount of Damage for a Ocelot. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Pig" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Enabled" }).setComment("Enable Custom Pig Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Total" }).setComment("Total Amount of HP for a Pig. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Enabled" }).setComment("Enable Custom Pig Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Total" }).setComment("Total Amount of Damage for a Pig. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "PigZombie" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Enabled" }).setComment("Enable Custom PigZombie Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Total" }).setComment("Total Amount of HP for a PigZombie. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Enabled" }).setComment("Enable Custom PigZombie Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Total" }).setComment("Total Amount of Damage for a PigZombie. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Rabbit" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Enabled" }).setComment("Enable Custom Rabbit Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Total" }).setComment("Total Amount of HP for a Rabbit. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Enabled" }).setComment("Enable Custom Rabbit Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Total" }).setComment("Total Amount of Damage for a Rabbit. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Sheep" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Enabled" }).setComment("Enable Custom Sheep Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Total" }).setComment("Total Amount of HP for a Sheep. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Enabled" }).setComment("Enable Custom Sheep Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Total" }).setComment("Total Amount of Damage for a Sheep. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "SilverFish" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Enabled" }).setComment("Enable Custom SilverFish Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Total" }).setComment("Total Amount of HP for a SilverFish. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Enabled" }).setComment("Enable Custom SilverFish Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Total" }).setComment("Total Amount of Damage for a SilverFish. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Skeleton" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Enabled" }).setComment("Enable Custom Skeleton Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Total" }).setComment("Total Amount of HP for a Skeleton. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Enabled" }).setComment("Enable Custom Skeleton Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Total" }).setComment("Total Amount of Damage for a Skeleton. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Slime" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Enabled" }).setComment("Enable Custom Slime Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Total" }).setComment("Total Amount of HP for a Slime. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Enabled" }).setComment("Enable Custom Slime Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Total" }).setComment("Total Amount of Damage for a Slime. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Snowman" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Enabled" }).setComment("Enable Custom Snowman Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Total" }).setComment("Total Amount of HP for a Snowman. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Enabled" }).setComment("Enable Custom Snowman Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Total" }).setComment("Total Amount of Damage for a Snowman. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Spider" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Enabled" }).setComment("Enable Custom Spider Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Total" }).setComment("Total Amount of HP for a Spider. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Enabled" }).setComment("Enable Custom Spider Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Total" }).setComment("Total Amount of Damage for a Spider. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Squid" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Enabled" }).setComment("Enable Custom Squid Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Total" }).setComment("Total Amount of HP for a Squid. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Enabled" }).setComment("Enable Custom Squid Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Total" }).setComment("Total Amount of Damage for a Squid. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Witch" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Enabled" }).setComment("Enable Custom Witch Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Total" }).setComment("Total Amount of HP for a Witch. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Enabled" }).setComment("Enable Custom Witch Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Total" }).setComment("Total Amount of Damage for a Witch. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wither" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Enabled" }).setComment("Enable Custom Wither Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Total" }).setComment("Total Amount of HP for a Wither. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Enabled" }).setComment("Enable Custom Wither Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Total" }).setComment("Total Amount of Damage for a Wither. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wolf" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Enabled" }).setComment("Enable Custom Wolf Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Total" }).setComment("Total Amount of HP for a Wolf. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Enabled" }).setComment("Enable Custom Wolf Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Total" }).setComment("Total Amount of Damage for a Wolf. Default ??").setValue("2");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Zombie" });
                    this.config2.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Enabled" }).setComment("Enable Custom Zombie Health?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Total" }).setComment("Total Amount of HP for a Zombie. Default ??").setValue("10");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Enabled" }).setComment("Enable Custom Zombie Damage?").setValue("False");
                    this.config2.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Total" }).setComment("Total Amount of Damage for a Zombie. Default ??").setValue("2");

                    this.config2.getNode(new Object[] { "========General Week Properties========" }).setComment("The Below is used for Week 1's General Configuration");
                    this.config2.getNode(new Object[] { "========General Week Properties========", "Time Between Waves" });
                    this.config2.getNode(new Object[] { "========General Week Properties========", "Time Between Waves", "Time" }).setComment("In Ticks(20ticks per second)").setValue("460");

                    save2();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            if (!Week3.isFile()) {
                try
                {
                    Week3.createNewFile();
                    load3();
                    this.config3.getNode(new Object[] { "Natural Spawning!" }).setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Bat" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Bat", "#" }).setComment("Number of bats to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Bat", "%" }).setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Blaze" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Blaze", "#" }).setComment("Number of Blazes to Attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Blaze", "%" }).setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "CaveSpider" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "#" }).setComment("Number of CaveSpider to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "%" }).setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Chicken" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Chicken", "#" }).setComment("Number of Chicken to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Chicken", "%" }).setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Cow" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Cow", "#" }).setComment("Number of Cow to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Cow", "%" }).setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Creeper" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Creeper", "#" }).setComment("Number of Creeper to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Creeper", "%" }).setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "EnderDragon" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "#" }).setComment("Number of EnderDragon to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "%" }).setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Enderman" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Enderman", "#" }).setComment("Number of Enderman to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Enderman", "%" }).setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Ghast" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Ghast", "%" }).setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Giant" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Giant", "%" }).setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Guardian" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Guardian", "#" }).setComment("Number of Guardian to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Guardian", "%" }).setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Horse" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Horse", "#" }).setComment("Number of Horse to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Horse", "%" }).setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "IronGolemn" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "#" }).setComment("Number of IronGolemn to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "%" }).setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "MagmaCube" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "#" }).setComment("Number of MagmaCube to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "%" }).setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "MushroomCow" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "#" }).setComment("Number of MushroomCow to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "%" }).setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Ocelot" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Ocelot", "#" }).setComment("Number of Ocelot to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Ocelot", "%" }).setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Pig" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Pig", "#" }).setComment("Number of Pig to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Pig", "%" }).setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "PigZombie" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "PigZombie", "#" }).setComment("Number of PigZombie to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "PigZombie", "%" }).setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Rabbit" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Rabbit", "#" }).setComment("Number of Rabit to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Rabbit", "%" }).setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Sheep" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Sheep", "#" }).setComment("Number of Sheep to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Sheep", "%" }).setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "SilverFish" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "SilverFish", "#" }).setComment("Number of SilverFish to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "SilverFish", "%" }).setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Skeleton" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Skeleton", "#" }).setComment("Number of Skeleton to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Skeleton", "%" }).setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Slime" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Slime", "#" }).setComment("Number of Slime to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Slime", "%" }).setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Snowman" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Snowman", "#" }).setComment("Number of Snowman to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Snowman", "%" }).setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Spider" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Spider", "#" }).setComment("Number of Spider to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Spider", "%" }).setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Squid" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Squid", "#" }).setComment("Number of Squid to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Squid", "%" }).setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Witch" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Witch", "#" }).setComment("Number of Witch to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Witch", "%" }).setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Wither" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Wither", "#" }).setComment("Number of Wither to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Wither", "%" }).setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Wolf" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Wolf", "#" }).setComment("Number of Wolf to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Wolf", "%" }).setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Zombie" });
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Zombie", "#" }).setComment("Number of Zombie to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Natural Spawning!", "Zombie", "%" }).setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!" }).setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon" });
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "Enabled" }).setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "#" }).setComment("Number of Ender Dragons to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Ghast" });
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "Enabled" }).setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Giant" });
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Giant", "Enabled" }).setComment("If value is set to True, Giant may spawn.").setValue("False");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config3.getNode(new Object[] { "Spawning Bonuses!", "Giant", "%" }).setComment("The Chance for each Giant to be spawned 1-100").setValue("1");

                    this.config3.getNode(new Object[] { "Custom Properties!" }).setComment("This Controls the Settings of Mobs");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Bat" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Enabled" }).setComment("Enable Custom Bat Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Total" }).setComment("Total Amount of HP for a bat. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Enabled" }).setComment("Enable Custom Bat Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Total" }).setComment("Total Amount of Damage for a bat. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Blaze" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Enabled" }).setComment("Enable Custom Blaze Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Total" }).setComment("Total Amount of HP for a Blaze. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Enabled" }).setComment("Enable Custom Blaze Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Total" }).setComment("Total Amount of Damage for a Blaze. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "CaveSpider" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Enabled" }).setComment("Enable Custom CaveSpider Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Total" }).setComment("Total Amount of HP for a CaveSpider. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Enabled" }).setComment("Enable Custom CaveSpider Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Total" }).setComment("Total Amount of Damage for a CaveSpider. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Chicken" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Enabled" }).setComment("Enable Custom Chicken Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Total" }).setComment("Total Amount of HP for a Chicken. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Enabled" }).setComment("Enable Custom Chicken Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Total" }).setComment("Total Amount of Damage for a Chicken. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Cow" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Enabled" }).setComment("Enable Custom Cow Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Total" }).setComment("Total Amount of HP for a Cow. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Enabled" }).setComment("Enable Custom Cow Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Total" }).setComment("Total Amount of Damage for a Cow. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Creeper" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Enabled" }).setComment("Enable Custom Creeper Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Total" }).setComment("Total Amount of HP for a Creeper. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Enabled" }).setComment("Enable Custom Creeper Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Total" }).setComment("Total Amount of Damage for a Creeper. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "EnderDragon" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Enabled" }).setComment("Enable Custom EnderDragon Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Total" }).setComment("Total Amount of HP for a EnderDragon. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Enabled" }).setComment("Enable Custom EnderDragon Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Total" }).setComment("Total Amount of Damage for a EnderDragon. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Enderman" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Enabled" }).setComment("Enable Custom Enderman Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Total" }).setComment("Total Amount of HP for a Enderman. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Enabled" }).setComment("Enable Custom Enderman Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Total" }).setComment("Total Amount of Damage for a Enderman. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ghast" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Enabled" }).setComment("Enable Custom Ghast Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Total" }).setComment("Total Amount of HP for a Ghast. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Enabled" }).setComment("Enable Custom Ghast Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Total" }).setComment("Total Amount of Damage for a Ghast. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Giant" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Enabled" }).setComment("Enable Custom Giant Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Total" }).setComment("Total Amount of HP for a Giant. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Enabled" }).setComment("Enable Custom Giant Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Total" }).setComment("Total Amount of Damage for a Giant. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Guardian" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Enabled" }).setComment("Enable Custom Guardian Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Total" }).setComment("Total Amount of HP for a Guardian. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Enabled" }).setComment("Enable Custom Guardian Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Total" }).setComment("Total Amount of Damage for a Guardian. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Horse" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Enabled" }).setComment("Enable Custom Horse Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Total" }).setComment("Total Amount of HP for a Horse. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Enabled" }).setComment("Enable Custom Horse Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Total" }).setComment("Total Amount of Damage for a Horse. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "IronGolem" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Enabled" }).setComment("Enable Custom IronGolem Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Total" }).setComment("Total Amount of HP for a IronGolem. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Enabled" }).setComment("Enable Custom IronGolem Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Total" }).setComment("Total Amount of Damage for a IronGolem. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "MagmaCube" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Enabled" }).setComment("Enable Custom MagmaCube Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Total" }).setComment("Total Amount of HP for a MagmaCube. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Enabled" }).setComment("Enable Custom MagmaCube Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Total" }).setComment("Total Amount of Damage for a MagmaCube. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "MushroomCow" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Enabled" }).setComment("Enable Custom MushroomCow Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Total" }).setComment("Total Amount of HP for a MushroomCow. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Enabled" }).setComment("Enable Custom MushroomCow Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Total" }).setComment("Total Amount of Damage for a MushroomCow. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ocelot" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Enabled" }).setComment("Enable Custom Ocelot Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Total" }).setComment("Total Amount of HP for a Ocelot. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Enabled" }).setComment("Enable Custom Ocelot Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Total" }).setComment("Total Amount of Damage for a Ocelot. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Pig" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Enabled" }).setComment("Enable Custom Pig Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Total" }).setComment("Total Amount of HP for a Pig. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Enabled" }).setComment("Enable Custom Pig Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Total" }).setComment("Total Amount of Damage for a Pig. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "PigZombie" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Enabled" }).setComment("Enable Custom PigZombie Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Total" }).setComment("Total Amount of HP for a PigZombie. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Enabled" }).setComment("Enable Custom PigZombie Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Total" }).setComment("Total Amount of Damage for a PigZombie. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Rabbit" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Enabled" }).setComment("Enable Custom Rabbit Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Total" }).setComment("Total Amount of HP for a Rabbit. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Enabled" }).setComment("Enable Custom Rabbit Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Total" }).setComment("Total Amount of Damage for a Rabbit. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Sheep" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Enabled" }).setComment("Enable Custom Sheep Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Total" }).setComment("Total Amount of HP for a Sheep. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Enabled" }).setComment("Enable Custom Sheep Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Total" }).setComment("Total Amount of Damage for a Sheep. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "SilverFish" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Enabled" }).setComment("Enable Custom SilverFish Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Total" }).setComment("Total Amount of HP for a SilverFish. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Enabled" }).setComment("Enable Custom SilverFish Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Total" }).setComment("Total Amount of Damage for a SilverFish. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Skeleton" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Enabled" }).setComment("Enable Custom Skeleton Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Total" }).setComment("Total Amount of HP for a Skeleton. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Enabled" }).setComment("Enable Custom Skeleton Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Total" }).setComment("Total Amount of Damage for a Skeleton. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Slime" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Enabled" }).setComment("Enable Custom Slime Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Total" }).setComment("Total Amount of HP for a Slime. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Enabled" }).setComment("Enable Custom Slime Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Total" }).setComment("Total Amount of Damage for a Slime. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Snowman" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Enabled" }).setComment("Enable Custom Snowman Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Total" }).setComment("Total Amount of HP for a Snowman. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Enabled" }).setComment("Enable Custom Snowman Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Total" }).setComment("Total Amount of Damage for a Snowman. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Spider" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Enabled" }).setComment("Enable Custom Spider Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Total" }).setComment("Total Amount of HP for a Spider. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Enabled" }).setComment("Enable Custom Spider Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Total" }).setComment("Total Amount of Damage for a Spider. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Squid" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Enabled" }).setComment("Enable Custom Squid Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Total" }).setComment("Total Amount of HP for a Squid. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Enabled" }).setComment("Enable Custom Squid Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Total" }).setComment("Total Amount of Damage for a Squid. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Witch" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Enabled" }).setComment("Enable Custom Witch Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Total" }).setComment("Total Amount of HP for a Witch. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Enabled" }).setComment("Enable Custom Witch Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Total" }).setComment("Total Amount of Damage for a Witch. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wither" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Enabled" }).setComment("Enable Custom Wither Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Total" }).setComment("Total Amount of HP for a Wither. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Enabled" }).setComment("Enable Custom Wither Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Total" }).setComment("Total Amount of Damage for a Wither. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wolf" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Enabled" }).setComment("Enable Custom Wolf Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Total" }).setComment("Total Amount of HP for a Wolf. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Enabled" }).setComment("Enable Custom Wolf Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Total" }).setComment("Total Amount of Damage for a Wolf. Default ??").setValue("2");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Zombie" });
                    this.config3.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Enabled" }).setComment("Enable Custom Zombie Health?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Total" }).setComment("Total Amount of HP for a Zombie. Default ??").setValue("10");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Enabled" }).setComment("Enable Custom Zombie Damage?").setValue("False");
                    this.config3.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Total" }).setComment("Total Amount of Damage for a Zombie. Default ??").setValue("2");

                    this.config3.getNode(new Object[] { "========General Week Properties========" }).setComment("The Below is used for Week 1's General Configuration");
                    this.config3.getNode(new Object[] { "========General Week Properties========", "Time Between Waves" });
                    this.config3.getNode(new Object[] { "========General Week Properties========", "Time Between Waves", "Time" }).setComment("In Ticks(20ticks per second)").setValue("460");

                    save3();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            if (!Week4.isFile()) {
                try
                {
                    Week4.createNewFile();
                    load4();
                    this.config4.getNode(new Object[] { "Natural Spawning!" }).setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Bat" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Bat", "#" }).setComment("Number of bats to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Bat", "%" }).setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Blaze" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Blaze", "#" }).setComment("Number of Blazes to Attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Blaze", "%" }).setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "CaveSpider" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "#" }).setComment("Number of CaveSpider to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "%" }).setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Chicken" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Chicken", "#" }).setComment("Number of Chicken to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Chicken", "%" }).setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Cow" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Cow", "#" }).setComment("Number of Cow to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Cow", "%" }).setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Creeper" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Creeper", "#" }).setComment("Number of Creeper to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Creeper", "%" }).setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "EnderDragon" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "#" }).setComment("Number of EnderDragon to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "%" }).setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Enderman" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Enderman", "#" }).setComment("Number of Enderman to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Enderman", "%" }).setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Ghast" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Ghast", "%" }).setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Giant" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Giant", "%" }).setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Guardian" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Guardian", "#" }).setComment("Number of Guardian to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Guardian", "%" }).setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Horse" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Horse", "#" }).setComment("Number of Horse to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Horse", "%" }).setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "IronGolemn" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "#" }).setComment("Number of IronGolemn to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "%" }).setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "MagmaCube" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "#" }).setComment("Number of MagmaCube to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "%" }).setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "MushroomCow" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "#" }).setComment("Number of MushroomCow to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "%" }).setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Ocelot" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Ocelot", "#" }).setComment("Number of Ocelot to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Ocelot", "%" }).setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Pig" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Pig", "#" }).setComment("Number of Pig to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Pig", "%" }).setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "PigZombie" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "PigZombie", "#" }).setComment("Number of PigZombie to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "PigZombie", "%" }).setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Rabbit" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Rabbit", "#" }).setComment("Number of Rabit to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Rabbit", "%" }).setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Sheep" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Sheep", "#" }).setComment("Number of Sheep to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Sheep", "%" }).setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "SilverFish" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "SilverFish", "#" }).setComment("Number of SilverFish to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "SilverFish", "%" }).setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Skeleton" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Skeleton", "#" }).setComment("Number of Skeleton to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Skeleton", "%" }).setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Slime" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Slime", "#" }).setComment("Number of Slime to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Slime", "%" }).setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Snowman" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Snowman", "#" }).setComment("Number of Snowman to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Snowman", "%" }).setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Spider" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Spider", "#" }).setComment("Number of Spider to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Spider", "%" }).setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Squid" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Squid", "#" }).setComment("Number of Squid to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Squid", "%" }).setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Witch" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Witch", "#" }).setComment("Number of Witch to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Witch", "%" }).setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Wither" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Wither", "#" }).setComment("Number of Wither to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Wither", "%" }).setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Wolf" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Wolf", "#" }).setComment("Number of Wolf to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Wolf", "%" }).setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Zombie" });
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Zombie", "#" }).setComment("Number of Zombie to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Natural Spawning!", "Zombie", "%" }).setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!" }).setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon" });
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "Enabled" }).setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "#" }).setComment("Number of Ender Dragons to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Ghast" });
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "Enabled" }).setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Giant" });
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Giant", "Enabled" }).setComment("If value is set to True, Giant may spawn.").setValue("False");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config4.getNode(new Object[] { "Spawning Bonuses!", "Giant", "%" }).setComment("The Chance for each Giant to be spawned 1-100").setValue("1");

                    this.config4.getNode(new Object[] { "Custom Properties!" }).setComment("This Controls the Settings of Mobs");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Bat" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Enabled" }).setComment("Enable Custom Bat Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Total" }).setComment("Total Amount of HP for a bat. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Enabled" }).setComment("Enable Custom Bat Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Total" }).setComment("Total Amount of Damage for a bat. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Blaze" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Enabled" }).setComment("Enable Custom Blaze Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Total" }).setComment("Total Amount of HP for a Blaze. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Enabled" }).setComment("Enable Custom Blaze Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Total" }).setComment("Total Amount of Damage for a Blaze. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "CaveSpider" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Enabled" }).setComment("Enable Custom CaveSpider Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Total" }).setComment("Total Amount of HP for a CaveSpider. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Enabled" }).setComment("Enable Custom CaveSpider Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Total" }).setComment("Total Amount of Damage for a CaveSpider. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Chicken" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Enabled" }).setComment("Enable Custom Chicken Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Total" }).setComment("Total Amount of HP for a Chicken. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Enabled" }).setComment("Enable Custom Chicken Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Total" }).setComment("Total Amount of Damage for a Chicken. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Cow" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Enabled" }).setComment("Enable Custom Cow Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Total" }).setComment("Total Amount of HP for a Cow. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Enabled" }).setComment("Enable Custom Cow Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Total" }).setComment("Total Amount of Damage for a Cow. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Creeper" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Enabled" }).setComment("Enable Custom Creeper Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Total" }).setComment("Total Amount of HP for a Creeper. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Enabled" }).setComment("Enable Custom Creeper Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Total" }).setComment("Total Amount of Damage for a Creeper. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "EnderDragon" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Enabled" }).setComment("Enable Custom EnderDragon Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Total" }).setComment("Total Amount of HP for a EnderDragon. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Enabled" }).setComment("Enable Custom EnderDragon Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Total" }).setComment("Total Amount of Damage for a EnderDragon. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Enderman" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Enabled" }).setComment("Enable Custom Enderman Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Total" }).setComment("Total Amount of HP for a Enderman. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Enabled" }).setComment("Enable Custom Enderman Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Total" }).setComment("Total Amount of Damage for a Enderman. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ghast" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Enabled" }).setComment("Enable Custom Ghast Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Total" }).setComment("Total Amount of HP for a Ghast. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Enabled" }).setComment("Enable Custom Ghast Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Total" }).setComment("Total Amount of Damage for a Ghast. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Giant" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Enabled" }).setComment("Enable Custom Giant Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Total" }).setComment("Total Amount of HP for a Giant. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Enabled" }).setComment("Enable Custom Giant Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Total" }).setComment("Total Amount of Damage for a Giant. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Guardian" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Enabled" }).setComment("Enable Custom Guardian Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Total" }).setComment("Total Amount of HP for a Guardian. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Enabled" }).setComment("Enable Custom Guardian Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Total" }).setComment("Total Amount of Damage for a Guardian. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Horse" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Enabled" }).setComment("Enable Custom Horse Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Total" }).setComment("Total Amount of HP for a Horse. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Enabled" }).setComment("Enable Custom Horse Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Total" }).setComment("Total Amount of Damage for a Horse. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "IronGolem" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Enabled" }).setComment("Enable Custom IronGolem Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Total" }).setComment("Total Amount of HP for a IronGolem. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Enabled" }).setComment("Enable Custom IronGolem Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Total" }).setComment("Total Amount of Damage for a IronGolem. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "MagmaCube" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Enabled" }).setComment("Enable Custom MagmaCube Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Total" }).setComment("Total Amount of HP for a MagmaCube. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Enabled" }).setComment("Enable Custom MagmaCube Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Total" }).setComment("Total Amount of Damage for a MagmaCube. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "MushroomCow" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Enabled" }).setComment("Enable Custom MushroomCow Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Total" }).setComment("Total Amount of HP for a MushroomCow. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Enabled" }).setComment("Enable Custom MushroomCow Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Total" }).setComment("Total Amount of Damage for a MushroomCow. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ocelot" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Enabled" }).setComment("Enable Custom Ocelot Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Total" }).setComment("Total Amount of HP for a Ocelot. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Enabled" }).setComment("Enable Custom Ocelot Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Total" }).setComment("Total Amount of Damage for a Ocelot. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Pig" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Enabled" }).setComment("Enable Custom Pig Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Total" }).setComment("Total Amount of HP for a Pig. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Enabled" }).setComment("Enable Custom Pig Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Total" }).setComment("Total Amount of Damage for a Pig. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "PigZombie" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Enabled" }).setComment("Enable Custom PigZombie Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Total" }).setComment("Total Amount of HP for a PigZombie. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Enabled" }).setComment("Enable Custom PigZombie Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Total" }).setComment("Total Amount of Damage for a PigZombie. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Rabbit" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Enabled" }).setComment("Enable Custom Rabbit Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Total" }).setComment("Total Amount of HP for a Rabbit. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Enabled" }).setComment("Enable Custom Rabbit Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Total" }).setComment("Total Amount of Damage for a Rabbit. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Sheep" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Enabled" }).setComment("Enable Custom Sheep Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Total" }).setComment("Total Amount of HP for a Sheep. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Enabled" }).setComment("Enable Custom Sheep Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Total" }).setComment("Total Amount of Damage for a Sheep. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "SilverFish" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Enabled" }).setComment("Enable Custom SilverFish Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Total" }).setComment("Total Amount of HP for a SilverFish. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Enabled" }).setComment("Enable Custom SilverFish Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Total" }).setComment("Total Amount of Damage for a SilverFish. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Skeleton" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Enabled" }).setComment("Enable Custom Skeleton Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Total" }).setComment("Total Amount of HP for a Skeleton. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Enabled" }).setComment("Enable Custom Skeleton Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Total" }).setComment("Total Amount of Damage for a Skeleton. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Slime" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Enabled" }).setComment("Enable Custom Slime Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Total" }).setComment("Total Amount of HP for a Slime. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Enabled" }).setComment("Enable Custom Slime Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Total" }).setComment("Total Amount of Damage for a Slime. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Snowman" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Enabled" }).setComment("Enable Custom Snowman Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Total" }).setComment("Total Amount of HP for a Snowman. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Enabled" }).setComment("Enable Custom Snowman Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Total" }).setComment("Total Amount of Damage for a Snowman. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Spider" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Enabled" }).setComment("Enable Custom Spider Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Total" }).setComment("Total Amount of HP for a Spider. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Enabled" }).setComment("Enable Custom Spider Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Total" }).setComment("Total Amount of Damage for a Spider. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Squid" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Enabled" }).setComment("Enable Custom Squid Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Total" }).setComment("Total Amount of HP for a Squid. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Enabled" }).setComment("Enable Custom Squid Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Total" }).setComment("Total Amount of Damage for a Squid. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Witch" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Enabled" }).setComment("Enable Custom Witch Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Total" }).setComment("Total Amount of HP for a Witch. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Enabled" }).setComment("Enable Custom Witch Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Total" }).setComment("Total Amount of Damage for a Witch. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wither" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Enabled" }).setComment("Enable Custom Wither Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Total" }).setComment("Total Amount of HP for a Wither. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Enabled" }).setComment("Enable Custom Wither Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Total" }).setComment("Total Amount of Damage for a Wither. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wolf" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Enabled" }).setComment("Enable Custom Wolf Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Total" }).setComment("Total Amount of HP for a Wolf. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Enabled" }).setComment("Enable Custom Wolf Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Total" }).setComment("Total Amount of Damage for a Wolf. Default ??").setValue("2");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Zombie" });
                    this.config4.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Enabled" }).setComment("Enable Custom Zombie Health?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Total" }).setComment("Total Amount of HP for a Zombie. Default ??").setValue("10");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Enabled" }).setComment("Enable Custom Zombie Damage?").setValue("False");
                    this.config4.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Total" }).setComment("Total Amount of Damage for a Zombie. Default ??").setValue("2");

                    this.config4.getNode(new Object[] { "========General Week Properties========" }).setComment("The Below is used for Week 1's General Configuration");
                    this.config4.getNode(new Object[] { "========General Week Properties========", "Time Between Waves" });
                    this.config4.getNode(new Object[] { "========General Week Properties========", "Time Between Waves", "Time" }).setComment("In Ticks(20ticks per second)").setValue("460");

                    save4();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            if (!Week5.isFile()) {
                try
                {
                    Week5.createNewFile();
                    load5();
                    this.config5.getNode(new Object[] { "Natural Spawning!" }).setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Bat" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Bat", "#" }).setComment("Number of bats to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Bat", "%" }).setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Blaze" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Blaze", "#" }).setComment("Number of Blazes to Attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Blaze", "%" }).setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "CaveSpider" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "#" }).setComment("Number of CaveSpider to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "CaveSpider", "%" }).setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Chicken" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Chicken", "#" }).setComment("Number of Chicken to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Chicken", "%" }).setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Cow" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Cow", "#" }).setComment("Number of Cow to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Cow", "%" }).setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Creeper" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Creeper", "#" }).setComment("Number of Creeper to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Creeper", "%" }).setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "EnderDragon" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "#" }).setComment("Number of EnderDragon to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "EnderDragon", "%" }).setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Enderman" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Enderman", "#" }).setComment("Number of Enderman to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Enderman", "%" }).setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Ghast" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Ghast", "%" }).setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Giant" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Giant", "%" }).setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Guardian" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Guardian", "#" }).setComment("Number of Guardian to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Guardian", "%" }).setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Horse" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Horse", "#" }).setComment("Number of Horse to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Horse", "%" }).setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "IronGolemn" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "#" }).setComment("Number of IronGolemn to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "IronGolemn", "%" }).setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "MagmaCube" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "#" }).setComment("Number of MagmaCube to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "MagmaCube", "%" }).setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "MushroomCow" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "#" }).setComment("Number of MushroomCow to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "MushroomCow", "%" }).setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Ocelot" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Ocelot", "#" }).setComment("Number of Ocelot to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Ocelot", "%" }).setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Pig" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Pig", "#" }).setComment("Number of Pig to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Pig", "%" }).setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "PigZombie" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "PigZombie", "#" }).setComment("Number of PigZombie to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "PigZombie", "%" }).setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Rabbit" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Rabbit", "#" }).setComment("Number of Rabit to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Rabbit", "%" }).setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Sheep" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Sheep", "#" }).setComment("Number of Sheep to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Sheep", "%" }).setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "SilverFish" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "SilverFish", "#" }).setComment("Number of SilverFish to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "SilverFish", "%" }).setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Skeleton" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Skeleton", "#" }).setComment("Number of Skeleton to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Skeleton", "%" }).setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Slime" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Slime", "#" }).setComment("Number of Slime to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Slime", "%" }).setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Snowman" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Snowman", "#" }).setComment("Number of Snowman to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Snowman", "%" }).setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Spider" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Spider", "#" }).setComment("Number of Spider to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Spider", "%" }).setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Squid" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Squid", "#" }).setComment("Number of Squid to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Squid", "%" }).setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Witch" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Witch", "#" }).setComment("Number of Witch to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Witch", "%" }).setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Wither" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Wither", "#" }).setComment("Number of Wither to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Wither", "%" }).setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Wolf" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Wolf", "#" }).setComment("Number of Wolf to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Wolf", "%" }).setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Zombie" });
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Zombie", "#" }).setComment("Number of Zombie to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Natural Spawning!", "Zombie", "%" }).setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!" }).setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon" });
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "Enabled" }).setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "#" }).setComment("Number of Ender Dragons to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Ender Dragon", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Ghast" });
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "Enabled" }).setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "#" }).setComment("Number of Ghast to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Ghast", "%" }).setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Giant" });
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Giant", "Enabled" }).setComment("If value is set to True, Giant may spawn.").setValue("False");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Giant", "#" }).setComment("Number of Giant to attempt").setValue("1");
                    this.config5.getNode(new Object[] { "Spawning Bonuses!", "Giant", "%" }).setComment("The Chance for each Giant to be spawned 1-100").setValue("1");

                    this.config5.getNode(new Object[] { "Custom Properties!" }).setComment("This Controls the Settings of Mobs");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Bat" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Enabled" }).setComment("Enable Custom Bat Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Bat", "Health", "Total" }).setComment("Total Amount of HP for a bat. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Enabled" }).setComment("Enable Custom Bat Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Bat", "Attack", "Total" }).setComment("Total Amount of Damage for a bat. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Blaze" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Enabled" }).setComment("Enable Custom Blaze Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Blaze", "Health", "Total" }).setComment("Total Amount of HP for a Blaze. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Enabled" }).setComment("Enable Custom Blaze Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Blaze", "Attack", "Total" }).setComment("Total Amount of Damage for a Blaze. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "CaveSpider" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Enabled" }).setComment("Enable Custom CaveSpider Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Health", "Total" }).setComment("Total Amount of HP for a CaveSpider. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Enabled" }).setComment("Enable Custom CaveSpider Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "CaveSpider", "Attack", "Total" }).setComment("Total Amount of Damage for a CaveSpider. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Chicken" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Enabled" }).setComment("Enable Custom Chicken Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Chicken", "Health", "Total" }).setComment("Total Amount of HP for a Chicken. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Enabled" }).setComment("Enable Custom Chicken Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Chicken", "Attack", "Total" }).setComment("Total Amount of Damage for a Chicken. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Cow" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Enabled" }).setComment("Enable Custom Cow Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Cow", "Health", "Total" }).setComment("Total Amount of HP for a Cow. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Enabled" }).setComment("Enable Custom Cow Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Cow", "Attack", "Total" }).setComment("Total Amount of Damage for a Cow. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Creeper" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Enabled" }).setComment("Enable Custom Creeper Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Creeper", "Health", "Total" }).setComment("Total Amount of HP for a Creeper. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Enabled" }).setComment("Enable Custom Creeper Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Creeper", "Attack", "Total" }).setComment("Total Amount of Damage for a Creeper. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "EnderDragon" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Enabled" }).setComment("Enable Custom EnderDragon Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Health", "Total" }).setComment("Total Amount of HP for a EnderDragon. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Enabled" }).setComment("Enable Custom EnderDragon Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "EnderDragon", "Attack", "Total" }).setComment("Total Amount of Damage for a EnderDragon. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Enderman" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Enabled" }).setComment("Enable Custom Enderman Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Enderman", "Health", "Total" }).setComment("Total Amount of HP for a Enderman. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Enabled" }).setComment("Enable Custom Enderman Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Enderman", "Attack", "Total" }).setComment("Total Amount of Damage for a Enderman. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ghast" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Enabled" }).setComment("Enable Custom Ghast Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ghast", "Health", "Total" }).setComment("Total Amount of HP for a Ghast. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Enabled" }).setComment("Enable Custom Ghast Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ghast", "Attack", "Total" }).setComment("Total Amount of Damage for a Ghast. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Giant" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Enabled" }).setComment("Enable Custom Giant Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Giant", "Health", "Total" }).setComment("Total Amount of HP for a Giant. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Enabled" }).setComment("Enable Custom Giant Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Giant", "Attack", "Total" }).setComment("Total Amount of Damage for a Giant. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Guardian" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Enabled" }).setComment("Enable Custom Guardian Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Guardian", "Health", "Total" }).setComment("Total Amount of HP for a Guardian. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Enabled" }).setComment("Enable Custom Guardian Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Guardian", "Attack", "Total" }).setComment("Total Amount of Damage for a Guardian. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Horse" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Enabled" }).setComment("Enable Custom Horse Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Horse", "Health", "Total" }).setComment("Total Amount of HP for a Horse. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Enabled" }).setComment("Enable Custom Horse Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Horse", "Attack", "Total" }).setComment("Total Amount of Damage for a Horse. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "IronGolem" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Enabled" }).setComment("Enable Custom IronGolem Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "IronGolem", "Health", "Total" }).setComment("Total Amount of HP for a IronGolem. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Enabled" }).setComment("Enable Custom IronGolem Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "IronGolem", "Attack", "Total" }).setComment("Total Amount of Damage for a IronGolem. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "MagmaCube" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Enabled" }).setComment("Enable Custom MagmaCube Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Health", "Total" }).setComment("Total Amount of HP for a MagmaCube. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Enabled" }).setComment("Enable Custom MagmaCube Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "MagmaCube", "Attack", "Total" }).setComment("Total Amount of Damage for a MagmaCube. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "MushroomCow" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Enabled" }).setComment("Enable Custom MushroomCow Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Health", "Total" }).setComment("Total Amount of HP for a MushroomCow. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Enabled" }).setComment("Enable Custom MushroomCow Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "MushroomCow", "Attack", "Total" }).setComment("Total Amount of Damage for a MushroomCow. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ocelot" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Enabled" }).setComment("Enable Custom Ocelot Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ocelot", "Health", "Total" }).setComment("Total Amount of HP for a Ocelot. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Enabled" }).setComment("Enable Custom Ocelot Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Ocelot", "Attack", "Total" }).setComment("Total Amount of Damage for a Ocelot. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Pig" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Enabled" }).setComment("Enable Custom Pig Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Pig", "Health", "Total" }).setComment("Total Amount of HP for a Pig. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Enabled" }).setComment("Enable Custom Pig Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Pig", "Attack", "Total" }).setComment("Total Amount of Damage for a Pig. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "PigZombie" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Enabled" }).setComment("Enable Custom PigZombie Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "PigZombie", "Health", "Total" }).setComment("Total Amount of HP for a PigZombie. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Enabled" }).setComment("Enable Custom PigZombie Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "PigZombie", "Attack", "Total" }).setComment("Total Amount of Damage for a PigZombie. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Rabbit" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Enabled" }).setComment("Enable Custom Rabbit Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Rabbit", "Health", "Total" }).setComment("Total Amount of HP for a Rabbit. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Enabled" }).setComment("Enable Custom Rabbit Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Rabbit", "Attack", "Total" }).setComment("Total Amount of Damage for a Rabbit. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Sheep" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Enabled" }).setComment("Enable Custom Sheep Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Sheep", "Health", "Total" }).setComment("Total Amount of HP for a Sheep. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Enabled" }).setComment("Enable Custom Sheep Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Sheep", "Attack", "Total" }).setComment("Total Amount of Damage for a Sheep. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "SilverFish" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Enabled" }).setComment("Enable Custom SilverFish Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "SilverFish", "Health", "Total" }).setComment("Total Amount of HP for a SilverFish. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Enabled" }).setComment("Enable Custom SilverFish Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "SilverFish", "Attack", "Total" }).setComment("Total Amount of Damage for a SilverFish. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Skeleton" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Enabled" }).setComment("Enable Custom Skeleton Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Skeleton", "Health", "Total" }).setComment("Total Amount of HP for a Skeleton. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Enabled" }).setComment("Enable Custom Skeleton Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Skeleton", "Attack", "Total" }).setComment("Total Amount of Damage for a Skeleton. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Slime" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Enabled" }).setComment("Enable Custom Slime Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Slime", "Health", "Total" }).setComment("Total Amount of HP for a Slime. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Enabled" }).setComment("Enable Custom Slime Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Slime", "Attack", "Total" }).setComment("Total Amount of Damage for a Slime. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Snowman" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Enabled" }).setComment("Enable Custom Snowman Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Snowman", "Health", "Total" }).setComment("Total Amount of HP for a Snowman. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Enabled" }).setComment("Enable Custom Snowman Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Snowman", "Attack", "Total" }).setComment("Total Amount of Damage for a Snowman. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Spider" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Enabled" }).setComment("Enable Custom Spider Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Spider", "Health", "Total" }).setComment("Total Amount of HP for a Spider. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Enabled" }).setComment("Enable Custom Spider Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Spider", "Attack", "Total" }).setComment("Total Amount of Damage for a Spider. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Squid" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Enabled" }).setComment("Enable Custom Squid Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Squid", "Health", "Total" }).setComment("Total Amount of HP for a Squid. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Enabled" }).setComment("Enable Custom Squid Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Squid", "Attack", "Total" }).setComment("Total Amount of Damage for a Squid. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Witch" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Enabled" }).setComment("Enable Custom Witch Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Witch", "Health", "Total" }).setComment("Total Amount of HP for a Witch. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Enabled" }).setComment("Enable Custom Witch Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Witch", "Attack", "Total" }).setComment("Total Amount of Damage for a Witch. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wither" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Enabled" }).setComment("Enable Custom Wither Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wither", "Health", "Total" }).setComment("Total Amount of HP for a Wither. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Enabled" }).setComment("Enable Custom Wither Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wither", "Attack", "Total" }).setComment("Total Amount of Damage for a Wither. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wolf" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Enabled" }).setComment("Enable Custom Wolf Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wolf", "Health", "Total" }).setComment("Total Amount of HP for a Wolf. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Enabled" }).setComment("Enable Custom Wolf Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Wolf", "Attack", "Total" }).setComment("Total Amount of Damage for a Wolf. Default ??").setValue("2");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Zombie" });
                    this.config5.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Enabled" }).setComment("Enable Custom Zombie Health?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Zombie", "Health", "Total" }).setComment("Total Amount of HP for a Zombie. Default ??").setValue("10");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Enabled" }).setComment("Enable Custom Zombie Damage?").setValue("False");
                    this.config5.getNode(new Object[] { "Custom Properties!", "Zombie", "Attack", "Total" }).setComment("Total Amount of Damage for a Zombie. Default ??").setValue("2");

                    this.config5.getNode(new Object[] { "========General Week Properties========" }).setComment("The Below is used for Week 1's General Configuration");
                    this.config5.getNode(new Object[] { "========General Week Properties========", "Time Between Waves" });
                    this.config5.getNode(new Object[] { "========General Week Properties========", "Time Between Waves", "Time" }).setComment("In Ticks(20ticks per second)").setValue("460");

                    save5();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            this.config1 = ((CommentedConfigurationNode)this.configLoader1.load());
            this.config2 = ((CommentedConfigurationNode)this.configLoader2.load());
            this.config3 = ((CommentedConfigurationNode)this.configLoader3.load());
            this.config4 = ((CommentedConfigurationNode)this.configLoader4.load());
            this.config5 = ((CommentedConfigurationNode)this.configLoader5.load());
            this.TimeTracker = ((CommentedConfigurationNode)this.TimeTrackLoader.load());
        }
        catch (IOException e) {}
    }

    private void loadTime()
    {
        try
        {
            this.TimeTracker = ((CommentedConfigurationNode)this.TimeTrackLoader.load());
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
            this.config1 = ((CommentedConfigurationNode)this.configLoader1.load());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void load2()
    {
        try
        {
            this.config2 = ((CommentedConfigurationNode)this.configLoader2.load());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void load3()
    {
        try
        {
            this.config3 = ((CommentedConfigurationNode)this.configLoader3.load());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void load4()
    {
        try
        {
            this.config4 = ((CommentedConfigurationNode)this.configLoader4.load());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void load5()
    {
        try
        {
            this.config5 = ((CommentedConfigurationNode)this.configLoader5.load());
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

    public void save2()
    {
        try
        {
            this.configLoader2.save(this.config2);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void save3()
    {
        try
        {
            this.configLoader3.save(this.config3);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void save4()
    {
        try
        {
            this.configLoader4.save(this.config4);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void save5()
    {
        try
        {
            this.configLoader5.save(this.config5);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void loadConfig(int index)
    {
        if (index == 1) {
            try
            {
                this.config1 = ((CommentedConfigurationNode)this.configLoader1.load());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        if (index == 2) {
            try
            {
                this.config2 = ((CommentedConfigurationNode)this.configLoader2.load());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        if (index == 3) {
            try
            {
                this.config3 = ((CommentedConfigurationNode)this.configLoader3.load());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        if (index == 4) {
            try
            {
                this.config4 = ((CommentedConfigurationNode)this.configLoader4.load());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        if (index == 5) {
            try
            {
                this.config5 = ((CommentedConfigurationNode)this.configLoader5.load());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public CommentedConfigurationNode getConfig(int index)
    {
        if (index == 1) {
            return this.config1;
        }
        if (index == 2) {
            return this.config2;
        }
        if (index == 3) {
            return this.config3;
        }
        if (index == 4) {
            return this.config4;
        }
        if (index == 5) {
            return this.config5;
        }
        return this.config1;
    }

    public CommentedConfigurationNode getTimeTrack()
    {
        return this.TimeTracker;
    }
}
