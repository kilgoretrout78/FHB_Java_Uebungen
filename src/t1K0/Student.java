package t1K0;

public class Student {
	//	Instanzvariablen
	private String name;
	private String matrikelnummer;
	private String emailId;
	
	// Getter für die Instanzvariable name
	public String getName() {
		// Inhalt der Instanzvariable zurückliefern
		return name;
	}
	
	// Setter für die Instanzvariable name
	public void setName(String n) {
		// Inhalt der Instanzvariable setzen
		name = n;
	}
	
	// Getter und Setter für matrikelnummer
	public String getMatrikelnummer( ) {
		return matrikelnummer;
	}
	public void setMatrikelnummer (String m) {
		matrikelnummer = m;
	}
	
	// Getter und Setter für emailId
	public String getEmailId( ) {
		return emailId;
	}
	public void setEmailId (String e) {
		emailId = e;
	}
	
}
