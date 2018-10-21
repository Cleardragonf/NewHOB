package me.Cleardragonf.HOB.Spawning;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;

public class BonusSpawning {
    @Listener
    public void checkEntitySpawn(SpawnEntityEvent event){
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
        else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.CHESTED_MINECART)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.FALLING_BLOCK)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.ITEM)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.UNKNOWN)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.TIPPED_ARROW)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.SPECTRAL_ARROW)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.SMALL_FIREBALL)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.FIREBALL)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.ITEM_FRAME)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.THROWN_EXP_BOTTLE)){
            return;
        }
        else if(spawnedEntity.getType().equals(EntityTypes.EXPERIENCE_ORB)){
        }

        else{
        }

    }
}