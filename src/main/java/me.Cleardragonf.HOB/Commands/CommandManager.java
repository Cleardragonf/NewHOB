package me.Cleardragonf.HOB.Commands;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

import me.Cleardragonf.HOB.DayCounter;

public class CommandManager implements CommandExecutor {

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        long time = Sponge.getGame().getServer().getDefaultWorld().get().getWorldTime();
        int day = DayCounter.getCustDays();

        if(!(src instanceof Player)){
            src.sendMessage(Text.of(TextColors.GREEN, "Time on the Server is: " + time + ", on the " + day + " day of the month"));
            return CommandResult.success();
        }
        Player player = (Player)src;

        player.sendMessage(Text.of(TextColors.BLUE, "Time on the Server is: " + time + ", on the " + day + " day of the month"));
        return CommandResult.success();

    }


}
