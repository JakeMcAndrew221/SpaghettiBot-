package bot.events;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;
import org.json.JSONTokener;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class WowCommand extends ListenerAdapter{
	private InputStream filee;
	
	public WowCommand () {
		
		
	}
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)  {
		String i = e.getMessage().getContentRaw();
		
		if (i.equalsIgnoreCase("!!wow")) {
			e.getChannel().sendMessage("wow congrats dude, really, that's very cool. i just told everyone in my family about it, everybody thinks that's very impressive and asked me to congratulate you. they want to speak to you in person, if possible, to give you their regards. they also said they will tell our distant relatives in christmas supper and in NYE they will ignite fireworks that spell your name. i also told about this enormous deed to closer relatives, they had the same reaction. they asked for your address so they can send congratulatory cards and messages. my friends didn't believe me when i told them i knew the author of this gigantic feat, really, they were dumbstruck, they said they will make your name echo through years and years to come. when my neighbour found out about what you did, he was completely dumbstruck too, he wanted to know who you are and he asked (if you have the time, of course) if you could stop by to receive gifts, congratulations and handshakes. with the spreading of the news, a powerful businessman of the area decided to hire you as the CEO of his company because of this tremendous feat and at the same time an important international shareholder wants to sponsor you to give speeches and teach everybody how to do as you did so the world becomes a better place. you have become famous not only here but also everywhere, everybody knows who you are. the news spread really fast and mayors of all cities are setting up porticos, ballons, colossal boom speakers, anything that can make your name stand out more and see which city can congratulate you the hardest for this magnificent feat. here in my city, all the streets will be renamed after you beginning at the next mayoral term. a lot of countries that frowned upon ours, now, thanks to your deed, see us as a role model, a new hope. the lucky people who know about you say \"hey, that guy is my compatriot!\" and everybody shouts immediately after them \"").queue();
			e.getChannel().sendMessage("YES, YES, YES! yours is a good country\\\" thanks to that, tourism has exploded, everybody came here thanks to you, the inflow of international currency was huge, making our stockmarket take off and making our country the pillar for the solution of internation economic crisis. thanks to that, we are seen as role models, and we have surpassed the US and become the richest and most powerful nation in the world. all the logging companies were very moved by your deed and collectively decided to stop deforesting the tropical rainforests so the human race can thrive in this planet more and more. the worldwide chaos due to the election of donald trump in the usa has ceased due to the fact that they are no longer the most powerful nation in the world. the Pope has sent his preachers all over the world to speak of your name and your deeds so you work is known by every creature that walks on the surface of this planet. also, because of you, the scientists at CERN have decided to stop experimenting with the large hadron collider, since the origins of the universe don't matter anymore comparing to the magnitude of your feat. the Mayans came back from the Andromeda galaxy and said you were the reason they decided to let us live beyond the year 2012. your feat was so incredible it ejected the alpha celestial body that was inhabiting the earth's orbit and threatening to destroy it. because of you, Akira Toryama decided to continue the dragon ball sagas, this time with a character in your honor. every tv show host, at the end of their show, now sends greetings to the whole country and one specially to you. keep on alway being this wonderful, hard working, beautiful, inspiring, manificent, good spirited, creative etc. person and always keep on doing stuff life this. Kept it up dude, and the world will be more and more a better place to live").queue();
		}	
		
	}
	
	

}