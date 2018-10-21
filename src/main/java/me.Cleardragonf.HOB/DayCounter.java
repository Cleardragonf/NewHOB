package me.Cleardragonf.HOB;

import org.spongepowered.api.Sponge;

public class DayCounter {

    //this right here is used for Keeping track of the days. 1-30
    public static int days = ConfigurationManager.getInstance().getTimeTrack().getNode("========Time Tracking========", "Day: ").getInt();

    //this right here is used for keeping track of the Week 1-5
    public static int CustWeek = 1;

    //this right here is used for keeping track of the config 1-5
    public static int config = 1;

    public void Days(){
        long currentTime = Sponge.getGame().getServer().getDefaultWorld().get().getWorldTime();
        long base = 23000;
        if (31 > DayCounter.days){
            if (base <= currentTime){
                if(24000 >= currentTime){
                    DayCounter.days = DayCounter.days + 1;
                    Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(0);
                    ConfigurationManager.getInstance().getTimeTrack().getNode("========Time Tracking========", "Day: ").setValue(days);
                    ConfigurationManager.getInstance().saveTime();
                    if(7 >= DayCounter.days){
                        DayCounter.week = 1;
                    }
                    else if(14 >= DayCounter.days){
                        if(8<= DayCounter.days){
                            DayCounter.week = 2;
                        }
                    }
                    else if(21 >= DayCounter.days){
                        if(15 <= DayCounter.days){
                            DayCounter.week = 3;
                        }
                    }
                    else if(28 >= DayCounter.days){
                        if(22 <= DayCounter.days){
                            DayCounter.week = 4;
                        }
                    }
                    else if(30 >= DayCounter.days){
                        if(29 <= DayCounter.days){
                            DayCounter.week = 5;
                        }
                    }
                    else{
                        DayCounter.week = 1;
                    }
                }
            }
        }else{
            DayCounter.days = 1;
            Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(0);
        }


    }
    public static int week = 1;

    //this instance is responsible for getting the correct Configuration File
    public static int getCustWeek(){
        return CustWeek;
    }
    public static int getWeeklyConfig(){
        return week;
    }
    //this instance is responsible for getting the correct Days.
    public static int getCustDays(){
        return days;
    }
}