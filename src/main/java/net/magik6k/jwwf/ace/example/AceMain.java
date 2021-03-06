package net.magik6k.jwwf.ace.example;

import net.magik6k.jwwf.ace.AcePlugin;
import net.magik6k.jwwf.core.JwwfServer;

public class AceMain {
	public static void main(String[] args){
		int port;
		try {
			port = new Integer( args[ 0 ] );
		} catch ( Exception e ) {
			System.out.println( "No port specified. Defaulting to 8888" );
			port = 8888;
		}
		
		JwwfServer server = new JwwfServer(port);
		
		try {
			String addr = args[1];
			if(addr != null){
				server.setApiUrl(addr);
			}
		} catch( Exception e ) {
			System.out.println( "No custom API address given, using automatic mode." );
		}
		JwwfServer.debugOutput(true);
		server.attachPlugin(new AcePlugin());
		server.bindWebapp(AceClient.class, "").start();
		server.start();
	}
}
