package me.dulceK.bots.floofette.java.console;

import java.sql.*;
import java.text.*;
import java.util.*;

import me.dulceK.bots.floofette.java.Enum.*;

public class Console {
	
	public static void out(SyncThread thread, String message) {
		//get time
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		
		
		System.out.println(thread.getName().replaceAll("[TIME]", format.format(cal.getTime())) + message);
	}

}
