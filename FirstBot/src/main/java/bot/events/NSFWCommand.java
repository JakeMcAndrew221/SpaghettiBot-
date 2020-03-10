package bot.events;



import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class NSFWCommand extends ListenerAdapter{
	private InputStream filee;
	private int whichSubreddit;
	
	public NSFWCommand () {
		call();
		
	}
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)  {
		String i = e.getMessage().getContentRaw();
		
		if (i.equalsIgnoreCase("!!nsfw")) {
			if (e.getChannel().isNSFW()) {
				e.getChannel().sendFile(filee, "image.png").queue();
				call();
			} else {
				e.getChannel().sendMessage("This channel is not a NSFW channel!").queue();
			}
			
		}	
		
	}
	
	public void call () {
		String subredditName = "";
		if (this.whichSubreddit == 0) {
			subredditName = "nsfw";
		} else if (this.whichSubreddit == 1) {
			subredditName = "pussy";
		} else {
			subredditName = "gonewild";
		}
		newSubreddit();
		
		try {
			URL memeURL = new URL("https://meme-api.herokuapp.com/gimme/" +subredditName );
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
	
	public void newSubreddit() {
		this.whichSubreddit = new Random().nextInt(3);
	}

}
