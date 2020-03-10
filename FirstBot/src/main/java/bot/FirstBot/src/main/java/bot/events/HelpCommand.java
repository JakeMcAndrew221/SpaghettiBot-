package bot.events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelpCommand extends ListenerAdapter{
	
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)  {
		String i = e.getMessage().getContentRaw();
		
		if (i.equalsIgnoreCase("!!help")) {
			
			EmbedBuilder eb = new EmbedBuilder()
					.setThumbnail("https://pinchofyum.com/wp-content/uploads/spaghetti-9-819x1024-320x180.jpg")
					.setTitle("Commands list")
					.addField("Commands", "!!cat \n !!dog (having issues with this command) \n !!nsfw  \n !!meme \n !!reaction \n !!cursed \n !!help "
							+ "\n !!wow \n !!spaghetti",true)
					.setFooter("Message Hexyy#1337 to report any bugs with the bot or to suggest features :)");
			
			
			
			e.getChannel().sendMessage(eb.build()).queue();
					
			
			
			
		}	
		
	}

}
