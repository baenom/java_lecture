package homework;

public class Printer01 {
	
	int numOfPapers = 0;
	
	public void print (int amount) {
		if(this.numOfPapers >= amount) {
			for(int i = 0; i < amount; i++) {
				this.numOfPapers--;
			}
		}
		
	}

}
