package net.magik6k.jwwf.ace.example;

import net.magik6k.jwwf.ace.AceEditor;
import net.magik6k.jwwf.core.MainFrame;
import net.magik6k.jwwf.core.User;
import net.magik6k.jwwf.widgets.basic.TextLabel;
import net.magik6k.jwwf.widgets.basic.panel.VerticalPanel;

public class AceClient extends User	{

	@Override
	protected void initializeUser(MainFrame rootFrame) {
		rootFrame.put(new VerticalPanel(2).put(new TextLabel("works"), 0).put(new AceEditor(), 1));
	}

}
