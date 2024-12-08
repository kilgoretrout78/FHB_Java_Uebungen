package t1A16;

public class T1A16 {

	public static void main(String[] args) {
		System.out.println(join("-", "Das", "ist", "ein", "Satz"));
		System.out.println(join("-", "Das", "ist"));
		System.out.println("'" + join("-") + "'");

	}
	
	private static String join(String trennzeichen, String... worte) {
		String s = "";
		for (String einWort : worte) {
			if(s.length() > 0 ) {
				s += trennzeichen;
			}
			s += einWort;
		}
		return s;
	}

}
