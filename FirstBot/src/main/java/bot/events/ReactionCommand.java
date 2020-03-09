package bot.events;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONTokener;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReactionCommand extends ListenerAdapter{
	private InputStream filee;
	
	public ReactionCommand () {
		call();
		
	}
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)  {
		String i = e.getMessage().getContentRaw();
		
		if (i.equalsIgnoreCase("!!reaction")) {
			e.getChannel().sendFile(filee, "image.png").queue();
			call();
		}	
		
	}
	
	public void call () {
		
		try {
			URL memeURL = new URL("https://meme-api.herokuapp.com/gimme/reactionpics");
			JSONTokener t = new JSONTokener(memeURL.openStream());
			JSONObject obj = new JSONObject(t);
			String i = obj.getString("url");
			this.filee = new URL(i).openStream();	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}