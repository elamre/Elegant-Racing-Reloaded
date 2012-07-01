package com.race.data;

import org.lwjgl.input.Keyboard;

public class Configuration {
	/** The base directory for all resources */
	public static String BASE_DIRECTORY = "resource/";

	/** True, if the log is saved to a file. otherwise System.out is used */
	public static boolean LOG_TO_FILE = false;

	/** The global log level. See {@link Logger} */
	public static int LOG_LEVEL = Logger.ALL;

	/** The log file directory */
	public static String LOG_DIRECTORY = BASE_DIRECTORY + "log/";

	/** The server port */
	public static int SERVER_PORT = 6789;

	// ----------Mappable keyboard functions----------//
	/** the forward key */
	public static int FORWARD = Keyboard.KEY_W;

	/** the back key */
	public static int BACKWARDS = Keyboard.KEY_S;

	/** the left key */
	public static int LEFT = Keyboard.KEY_A;

	/** the right key */
	public static int RIGHT = Keyboard.KEY_D;

	/** The reload button */
	public static int BREAK = Keyboard.KEY_SPACE;
	// -----------------------------------------------//
}
