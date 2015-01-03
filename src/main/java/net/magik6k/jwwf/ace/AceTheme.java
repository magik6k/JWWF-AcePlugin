package net.magik6k.jwwf.ace;

public enum AceTheme {
	AMBIANCE("ace/theme/ambiance"),
	CHAOS("ace/theme/chaos"),
	CHROME("ace/theme/chrome"),
	CLOUDS("ace/theme/clouds"),
	CLOUDS_MIDNIGHT("ace/theme/clouds_midnight"),
	COBALT("ace/theme/cobalt"),
	CRIMSON_EDITOR("ace/theme/crimson_editor"),
	DAWN("ace/theme/dawn"),
	DREAMWEAVER("ace/theme/dreamweaver"),
	ECLIPSE("ace/theme/eclipse"),
	GITHUB("ace/theme/github"),
	IDLE_FINGERS("ace/theme/idle_fingers"),
	KATZENMILCH("ace/theme/katzenmilch"),
	KR_THEME("ace/theme/kr_theme"),
	KUROIR("ace/theme/kuroir"),
	MERBIVORE("ace/theme/merbivore"),
	MERBIVORE_SOFT("ace/theme/merbivore_soft"),
	MONO_INDUSTRIAL("ace/theme/mono_industrial"),
	MONOKAI("ace/theme/monokai"),
	PASTEL_ON_DARK("ace/theme/pastel_on_dark"),
	SOLARIZED_DARK("ace/theme/solarized_dark"),
	SOLARIZED_LIGHT("ace/theme/solarized_light"),
	TERMINAL("ace/theme/terminal"),
	TEXTMATE("ace/theme/textmate"),
	TOMORROW("ace/theme/tomorrow"),
	TOMORROW_NIGHT("ace/theme/tomorrow_night"),
	TOMORROW_NIGHT_BLUE("ace/theme/tomorrow_night_blue"),
	TOMORROW_NIGHT_BRIGHT("ace/theme/tomorrow_night_bright"),
	TOMORROW_NIGHT_EIGHTIES("ace/theme/tomorrow_night_eighties"),
	TWILIGHT("ace/theme/twilight"),
	VIBRANT_INK("ace/theme/vibrant_ink"),
	XCODE("ace/theme/xcode");
	
	public final String theme;
	
	AceTheme(String theme){
		this.theme = theme;
	}
}
