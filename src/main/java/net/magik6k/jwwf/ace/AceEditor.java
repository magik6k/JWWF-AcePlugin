package net.magik6k.jwwf.ace;

import net.magik6k.jwwf.core.action.Actions;
import net.magik6k.jwwf.event.input.TextInputEvent;
import net.magik6k.jwwf.handlers.TextHandler;
import net.magik6k.jwwf.util.Json;
import net.magik6k.jwwf.widgets.basic.input.generic.BasicInput;

public class AceEditor extends BasicInput {
	private String text;
	private int height = 600;
	private TextHandler handler;
	private AceMode mode = AceMode.TEXT;
	private AceTheme theme = AceTheme.MONOKAI;
	private boolean sendTextUpdate = true;
	
	/**
	 * Creates new Ace Editor with default Text mode and Monokai theme
	 */
	public AceEditor() {
		super(Actions.TEXT_INPUT);
	}
	
	/**
	 * Creates new Ace Editor with default Text mode and Monokai theme
	 * @param text Default text
	 */
	public AceEditor(String text) {
		super(Actions.TEXT_INPUT);
		this.text = text;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode and Monokai theme
	 * @param text Default text
	 * @param handler Input handler
	 */
	public AceEditor(String text, TextHandler handler) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.handler = handler;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode and Monokai theme
	 * @param handler Input handler
	 */
	public AceEditor(TextHandler handler) {
		super(Actions.TEXT_INPUT);
		this.handler = handler;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode and Monokai theme
	 * @param text Default text
	 * @param height Height in pixels
	 */
	public AceEditor(String text, int height) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.height = height;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode and Monokai theme
	 * @param text Default text
	 * @param handler Input handler
	 * @param height Height in pixels
	 */
	public AceEditor(String text, TextHandler handler, int height) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.handler = handler;
		this.height = height;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode and Monokai theme
	 * @param handler Input handler
	 * @param height Height in pixels
	 */
	public AceEditor(TextHandler handler, int height) {
		super(Actions.TEXT_INPUT);
		this.handler = handler;
		this.height = height;
	}
	
	/**
	 * Creates new Ace Editor with Monokai theme
	 * @param mode Ace editor mode
	 */
	public AceEditor(AceMode mode) {
		super(Actions.TEXT_INPUT);
		this.mode = mode;
	}
	
	/**
	 * Creates new Ace Editor with Monokai theme
	 * @param text Default text
	 * @param mode Ace editor mode
	 */
	public AceEditor(String text, AceMode mode) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.mode = mode;
	}
	
	/**
	 * Creates new Ace Editor with Monokai theme
	 * @param text Default text
	 * @param handler Input handler
	 * @param mode Ace editor mode
	 */
	public AceEditor(String text, TextHandler handler, AceMode mode) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.handler = handler;
		this.mode = mode;
	}
	
	/**
	 * Creates new Ace Editor with Monokai theme
	 * @param handler Input handler
	 * @param mode Ace editor mode
	 */
	public AceEditor(TextHandler handler, AceMode mode) {
		super(Actions.TEXT_INPUT);
		this.handler = handler;
		this.mode = mode;
	}
	
