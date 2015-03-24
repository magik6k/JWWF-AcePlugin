package net.magik6k.jwwf.ace.example;

import net.magik6k.jwwf.ace.AceEditor;
import net.magik6k.jwwf.ace.AceMode;
import net.magik6k.jwwf.ace.AceTheme;
import net.magik6k.jwwf.core.MainFrame;
import net.magik6k.jwwf.core.User;
import net.magik6k.jwwf.handlers.TextHandler;
import net.magik6k.jwwf.widgets.basic.PreformatedTextLabel;
import net.magik6k.jwwf.widgets.basic.TextLabel;
import net.magik6k.jwwf.widgets.basic.panel.Panel;
import net.magik6k.jwwf.widgets.basic.panel.Row;

public class AceClient extends User	{

	@Override
	protected void initializeUser(MainFrame rootFrame) {
		TextLabel label = new TextLabel("<h1>Example Ace editor - jwwf-ace</h1>");
		AceEditor editor = new AceEditor("//Hello there,\n//what you see here is ace.c9.io java editor inside JWWF!",
				AceMode.JAVA, AceTheme.ECLIPSE);
		final PreformatedTextLabel code = new PreformatedTextLabel(editor.getText());
		
		editor.setTextHandler(new TextHandler() {
			
			@Override
			public void onType(String text) {
				code.setText(text);
			}
		});
		
		rootFrame.put(new Row(2, new Panel(label).setWidth(12),
				new Panel(new Row(2, editor, code)).setWidth(12)));
	}

}
