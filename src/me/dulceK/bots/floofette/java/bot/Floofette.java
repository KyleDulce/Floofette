package me.dulceK.bots.floofette.java.bot;

import java.util.*;

import me.dulceK.bots.floofette.java.*;
import me.dulceK.bots.floofette.java.Enum.*;
import me.dulceK.bots.floofette.java.bot.managers.*;
import me.dulceK.bots.floofette.java.console.*;
import sx.blah.discord.api.*;
import sx.blah.discord.api.events.*;
import sx.blah.discord.handle.obj.*;

public class Floofette {

	private EventDispatcher eventDis;
	
	private static IDiscordClient client;
	
	public Floofette() {
		
		Console.out(SyncThread.BOT, "Constructing Bot");
		
		//setup the builder
		ClientBuilder builder = new ClientBuilder();
		builder.withToken("NDE0NjA1NDU2MzQ3MTAzMjMy.DWu1nQ.aNbUSF8uqxPTGXTSh91x6o6yyzs");
		
		Console.out(SyncThread.BOT, "attemping to build bot");
		try {
			client = builder.build();
		} catch (Exception e) {
			Console.out(SyncThread.BOT, "Failed shutting down");
			Startup.stop(e);
		}
		
//		Console.out(SyncThread.BOT, "Build sucessful");
//		
//		Scanner in = new Scanner(System.in);
////		System.out.println("id to delete");
////		long a = in.nextLong();
////		
//		System.out.println("Deleting: " + client.getChannelByID(409100585057517568l).getName());
//		
//		System.out.println("are you sure? 1 yes 2 no");
//		int b = in.nextInt();
//		
//		if(b == 1) {
//			client.getChannelByID(409100585057517568l).delete();
//		}
//		
//		in.close();
		
	}
	
	public void init() {
		Console.out(SyncThread.BOT, "Initialisation of bot starting");
		
		eventDis = client.getDispatcher();
		eventDis.registerListener(new BotListener());
		
		Console.out(SyncThread.BOT, "Logging in");
		client.login();
		Console.out(SyncThread.BOT, "Logged in");
		
		Console.out(SyncThread.BOT, "Initialisation complete");
		
		for(IChannel ch : client.getChannels()) {
			//Console.out(SyncThread.BOT, "Name: " + ch.getName() + "id: " + ch.getLongID());
			System.out.println("Name: " + ch.getName() + "id: " + ch.getLongID());
		}
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("id to delete");
//		long a = in.nextLong();
//		
//		System.out.println("Deleting: " + client.getChannelByID(a).getName());
//		
//		System.out.println("are you sure? 1 yes 2 no");
//		int b = in.nextInt();
//		
//		if(b == 1) {
//			client.getChannelByID().delete();
//		}
	
		//client.getChannelByID()
		
	}
	
	public void logout() {
		Console.out(SyncThread.BOT, "Logging out");
		client.logout();
		Console.out(SyncThread.BOT, "Logged out");
	}
	
}
