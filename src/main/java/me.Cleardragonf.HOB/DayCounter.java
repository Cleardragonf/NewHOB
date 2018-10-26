//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.Cleardragonf.HOB;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.format.TextFormat;
import org.spongepowered.api.text.format.TextStyles;
import org.spongepowered.api.world.storage.WorldProperties;

import java.awt.*;

public class DayCounter {
    public static int days = ConfigurationManager.getInstance().getTimeTrack().getNode("========Time Tracking========", "Day: ").getInt();
    public static int CustWeek = 1;
    public static int config = 1;
    public static int week = 1;

    public DayCounter() {
    }

    public void Days() {
        long currentTime = Sponge.getGame().getServer().getDefaultWorld().get().getWorldTime();
        long base = 23900L;
        if (31 > days) {
            if (base <= currentTime && 24000L >= currentTime) {
                ++days;
                Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(0L);
                ConfigurationManager.getInstance().getTimeTrack().getNode(new Object[]{"========Time Tracking========", "Day: "}).setValue(days);
                ConfigurationManager.getInstance().saveTime();
                if (7 >= days) {
                    week = 1;
                } else if (14 >= days) {
                    if (8 <= days) {
                        week = 2;
                    }
                } else if (21 >= days) {
                    if (15 <= days) {
                        week = 3;
                    }
                } else if (28 >= days) {
                    if (22 <= days) {
                        week = 4;
                    }
                } else if (30 >= days) {
                    if (29 <= days) {
                        Text colored = Text.builder("WELCOME PLAYERS...").color(TextColors.RED).style(TextStyles.BOLD).append(Text.builder(" TO HOB NIGHT!!!!").color(TextColors.DARK_RED).style(TextStyles.BOLD).build()).build();
                        Sponge.getServer().getBroadcastChannel().send(Text.of(colored));
                        week = 5;
                    }
                } else {
                    week = 1;
                }
            }
        } else {
            days = 1;
            Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(0L);
        }

    }

    public static int getCustWeek() {
        return CustWeek;
    }

    public static int getWeeklyConfig() {
        return week;
    }

    public static int getCustDays() {
        return days;
    }
}
