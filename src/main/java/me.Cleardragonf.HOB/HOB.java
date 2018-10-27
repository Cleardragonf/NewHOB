package me.Cleardragonf.HOB;

import com.google.inject.Inject;
import me.Cleardragonf.HOB.AddOns.EcoRewards;
import me.Cleardragonf.HOB.Commands.CommandManager;
import me.Cleardragonf.HOB.Commands.SetDayCommand;
import me.Cleardragonf.HOB.MobMecahnics.BreakBlockMechanic;
import me.Cleardragonf.HOB.MobMecahnics.CustomMobProperties;
import me.Cleardragonf.HOB.Spawning.SpawnTesting;
import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.data.Property;
import org.spongepowered.api.data.property.block.PassableProperty;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.ai.task.builtin.creature.AttackLivingAITask;
import org.spongepowered.api.entity.living.Agent;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.AttackEntityEvent;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.event.entity.ai.AITaskEvent;
import org.spongepowered.api.event.game.GameReloadEvent;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.game.state.GameStoppingServerEvent;
import org.spongepowered.api.event.service.ChangeServiceProviderEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.service.economy.EconomyService;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.util.blockray.BlockRay;

import java.io.Console;
import java.io.File;
import java.util.logging.Logger;

@Plugin (id="hellonblock", name="HOBs", version="Beta 1.0.0")
public class HOB {

    /**/
    public static final String FILE_LOCATION = "mods/HellOnSpoangee/portals.dat";
    public static final String NAME = "[HOS]";

    @Inject
    private Logger logger;

    @Inject
    Game game;

    @Inject
    private void setLogger(Logger logger)
    {
        this.logger = logger;
    }

    public Logger getLogger()
    {
        return this.logger;
    }

    private static HOB instance;

    public static HOB getInstance(){
        return instance;
    }

    @Inject public  PluginContainer pluginContainer;
    public  PluginContainer getPluginContainer() {
        return pluginContainer;
    }

    @Inject
    @ConfigDir(sharedRoot = false)
    private File configDir;

    @Listener
    public  void enderDragon(SpawnEntityEvent event){
        Entity spawnedEntity = null;
        for(Entity entity : event.getEntities()){
            if(entity != null){
                spawnedEntity = entity;
                break;
            }
        }
        if(spawnedEntity == null){
            return;
        }
        if(spawnedEntity.equals(EntityTypes.CREEPER)){
            BreakBlockMechanic test = new BreakBlockMechanic();
            test.onEntitySpawn((EntityType) spawnedEntity);
        }
    }

    @Listener
    public void allhands(GamePreInitializationEvent event){
        ConfigurationManager.getInstance().ConfigurationManager2(configDir);
        ConfigurationManager.getInstance().enable();
        instance = this;
        //setting the Commands here.
        CommandSpec TimeCommand = CommandSpec.builder()
                .description(Text.of("Tells the time and day of the month"))
                .executor(new CommandManager())
                .build();
        game.getCommandManager().register(this, TimeCommand, "hobtime");
        CommandSpec SetDayCommand = CommandSpec.builder()
                .description(Text.of("Set the Date in Minecraft"))
                .executor(new SetDayCommand())
                .build();
        game.getCommandManager().register(this, SetDayCommand, "HOB");

    }

    @Listener//entityData is to be fired anytime and Entity is Detected being spawned.
    public void entityData(SpawnEntityEvent event){

        DayCounter labelTest = new DayCounter();

        labelTest.Days();
    }

    //========Game Schedulers ========
    @Listener
    public void daytracker3(GameStartedServerEvent event){

        Sponge.getScheduler().createTaskBuilder().execute(task -> {
            DayCounter getStarted = new DayCounter();
            getStarted.Days();
        }).intervalTicks(20).submit(this);
    }

    @Listener
    public void SpawnTracking(GameStartedServerEvent event){
        Sponge.getScheduler().createTaskBuilder().execute(task ->{
                for(Player a: Sponge.getServer().getOnlinePlayers()){
                    if(a.getWorld().getName() != "DIM144"){
                        Player player2 = Sponge.getServer().getOnlinePlayers().iterator().next();
                        SpawnTesting spawnTest = new SpawnTesting();
                        spawnTest.getSpace(player2);
                    }else{
                        logger.info(a.getName() + " is currently sitting in a Compact Machine");
                    }
                }
        }).intervalTicks((ConfigurationManager.getInstance().getConfig().getNode("========General Week Properties========", "Time Between Waves", "Time").getLong())).submit(this);
    }

    @Listener
    public void payPlayers(GameInitializationEvent event){
        Sponge.getEventManager().registerListeners(this, new EcoRewards());
    }

    private static EconomyService economyService;
    @Listener
    public void onChangeServiceProvider(ChangeServiceProviderEvent event){
        if(event.getService().equals(EconomyService.class)){
            economyService = (EconomyService) event.getNewProviderRegistration().getProvider();
        }
        Sponge.getGame().getServer().getBroadcastChannel().send(Text.of(TextColors.GOLD, "Change Service is working"));

    }
    public static EconomyService getEcon(){
        return economyService;
    }


    @Listener
    public void reloading(GameReloadEvent event){
        ConfigurationManager.getInstance().enable();
        ConfigurationManager.getInstance().notifyAll();
        Sponge.getServer().getBroadcastChannel().send(Text.of("HOB's Has Reloaded Successfully!!!"));
    }
    @Listener
    public void Ending(GameStoppingServerEvent event){
        int days = DayCounter.getCustDays();
        ConfigurationManager.getInstance().getTimeTrack().getNode("========Time Tracking========", "Day: ").setValue(days);
        ConfigurationManager.getInstance().saveTime();
    }


}