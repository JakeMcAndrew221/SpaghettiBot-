package bot;

import bot.events.CatCommand;
import bot.events.CursedCommand;
import bot.events.DogCommand;
import bot.events.HelpCommand;
import bot.events.MemeCommand;
import bot.events.NSFWCommand;
import bot.events.ReactionCommand;
import bot.events.SpaghettiCommand;
import bot.events.WowCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
	public static void main(String args[]) throws Exception{
		
		 JDA jda = new JDABuilder("token").build();
		 jda.addEventListener(new MemeCommand());
		 jda.addEventListener(new NSFWCommand());
		 jda.addEventListener(new ReactionCommand());
		 jda.addEventListener(new CursedCommand());
		 jda.addEventListener(new SpaghettiCommand());
		 jda.addEventListener(new CatCommand());
		 jda.addEventListener(new DogCommand());
		 jda.addEventListener(new HelpCommand());
		 jda.addEventListener(new WowCommand());
		 
		 
	}

}
