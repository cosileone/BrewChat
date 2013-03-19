package GUI;

import java.awt.*;

public class Constants {
	/* JFrame Constants */
	public static final Dimension SCREENSIZE = Toolkit.getDefaultToolkit().getScreenSize();
	public static final Dimension GUI_DIMENSIONS = setGUIDimensions(SCREENSIZE);
	public static final String APP_TITLE = "Brew Chat";
	/* Tab Titles */
	public static final String CHAT_TAB_TITLE = "Chat Room";
	public static final String CHAT_TAB_TOOLTIP = "Talk to the bros";
	public static final String LEAGUE_TAB_TITLE = "League Stats";
	public static final String LEAGUE_TAB_TOOLTIP = "Fetch League of Legends stats";
	
	private static final Dimension setGUIDimensions(Dimension screensize){
		return new Dimension((int)(screensize.width * .5), (int) (screensize.height * .5));
	}
}
