package me.Cleardragonf.HOB;

import com.google.inject.Inject;
import me.Cleardragonf.HOB.Commands.CommandManager;
import me.Cleardragonf.HOB.Commands.SetDayCommand;
import me.Cleardragonf.HOB.Spawning.SpawnTesting;
import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.event.game.GameReloadEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.game.state.GameStoppingServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.text.Text;

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
            int player = Sponge.getGame().getServer().getOnlinePlayers().size();
            if(!(player == 0)){
                for(Player a: Sponge.getServer().getOnlinePlayers()){
                    if(a.getWorld().getName() != "DIM144"){
                        Player player2 = Sponge.getServer().getOnlinePlayers().iterator().next();
                        SpawnTesting spawnTest = new SpawnTesting();
                        spawnTest.getSpace(player2);
                    }else{
                        logger.info(a.getName() + " is currently sitting in a Compact Machine");
                    }
                }
            }
        }).intervalTicks((ConfigurationManager.getInstance().getConfig().getNode("========General Week Properties========", "Time Between Waves", "Time").getLong())).submit(this);
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