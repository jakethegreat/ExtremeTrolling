package com.github.jakethegreat.ExtremeTrolling;
 
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
 
public final class Main extends JavaPlugin {
	@Override
    public void onEnable(){
		
    }
 
    @Override
    public void onDisable() {
        
    }
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("ignite")){
            Player s = (Player)sender;
            Player target = s.getServer().getPlayer(args[0]);
            int Time = Integer.parseInt(args[1]);
            target.setFireTicks(Time);
            return true;
        }
        return false;
    }
 }
