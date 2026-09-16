package homework;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone[] phones = {new Phone("황진이"),new Telephone("길동이", "내일"),new Smartphone("민국이", "갤러그")};
	    for (Phone p : phones) {

	    	if (p instanceof Smartphone) {
	    		Smartphone sp = (Smartphone) p;
	    		sp.playGame();
	    	} else if (p instanceof Telephone) {
	    		Telephone tp = (Telephone) p;
	    		tp.autoAnswering();
	    	} else if (p instanceof Phone) {
	            p.talk();
	        }
	    }
	}

}
