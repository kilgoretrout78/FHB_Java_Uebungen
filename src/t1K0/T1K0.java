package t1K0;

public class T1K0 {

	public static void main(String[] args) {
		// Student Objekt anlegen
		Student mm = new Student();
		// Namen in das Objekt eintragen
		mm.setName("Max Mustermann");
		mm.setMatrikelnummer("BITI 123456");
		mm.setEmailId("max.mustermann@hochschule-burgenland.at");
		System.out.println("Name: " + mm.getName());
		System.out.println("Matrikelnummer: " + mm.getMatrikelnummer());
		System.out.println("EmailId: " + mm.getEmailId());
		
		// 2. Studentenobjekt anlegen
		Student gm = new Student();
		gm.setName("Maria Musterfrau");
		System.out.println("Name 2. Student: " + gm.getName());
		System.out.println("EmailId 2. Student: " + gm.getEmailId());
	}

}
