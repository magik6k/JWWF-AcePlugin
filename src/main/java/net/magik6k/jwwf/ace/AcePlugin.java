package net.magik6k.jwwf.ace;

import java.io.IOException;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import net.magik6k.jwwf.core.JwwfPlugin;
import net.magik6k.jwwf.core.JwwfServer;
import net.magik6k.jwwf.core.plugin.IPluginGlobal;

public class AcePlugin extends JwwfPlugin implements IPluginGlobal{

	@Override
	public void onAttach(JwwfServer server) {
		server.bindServlet(new AceServlet(), "/ace/*");
		server.getCreator().appendHead("<script src=\"/ace/ace.js\" type=\"text/javascript\" charset=\"utf-8\"></script>");
		server.getCreator().appendHead("<style>.aceeditor {position: absolute;top: 0;right: 0;bottom: 0;left: 0;}"
				+ ".aceCointainer{position: relative;}</style>");
		
		try {
			String createFunction = Resources.toString(Resources.getResource(
					new StringBuilder("net/magik6k/jwwf/ace/assets/aceWidgetCreate.js").toString()), Charsets.UTF_8);
			String updateFunction = Resources.toString(Resources.getResource(
					new StringBuilder("net/magik6k/jwwf/ace/assets/aceWidgetUpdate.js").toString()), Charsets.UTF_8);
			
			server.getCreator().registerWidget("AceEditor", createFunction, updateFunction);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
