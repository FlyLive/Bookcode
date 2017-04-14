package Chapter6;

public class ³ÌĞòÇåµ¥6_10RandomCharacter {
	public static char getRandomCharacter(char c1,char c2){
		return (char)(c1 + Math.random() * (c2 - c1 + 1));
	}
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a','z');
	}
	public static char getRandomUpperCaseLetter(){
		return getRandomCharacter('A','Z');
	}
	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0','9');
	}
	public static char getRandomCharacter(){
		return getRandomCharacter('\u0000','\uFFFF');
	}
}
