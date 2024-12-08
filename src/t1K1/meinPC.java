package t1K1;

public class meinPC {
	// Instanzvariablen
	private boolean status;
	
	// Methoden
	public boolean einschalten () {
		// ist der PC eingeschaltet
		if(status == true) {
		// ja -> sofort beenden
			return false;
		}
		// nein -> einschalten und beenden
		else {
			status = true;
			return true;
		}
	}
	
	public boolean ausschalten () {
		if(status == false) {
			return false;
		}
		else {
			status = false;
			return true;
		}
	}
	
	public boolean isStatus () {
		return status;
	}
}
