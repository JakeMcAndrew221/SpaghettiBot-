package bot;

import bot.events.CatCommand;
import bot.events.CursedCommand;
import bot.events.DogCommand;
import bot.events.HelpCommand;
import bot.events.MemeCommand;
import bot.events.NSFWCommand;
import bot.events.ReactionCommand;
import bot.events.SpaghettiCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
	public static void main(String args[]) throws Exception{
		
		 JDA jda = new JDABuilder("NjgyNzY0MjI4OTAxNjAxMzEx.Xlhv0A.aARfSEchsy3ocAcrLigA-5anBo4").build();
		 jda.addEventListener(new MemeCommand());
		 jda.addEventListener(new NSFWCommand());
		 jda.addEventListener(new ReactionCommand());
		 jda.addEventListener(new CursedCommand());
		 jda.addEventListener(new SpaghettiCommand());
		 jda.addEventListener(new CatCommand());
		 jda.addEventListener(new DogCommand());
		 jda.addEventListener(new HelpCommand());
		 
		 
	}

}
