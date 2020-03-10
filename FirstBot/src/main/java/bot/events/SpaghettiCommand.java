package bot.events;

import java.io.File;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SpaghettiCommand extends ListenerAdapter{

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)  {
		String i = e.getMessage().getContentRaw().toLowerCase();
		
		if (i.contains("spaghetti") || i.contentEquals("!!spaghetti")) {
			
			File spag = new File("/Users/jake/Downloads/spag.mp4");
			e.getChannel().sendFile(spag).queue();
			
		}	
	}
}
