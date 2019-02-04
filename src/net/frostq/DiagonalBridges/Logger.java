package net.frostq.DiagonalBridges;

public class Logger {
	public static boolean printConsole = true, trashLog = false, logging = true, errLogging = true;
	
	private static void log(Object m, int mode) {
		
	}
	
	public static void log(Object m, boolean isTrash) {
		if(logging)
			log(m, 0);
		
		if(printConsole && ((trashLog && isTrash) || (!isTrash)))
			System.out.println(m);
	}
	
	public static void err(Object m) {
		if(errLogging) {
			System.err.println(m);
			log(m, -1);
		}
	}
	
	public static void log(Object header, Object m, Object footer, boolean isTrash) {
		log("" + header + " " + m + footer + "", isTrash);
	}
	
	public static void log(Object header, Object m, boolean isTrash) {
		log(header, m, "", isTrash);
	}
	
	public static void err(Object header, Object m, Object footer) {
		err("" + header + " " + m + footer + "");
	}
	
	public static void err(Object header, Object m) {
		err(header, m, "");
	}
}