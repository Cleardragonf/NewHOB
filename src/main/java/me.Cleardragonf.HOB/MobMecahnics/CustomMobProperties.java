package me.Cleardragonf.HOB.MobMecahnics;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.living.complex.EnderDragonPart;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;

import me.Cleardragonf.HOB.ConfigurationManager;
import me.Cleardragonf.HOB.DayCounter;

import java.util.Optional;


public class CustomMobProperties {
    @Listener
    public void entityData(SpawnEntityEvent event){
        //This is the testing code v
        Entity spawnedEntity = null;
        for(Entity entity : event.getEntities()){//
            if(entity != null){
                spawnedEntity = entity;
                break;
            }
        }
        if(spawnedEntity == null){
            return;
        }

        String customEntity = spawnedEntity.getType().getId();

        int weekNumber = DayCounter.getWeeklyConfig();
        String week;
        if(weekNumber != 5){
            week = "Week " + weekNumber;
        }else{
            week = "HOB Night";
        }

        if(customEntity != null){
            //Custom Health
            if(!ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", customEntity, week, "=====Custom Properties=====", "Enable Custom Health: ").isVirtual()){
                if(ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", customEntity, week, "=====Custom Properties=====", "Enable Custom Health: ").getBoolean() == true){
                    spawnedEntity.offer(Keys.MAX_HEALTH, ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", customEntity, week, "=====Custom Properties=====", "Custom Health: ").getDouble());
                    CustomHealth giveFullHealth = new CustomHealth();
                    giveFullHealth.heal(spawnedEntity);
                }
            }
            //Custom Explosion Radius
            if(!ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", customEntity, week, "=====Custom Properties=====", "Enable Custom Explosion: ").isVirtual()){
                if(ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", customEntity, week, "=====Custom Properties=====", "Enable Custom Explosion: ").getBoolean() == true){
                    Optional<Integer> blast = Optional.ofNullable(ConfigurationManager.getInstance().getConfig().getNode("=============Entity Control============", customEntity, week, "=====Custom Properties=====", "Explosion Radius: ").getInt());
                    spawnedEntity.offer(Keys.EXPLOSION_RADIUS, blast);
                }
            }
        }

        if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
            Boolean AngryValue = ConfigurationManager.getInstance().getConfig().getNode("Custom Properties", "WOLF", "Angry").getBoolean();
            spawnedEntity.offer(Keys.MAX_HEALTH, (double)45);

            CustomHealth a = new CustomHealth();
            a.heal(spawnedEntity);
        }

        else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
            spawnedEntity.offer(Keys.MAX_HEALTH, (double)45);
            CustomHealth a = new CustomHealth();
            a.heal(spawnedEntity);
        }


    }
}