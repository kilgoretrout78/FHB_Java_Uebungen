package t1K1;

public class T1K1 {

	public static void main(String[] args) {
		// Objekt anlegen
		meinPC pc = new meinPC();
		System.out.println("Status: " + pc.isStatus());
		pc.einschalten();
		System.out.println("Status: " + pc.isStatus());
		boolean rc = pc.einschalten();
		if(rc == false) {
			System.out.println("Einschalten nicht notwendig");
		}
		pc.ausschalten();
		System.out.println("Status: " + pc.isStatus());
		if(pc.ausschalten() == false) {
			System.out.println("Ausschalten nicht notwendig");
		}
	}

}
