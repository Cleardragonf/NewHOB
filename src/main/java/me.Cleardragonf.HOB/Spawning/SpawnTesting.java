package me.Cleardragonf.HOB.Spawning;

import java.util.Optional;
import java.util.Random;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.property.block.GroundLuminanceProperty;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class SpawnTesting {
    static Random random = new Random();
    public void getSpace(final Player player){
        if (!(player == null)){
            Location<World> playersLocation = player.getLocation();
            Location<World> playersLocation2 = player.getLocation();
            Location<World> playersLocation3 = player.getLocation();
            Location<World> playersLocation4 = player.getLocation();


            int x1 = (int) (Math.floor(Math.random() *(100 - 10)) -10);
            int x2 = (int) (Math.floor(Math.random() *(100 - 10)) -10) * -1;

            int z1 = (int) (Math.floor(Math.random() *(100 - 10 ))-10);
            int z2 = (int) (Math.floor(Math.random() *(100 - 10 ))-10) * -1;


            playersLocation = playersLocation.add(x1, 0, z1);
            playersLocation2 = playersLocation2.add(x2, 0, z1);
            playersLocation3 = playersLocation3.add(x1, 0, z2);
            playersLocation4 = playersLocation4.add(x2, 0, z2);


            //run the four different quandrantse
            SpawnDecision TimeToTry = new SpawnDecision();
            Optional<Location<World>> Spawn1 = Sponge.getGame().getTeleportHelper().getSafeLocation(playersLocation, 50, 5);
            Optional<Location<World>> Spawn2 = Sponge.getGame().getTeleportHelper().getSafeLocation(playersLocation2, 50, 5);
            Optional<Location<World>> Spawn3 = Sponge.getGame().getTeleportHelper().getSafeLocation(playersLocation3, 50, 5);
            Optional<Location<World>> Spawn4 = Sponge.getGame().getTeleportHelper().getSafeLocation(playersLocation4, 50, 5);

            Location<World> Vector1 = Spawn1.get();
            Location<World> Vector2 = Spawn2.get();
            Location<World> Vector3 = Spawn3.get();
            Location<World> Vector4 = Spawn4.get();

            if(Spawn1.isPresent()){
                final Double optional = Vector1.getProperty(GroundLuminanceProperty.class).get().getValue();
                if(optional < 5){
                    TimeToTry.newCreeper(Vector1);
                    //Sponge.getServer().getBroadcastChannel().send(Text.of("Vector 1 is performing"));
                }else{
                    return;
                }
            }else{
                return;
            }
            if(Spawn2.isPresent()){
                final Double optional = Vector2.getProperty(GroundLuminanceProperty.class).get().getValue();
                if(optional < 5){
                    TimeToTry.newCreeper(Vector2);
                    //Sponge.getServer().getBroadcastChannel().send(Text.of("Vector 2 is performing"));

                }else{
                    return;
                }
            }else{
                return;
            }
            if(Spawn3.isPresent()){
                final Double optional = Vector3.getProperty(GroundLuminanceProperty.class).get().getValue();
                if(optional < 5){
                    TimeToTry.newCreeper(Vector3);
                    //Sponge.getServer().getBroadcastChannel().send(Text.of("Vector 3 is performing"));

                }else{
                    return;
                }
            }else{
                return;
            }
            if(Spawn4.isPresent()){
                final Double optional = Vector4.getProperty(GroundLuminanceProperty.class).get().getValue();
                if(optional < 5){
                    TimeToTry.newCreeper(Vector4);
                    //Sponge.getServer().getBroadcastChannel().send(Text.of("Vector 4 is performing"));

                }else{
                    return;
                }
            }else{
                return;
            }
            //}
        }
    }
}