	/**
	 * Creates new Ace Editor with Monokai theme
	 * @param text Default text
	 * @param height Height in pixels
	 * @param mode Ace editor mode
	 */
	public AceEditor(String text, int height, AceMode mode) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.height = height;
		this.mode = mode;
	}
	
	/**
	 * Creates new Ace Editor with Monokai theme
	 * @param text Default text
	 * @param handler Input handler
	 * @param height Height in pixels
	 * @param mode Ace editor mode
	 */
	public AceEditor(String text, TextHandler handler, int height, AceMode mode) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.handler = handler;
		this.height = height;
		this.mode = mode;
	}
	
	/**
	 * Creates new Ace Editor with Monokai theme
	 * @param handler Input handler
	 * @param height Height in pixels
	 * @param mode Ace editor mode
	 */
	public AceEditor(TextHandler handler, int height, AceMode mode) {
		super(Actions.TEXT_INPUT);
		this.handler = handler;
		this.height = height;
		this.mode = mode;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode
	 * @param theme Ace editor theme
	 */
	public AceEditor(AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode
	 * @param text Default text
	 * @param theme Ace editor theme
	 */
	public AceEditor(String text, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode
	 * @param text Default text
	 * @param handler Input handler
	 * @param theme Ace editor theme
	 */
	public AceEditor(String text, TextHandler handler, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.handler = handler;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode
	 * @param handler Input handler
	 * @param theme Ace editor theme
	 */
	public AceEditor(TextHandler handler, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.handler = handler;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode
	 * @param text Default text
	 * @param height Height in pixels
	 * @param theme Ace editor theme
	 */
	public AceEditor(String text, int height, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.height = height;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode
	 * @param text Default text
	 * @param handler Input handler
	 * @param height Height in pixels
	 * @param theme Ace editor theme
	 */
	public AceEditor(String text, TextHandler handler, int height, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.handler = handler;
		this.height = height;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor with default Text mode
	 * @param handler Input handler
	 * @param height Height in pixels
	 * @param theme Ace editor theme
	 */
	public AceEditor(TextHandler handler, int height, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.handler = handler;
		this.height = height;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor
	 * @param mode Ace editor mode
	 * @param theme Ace editor theme
	 */
	public AceEditor(AceMode mode, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.mode = mode;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor
	 * @param text Default text
	 * @param mode Ace editor mode
	 * @param theme Ace editor theme
	 */
	public AceEditor(String text, AceMode mode, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.mode = mode;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor
	 * @param text Default text
	 * @param handler Input handler
	 * @param mode Ace editor mode
	 * @param theme Ace editor theme
	 */
	public AceEditor(String text, TextHandler handler, AceMode mode, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.handler = handler;
		this.mode = mode;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor
	 * @param handler Input handler
	 * @param mode Ace editor mode
	 * @param theme Ace editor theme
	 */
	public AceEditor(TextHandler handler, AceMode mode, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.handler = handler;
		this.mode = mode;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor
	 * @param text Default text
	 * @param height Height in pixels
	 * @param mode Ace editor mode
	 * @param theme Ace editor theme
	 */
	public AceEditor(String text, int height, AceMode mode, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.height = height;
		this.mode = mode;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor
	 * @param text Default text
	 * @param handler Input handler
	 * @param height Height in pixels
	 * @param mode Ace editor mode
	 * @param theme Ace editor theme
	 */
	public AceEditor(String text, TextHandler handler, int height, AceMode mode, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.text = text;
		this.handler = handler;
		this.height = height;
		this.mode = mode;
		this.theme = theme;
	}
	
	/**
	 * Creates new Ace Editor
	 * @param handler Input handler
	 * @param height Height in pixels
	 * @param mode Ace editor mode
	 * @param theme Ace editor theme
	 */
	public AceEditor(TextHandler handler, int height, AceMode mode, AceTheme theme) {
		super(Actions.TEXT_INPUT);
		this.handler = handler;
		this.height = height;
		this.mode = mode;
		this.theme = theme;
	}
	
	/**
	 * Sets size of the editor
	 * @param height New height in pixels
	 * @return This AceEditor
	 */
	public AceEditor setSize(int height){
		this.height = height;
		this.sendElement();
		return this;
	}
	
	/**
	 * Sets new text
	 * @param text Text to set
	 * @return This AceEditor
	 */
	public AceEditor setText(String text){
		this.text = text;
		sendTextUpdate = true;
		this.sendElement();
		return this;
	}
	
	/**
	 * Sets new TextHandler
	 * @param handler New text handler
	 * @return This AceEditor
	 */
	public AceEditor setTextHandler(TextHandler handler){
		this.handler = handler;
		return this;
	}
	
	/**
	 * Returns entered text
	 * @return Entered text
	 */
	public String getText(){
		return text;
	}
	
	@Override
	public String getName() {
		return "AceEditor";
	}

	@Override
	public String getData() {
		return "{\"height\":"+String.valueOf(height)
				+",\"theme\":\""+theme.theme
				+"\", \"mode\": \""+mode.mode
				+"\""+(sendTextUpdate ? (",\"text\":"+Json.escapeString(text)): "" )+"}";
	}
	
	/**
	 * Internal use only
	 * @param data Data
	 */
	public void handleData(String data){
		if(data == null)return;
		text = data;
		sendEvent(new TextInputEvent(this.user, getPayload(), data));
		if(handler != null)
			handler.onType(data);
	}
	
}
