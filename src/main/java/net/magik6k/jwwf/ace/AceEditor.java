package net.magik6k.jwwf.ace;

import net.magik6k.jwwf.core.Widget;
import net.magik6k.jwwf.core.action.Actions;
import net.magik6k.jwwf.util.Json;

public class AceEditor extends Widget{
	private String text;
	private int width = 800;
	private int height = 600;
	
	public AceEditor() {
		super(Actions.TEXT_INPUT);
	}
	
	@Override
	public String getName() {
		return "AceEditor";
	}

	@Override
	public String getData() {
		return "{\"width\":"+String.valueOf(width)+",\"height\":"+String.valueOf(height)+",\"text\":"+Json.escapeString(text)+"}";
	}
	
	
	
}
