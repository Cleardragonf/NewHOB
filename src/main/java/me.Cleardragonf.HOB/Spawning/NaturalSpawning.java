package me.Cleardragonf.HOB.Spawning;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;
import org.spongepowered.api.world.extent.Extent;

import me.Cleardragonf.HOB.ConfigurationManager;
import me.Cleardragonf.HOB.DayCounter;

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

    public void Hostiles(Location<World> spawnLocation) {
        // this is the real one List<String> list = Arrays.asList("BLAZE","CAVE_SPIDER","CREEPER","ENDER_CRYSTAL","ENDERMAN","GHAST","MAGMA_CUBE","PIG_ZOMBIE","SILVERFISH","SKELETON","SLIME","SPIDER","WITCH","ZOMBIE","NONE");
        List<String> list = Arrays.asList("BLAZE");
        Random rand = new Random();
        String listResult = list.get(rand.nextInt(list.size()));

        if(listResult == "BLAZE"){
                    Extent extent = spawnLocation.getExtent();
                    SpawnTesting nextLocation = new SpawnTesting();
                    Entity entity = extent.createEntity(EntityTypes.BLAZE, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("BLAZE"));
        }
        if(listResult == "CAVE_SPIDER"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.CAVE_SPIDER, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("CAVE_SPIDER"));
                }
            }

        }
        if(listResult == "CREEPER"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Creeper", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.CREEPER, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("CREEPER"));
                }
            }

        }
        if(listResult == "ENDERMAN"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Enderman", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.ENDERMAN, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("ENDERMAN"));
                }
            }

        }
        if(listResult == "GHAST"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Ghast", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.GHAST, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("GHAST"));
                }
            }
        }
        if(listResult == "MAGMA_CUBE"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.MAGMA_CUBE, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("MAGMA_CUBE"));
                }
            }
        }
        if(listResult == "PIG_ZOMBIE"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "PigZombie", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.PIG_ZOMBIE, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("PIG_ZOMBIE"));
                }
            }
        }
        if(listResult == "SILVERFISH"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "SilverFish", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "SilverFish", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.SILVERFISH, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("SILVERFISH"));
                }
            }
        }
        if(listResult == "SKELETON"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Skeleton", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.SKELETON, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("SKELETON"));
                }
            }
        }
        if(listResult == "SLIME"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Slime", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.SLIME, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("SLIME"));
                }
            }
        }
        if(listResult == "SPIDER"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Spider", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.SPIDER, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("SPIDER"));
                }
            }
        }
        if(listResult == "WITCH"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Witch", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.WITCH, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("WITCH"));
                }
            }
        }
        if(listResult == "ZOMBIE"){
            for (int i = 0; i< (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
                Random roll = new Random();
                int answer = roll.nextInt(100) + 1;
                if (answer <= (ConfigurationManager.getInstance().getConfig(DayCounter.getWeeklyConfig()).getNode("Natural Spawning!", "Zombie", "%").getInt())){
                    Extent extent = spawnLocation.getExtent();
                    Entity entity = extent.createEntity(EntityTypes.ZOMBIE, spawnLocation.getPosition());
                    Entity creeper = entity;
                    extent.spawnEntity(creeper);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("ZOMBIE"));
                }
            }
        }
        if(listResult == "NONE"){
            Sponge.getServer().getBroadcastChannel().send(Text.of("Nope nothing here"));
        }
    }

    //SAVE THE BELOW IT WORKS....WORKING ON THE ABOVE TO CUT OUT CODE
	 			/*if(DayCounter.getWeeklyConfig() == 1 ){
	 			List<String> list = Arrays.asList("BLAZE","CAVE_SPIDER","CREEPER","ENDER_CRYSTAL","ENDER_DRAGON","ENDERMAN","GHAST","GIANT",
	 					"MAGMA_CUBE","PIG_ZOMBIE","SILVERFISH","SKELETON","SLIME","SPIDER","WITCH","WITHER","ZOMBIE","NONE","NONE","NONE");
	 			Random rand = new Random();
	 			String listResult = list.get(rand.nextInt(list.size()));

	 			if(listResult == "BLAZE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Blaze", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.BLAZE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("BLAZE"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CAVE_SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CAVE_SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CAVE_SPIDER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CREEPER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Creeper", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CREEPER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CREEPER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDER_DRAGON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ENDER_DRAGON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDER_DRAGON"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDERMAN"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Enderman", "%").getInt())){
		 			Extent extent = spawnLocation.getExtent();
		 		    Entity entity = extent.createEntity(EntityTypes.ENDERMAN, spawnLocation.getPosition());
		 		        Entity creeper = entity;
		 		        extent.spawnEntity(creeper,
		 		            Cause.source(EntitySpawnCause.builder()
		 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
		 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDERMAN"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "GHAST"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Ghast", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GHAST, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GHAST"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "GIANT"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Giant", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GIANT, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GIANT"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "MAGMA_CUBE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.MAGMA_CUBE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("MAGMA_CUBE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "PIG_ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.PIG_ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("PIG_ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SILVERFISH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "SilverFish", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "SilverFish", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SILVERFISH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SILVERFISH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SKELETON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SKELETON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SKELETON"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SLIME"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Slime", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SLIME, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SLIME"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Spider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SPIDER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITCH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Witch", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITCH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITCH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITHER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Wither", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITHER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITHER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Zombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "NONE"){
	 				//Sponge.getServer().getBroadcastChannel().send(Text.of("Nope nothing here"));
	 			}
 			}
	 			if(DayCounter.getWeeklyConfig() == 2 ){
	 			List<String> list = Arrays.asList("BLAZE","CAVE_SPIDER","CREEPER","ENDER_CRYSTAL","ENDER_DRAGON","ENDERMAN","GHAST","GIANT",
	 					"MAGMA_CUBE","PIG_ZOMBIE","SILVERFISH","SKELETON","SLIME","SPIDER","WITCH","WITHER","ZOMBIE","NONE","NONE","NONE");
	 			Random rand = new Random();
	 			String listResult = list.get(rand.nextInt(list.size()));
	 			if(listResult == "BLAZE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Blaze", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.BLAZE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("BLAZE"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CAVE_SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CAVE_SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CAVE_SPIDER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CREEPER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Creeper", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CREEPER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CREEPER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDER_DRAGON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ENDER_DRAGON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDER_DRAGON"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDERMAN"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Enderman", "%").getInt())){
		 			Extent extent = spawnLocation.getExtent();
		 		    Entity entity = extent.createEntity(EntityTypes.ENDERMAN, spawnLocation.getPosition());
		 		        Entity creeper = entity;
		 		        extent.spawnEntity(creeper,
		 		            Cause.source(EntitySpawnCause.builder()
		 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
		 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDERMAN"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "GHAST"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Ghast", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GHAST, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GHAST"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "GIANT"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Giant", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GIANT, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GIANT"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "MAGMA_CUBE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.MAGMA_CUBE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("MAGMA_CUBE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "PIG_ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.PIG_ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("PIG_ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SILVERFISH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "SilverFish", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "SilverFish", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SILVERFISH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SILVERFISH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SKELETON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SKELETON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SKELETON"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SLIME"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Slime", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SLIME, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SLIME"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Spider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SPIDER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITCH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Witch", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITCH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITCH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITHER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Wither", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITHER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITHER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Zombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "NONE"){
	 				//Sponge.getServer().getBroadcastChannel().send(Text.of("Nope nothing here"));
	 			}
 			}
	 			if(DayCounter.getWeeklyConfig() == 3 ){
	 			List<String> list = Arrays.asList("BLAZE","CAVE_SPIDER","CREEPER","ENDER_CRYSTAL","ENDER_DRAGON","ENDERMAN","GHAST","GIANT",
	 					"MAGMA_CUBE","PIG_ZOMBIE","SILVERFISH","SKELETON","SLIME","SPIDER","WITCH","WITHER","ZOMBIE","NONE","NONE","NONE");
	 			Random rand = new Random();
	 			String listResult = list.get(rand.nextInt(list.size()));
	 			if(listResult == "BLAZE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Blaze", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.BLAZE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("BLAZE"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CAVE_SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CAVE_SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CAVE_SPIDER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CREEPER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Creeper", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CREEPER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CREEPER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDER_DRAGON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ENDER_DRAGON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDER_DRAGON"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDERMAN"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Enderman", "%").getInt())){
		 			Extent extent = spawnLocation.getExtent();
		 		    Entity entity = extent.createEntity(EntityTypes.ENDERMAN, spawnLocation.getPosition());
		 		        Entity creeper = entity;
		 		        extent.spawnEntity(creeper,
		 		            Cause.source(EntitySpawnCause.builder()
		 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
		 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDERMAN"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "GHAST"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Ghast", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GHAST, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GHAST"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "GIANT"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Giant", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GIANT, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GIANT"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "MAGMA_CUBE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.MAGMA_CUBE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("MAGMA_CUBE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "PIG_ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.PIG_ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("PIG_ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SILVERFISH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "SilverFish", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "SilverFish", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SILVERFISH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SILVERFISH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SKELETON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SKELETON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SKELETON"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SLIME"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Slime", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SLIME, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SLIME"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Spider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SPIDER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITCH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Witch", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITCH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITCH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITHER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Wither", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITHER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITHER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Zombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "NONE"){
	 				//Sponge.getServer().getBroadcastChannel().send(Text.of("Nope nothing here"));
	 			}
 			}
	 			if(DayCounter.getWeeklyConfig() == 4 ){
	 			List<String> list = Arrays.asList("BLAZE","CAVE_SPIDER","CREEPER","ENDER_CRYSTAL","ENDER_DRAGON","ENDERMAN","GHAST","GIANT",
	 					"MAGMA_CUBE","PIG_ZOMBIE","SILVERFISH","SKELETON","SLIME","SPIDER","WITCH","WITHER","ZOMBIE","NONE","NONE","NONE");
	 			Random rand = new Random();
	 			String listResult = list.get(rand.nextInt(list.size()));
	 			if(listResult == "BLAZE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Blaze", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.BLAZE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("BLAZE"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CAVE_SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CAVE_SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CAVE_SPIDER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CREEPER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Creeper", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CREEPER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CREEPER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDER_DRAGON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ENDER_DRAGON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDER_DRAGON"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDERMAN"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Enderman", "%").getInt())){
		 			Extent extent = spawnLocation.getExtent();
		 		    Entity entity = extent.createEntity(EntityTypes.ENDERMAN, spawnLocation.getPosition());
		 		        Entity creeper = entity;
		 		        extent.spawnEntity(creeper,
		 		            Cause.source(EntitySpawnCause.builder()
		 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
		 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDERMAN"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "GHAST"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Ghast", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GHAST, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GHAST"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "GIANT"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Giant", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GIANT, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GIANT"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "MAGMA_CUBE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.MAGMA_CUBE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("MAGMA_CUBE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "PIG_ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.PIG_ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("PIG_ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SILVERFISH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "SilverFish", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "SilverFish", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SILVERFISH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SILVERFISH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SKELETON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SKELETON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SKELETON"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SLIME"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Slime", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SLIME, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SLIME"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Spider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SPIDER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITCH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Witch", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITCH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITCH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITHER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Wither", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITHER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITHER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Zombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "NONE"){
	 				//Sponge.getServer().getBroadcastChannel().send(Text.of("Nope nothing here"));
	 			}
 			}
	 			if(DayCounter.getWeeklyConfig() == 5 ){
	 			List<String> list = Arrays.asList("BLAZE","CAVE_SPIDER","CREEPER","ENDER_CRYSTAL","ENDER_DRAGON","ENDERMAN","GHAST","GIANT",
	 					"MAGMA_CUBE","PIG_ZOMBIE","SILVERFISH","SKELETON","SLIME","SPIDER","WITCH","WITHER","ZOMBIE","NONE","NONE","NONE");
	 			Random rand = new Random();
	 			String listResult = list.get(rand.nextInt(list.size()));
	 			if(listResult == "BLAZE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Blaze", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.BLAZE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("BLAZE"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CAVE_SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CAVE_SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CAVE_SPIDER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "CREEPER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Creeper", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.CREEPER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("CREEPER"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDER_DRAGON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ENDER_DRAGON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDER_DRAGON"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "ENDERMAN"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Enderman", "%").getInt())){
		 			Extent extent = spawnLocation.getExtent();
		 		    Entity entity = extent.createEntity(EntityTypes.ENDERMAN, spawnLocation.getPosition());
		 		        Entity creeper = entity;
		 		        extent.spawnEntity(creeper,
		 		            Cause.source(EntitySpawnCause.builder()
		 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
		 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ENDERMAN"));
			  			  }
			  		  }

	 			}
	 			if(listResult == "GHAST"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Ghast", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GHAST, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GHAST"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "GIANT"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Giant", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.GIANT, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("GIANT"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "MAGMA_CUBE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.MAGMA_CUBE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("MAGMA_CUBE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "PIG_ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.PIG_ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("PIG_ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SILVERFISH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "SilverFish", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "SilverFish", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SILVERFISH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SILVERFISH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SKELETON"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SKELETON, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SKELETON"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SLIME"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Slime", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SLIME, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SLIME"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "SPIDER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Spider", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.SPIDER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("SPIDER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITCH"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Witch", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITCH, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITCH"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "WITHER"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Wither", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.WITHER, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("WITHER"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "ZOMBIE"){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Zombie", "%").getInt())){
				 			Extent extent = spawnLocation.getExtent();
				 		    Entity entity = extent.createEntity(EntityTypes.ZOMBIE, spawnLocation.getPosition());
				 		        Entity creeper = entity;
				 		        extent.spawnEntity(creeper,
				 		            Cause.source(EntitySpawnCause.builder()
				 		            .entity(creeper).type(SpawnTypes.PLUGIN).build()).build());
				 				//Sponge.getServer().getBroadcastChannel().send(Text.of("ZOMBIE"));
			  			  }
			  		  }
	 			}
	 			if(listResult == "NONE"){
	 				//Sponge.getServer().getBroadcastChannel().send(Text.of("Nope nothing here"));
	 			}
 			}

 		}*/
    public String getVariableConfig1(){
        return Config;
    }
}