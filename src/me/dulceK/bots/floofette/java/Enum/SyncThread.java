package me.dulceK.bots.floofette.java.Enum;

public enum SyncThread {

	CONSOLE("Console"),
	BOT("Bot"),
	MAIN("Main"),
	;
	
	private String name;
	
	private SyncThread(String arg) {
		name = arg;
	}
	
	public String getName() {
		return ("[{TIME}" + name + " Thread]");
	}
	
}
