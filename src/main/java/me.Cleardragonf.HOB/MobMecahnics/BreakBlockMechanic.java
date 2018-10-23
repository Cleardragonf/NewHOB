package me.Cleardragonf.HOB.MobMecahnics;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.Property;
import org.spongepowered.api.data.property.block.PassableProperty;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.living.Agent;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.util.blockray.BlockRay;

import me.Cleardragonf.HOB.DayCounter;

public class BreakBlockMechanic {

    public void onEntitySpawn(SpawnEntityEvent event){
        //This is the testing code v
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
        if(DayCounter.getWeeklyConfig() == 1){
            if(spawnedEntity.getType().equals(EntityTypes.CREEPER)){
                if(spawnedEntity.getType().equals(EntityTypes.CREEPER)){
                    Agent m = null;
                    @SuppressWarnings("null")
                    Player p = (Player) ((Agent)m).getTarget().get();

                    boolean a = 					    BlockRay.from(m.getLocation()).to(p.getLocation().getPosition())
                            .skipFilter(h -> h.getLocation().getBlockType().getProperty(PassableProperty.class).map(Property::getValue).orElse(false)).build().hasNext();
                    if (a == true){
                        p.sendMessage(Text.of("Watch out!"));
                        Sponge.getServer().getBroadcastChannel().send(Text.of("Oh Boy"));
                    }
                }
            }
        }
    }
}