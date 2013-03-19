package GUI;

import static GUI.Constants.*;

import java.awt.*;
import javax.swing.*;

public class BrewChat {

	public BrewChat() {
		initializeComponents();
	}

	private void initializeComponents(){
		/* Set up new window */
		JFrame window = new JFrame(APP_TITLE);
		window.setLayout(new BorderLayout());
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(GUI_DIMENSIONS);
		window.setPreferredSize(GUI_DIMENSIONS);
		
		/* Start adding components to JFrame */
		JTabbedPane tabs = new JTabbedPane();
		JPanel ChatTabContents = new JPanel();
		JPanel LolStatsTabContents = new JPanel();
		
		tabs.addTab(CHAT_TAB_TITLE, null, ChatTabContents, CHAT_TAB_TOOLTIP);
		tabs.addTab(LEAGUE_TAB_TITLE, null, LolStatsTabContents, LEAGUE_TAB_TOOLTIP);
		window.add(tabs, BorderLayout.CENTER);
		
		window.validate();
		window.pack();
		window.setVisible(true);
	}

	public static void main(String[] args) {
		/* Makes new thread for application (for thread safety) */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() { new BrewChat(); }
		});
	}

}
