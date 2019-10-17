package me.dulceK.bots.floofette.java;

import me.dulceK.bots.floofette.java.Enum.*;
import me.dulceK.bots.floofette.java.bot.*;
import me.dulceK.bots.floofette.java.console.*;

public class Startup {

	private static Floofette bot;
	private static Console console;
	
	public static void main(String[] args) {
		Console.out(SyncThread.MAIN, "Program started Starting");
		start();
		bot.init();
	}
	
	private static void start() {
		bot = new Floofette();
	}
	
	public static void stop() {
		Console.out(SyncThread.MAIN, "Program stopping");
		bot.logout();
		Console.out(SyncThread.MAIN, "TERMINATED");
		System.exit(0);
	}
	
	public static void stop(Exception e) {
		bot.logout();
		Console.out(SyncThread.MAIN, "Program Crashed, printing stack trace: TERMINATED after stack");
		System.out.println("*********************************************************");
		e.printStackTrace();
	}

}
