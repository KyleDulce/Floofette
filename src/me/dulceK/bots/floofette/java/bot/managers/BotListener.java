package me.dulceK.bots.floofette.java.bot.managers;

import me.dulceK.bots.floofette.java.Enum.*;
import me.dulceK.bots.floofette.java.console.*;
import sx.blah.discord.api.events.*;
import sx.blah.discord.handle.impl.events.guild.channel.message.*;

public class BotListener {
	
	public static final String CMD_PREFIX = ";";
	
	@EventSubscriber
	public void onMessageEvent(MessageReceivedEvent event) {
		
		if(event.getMessage().getContent().toLowerCase().startsWith(CMD_PREFIX)) {
			CommandProcess.processCommand(event.getMessage(), CMD_PREFIX);
			Console.out(SyncThread.BOT, "Command Processed");
		}
			
		
	}
	
}
