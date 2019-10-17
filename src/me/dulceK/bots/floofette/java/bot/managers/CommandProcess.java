package me.dulceK.bots.floofette.java.bot.managers;

import java.util.*;

import me.dulceK.bots.floofette.java.*;
import me.dulceK.bots.floofette.java.Enum.*;
import me.dulceK.bots.floofette.java.console.*;
import sx.blah.discord.handle.obj.*;

public class CommandProcess {
	
	public static void processCommand(IMessage message, String arg) {
		
		String[] content = message.getContent().toLowerCase().replaceFirst(arg, "").split(" ");
		
		if(content[0].equalsIgnoreCase("talk")) {
			Console.out(SyncThread.BOT, "found talk");
			processTalk(content.toString().replaceFirst("talk ", ""), message);
			return;
		}
			
		if(content[0].equalsIgnoreCase("coin")) {
			Console.out(SyncThread.BOT, "found coin");
			processCoin(message);
			return;
		}
		
		if(content[0].equalsIgnoreCase("play")) {
			Console.out(SyncThread.BOT, "found play");
			if(content.length >= 2)
				processPlay(message);
			else
				message.reply("Not enough arguments, USAGE: ;play <Link>");
			return;
		}
		
		if(content[0].equalsIgnoreCase("shutdown")) {
			Console.out(SyncThread.BOT, "found shutdown");
			message.reply("Logging off");
			Startup.stop();
		}
		
	}
	
	private static void processPlay(IMessage message) {
		ICategory category = message.getChannel().getCategory();
		
	}

	//commands
	private static void processCoin(IMessage arg) {
		int choosen = new Random().nextInt(2);
		
		if(choosen == 0)
			arg.reply("Heads!");
		else
			arg.reply("Tails!");
	}
	
	private static void processTalk(String message, IMessage arg) {	
		boolean isPos = new Random().nextBoolean();
		
		if(isPos)
			arg.reply(Comment.POSITIVE.getComment());
		else
			arg.reply(Comment.NEGATIVE.getComment());
		
	}
	
}
