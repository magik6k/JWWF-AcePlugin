package net.magik6k.jwwf.ace.example;

import net.magik6k.jwwf.ace.AceEditor;
import net.magik6k.jwwf.ace.AceMode;
import net.magik6k.jwwf.ace.AceTheme;
import net.magik6k.jwwf.core.MainFrame;
import net.magik6k.jwwf.core.User;
import net.magik6k.jwwf.handlers.TextHandler;
import net.magik6k.jwwf.widgets.basic.TextLabel;
import net.magik6k.jwwf.widgets.basic.panel.VerticalPanel;

public class AceClient extends User	{

	@Override
	protected void initializeUser(MainFrame rootFrame) {
		TextLabel label = new TextLabel("works");
		AceEditor editor = new AceEditor("//Hello there, wat you see here is ace.c9.io java editor inside JWWF!",
				AceMode.JAVA, AceTheme.ECLIPSE);
		final TextLabel code = new TextLabel(editor.getText());
		
		editor.setTextHandler(new TextHandler() {
			
			@Override
			public void onType(String text) {
				code.setText(text);
			}
		});
		
		rootFrame.put(new VerticalPanel(3, label, editor, code));
	}

}
