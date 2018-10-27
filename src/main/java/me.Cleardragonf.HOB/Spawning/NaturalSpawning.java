package me.Cleardragonf.HOB.Spawning;

import me.Cleardragonf.HOB.DayCounter;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;
import org.spongepowered.api.world.extent.Extent;

import java.util.List;

public class NaturalSpawning {
    public void onEntitySpawn(SpawnEntityEvent event){
        //This is the testing code v

		  /*Entity spawnedEntity = null;
		  for(Entity entity : event.getEntities()){
			  if(entity != null){
				  spawnedEntity = entity;
				  break;
			  }
		  }
		  if(spawnedEntity == null){
			  return;
		  }
		  if(DayCounter.getWeeklyConfig() == 1){
			  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Bat", "#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Bat", "%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		   		  }
			  }
		  }*/





    }
    int test = DayCounter.getWeeklyConfig();
    public String Config = "Config" + test;

    public void Hostiles(Location<World> spawnLocation, List<EntityType> list2) {
        if(list2.equals(EntityTypes.ENDER_DRAGON)){
            Extent extent = spawnLocation.getExtent();
            SpawnTesting nextLocation = new SpawnTesting();
            Entity entity = extent.createEntity(list2.get(0), spawnLocation.getPosition());
            Entity creeper = entity;
            extent.spawnEntity(creeper);
            Sponge.getServer().getBroadcastChannel().send(Text.of(list2.get(0).getName()));
            Sponge.getServer().getBroadcastChannel().send(Text.of(list2.get(0).getId()));
        }
                    Extent extent = spawnLocation.getExtent();
                    SpawnTesting nextLocation = new SpawnTesting();
                    Entity entity = extent.createEntity(list2.get(0), spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of(list2.get(0).getName()));
                    Sponge.getServer().getBroadcastChannel().send(Text.of(list2.get(0).getId()));
    }
    public String getVariableConfig1(){
        return Config;
    }
}