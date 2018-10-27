package me.Cleardragonf.HOB.MobMecahnics;

import java.util.Optional;

import org.spongepowered.api.data.manipulator.mutable.entity.HealthData;
import org.spongepowered.api.data.value.mutable.MutableBoundedValue;
import org.spongepowered.api.entity.Entity;

public class CustomHealth {

    public void heal(Entity spawnedEntity){
        Optional<HealthData> healthOptional = spawnedEntity.get(HealthData.class);
        if (healthOptional.isPresent()) {
            HealthData healthData = healthOptional.get();

            double maxHealth = healthData.maxHealth().get();
            MutableBoundedValue<Double> currentHealth = healthData.health();
            currentHealth.set(maxHealth);
            healthData.set(currentHealth);

            spawnedEntity.offer(healthData);
        }
    }
}