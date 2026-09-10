package homework;

public class Printer02 {
	private int numOfPapers;
	
	public Printer02(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}
	
	public void print (int amount) {
		if(this.numOfPapers != 0) {
			if(this.numOfPapers >= amount) {
				for(int i = 0; i < amount; i++) {
					this.numOfPapers--;
				}
				System.out.println(amount+"장 출력했습니다. 현재 " +this.numOfPapers+"장 남아있습니다");
			}else {
				System.out.println("모두 출력하려면 용지가 "+(amount-this.numOfPapers)+"장 부족합니다 "+this.numOfPapers+"장만 출력합니다");
				amount = this.numOfPapers;
				for(int i = 0; i < amount; i++) {
					this.numOfPapers--;
				}
			}
		}else{
			System.out.println("용지가 없습니다");
		}
		
	}
}
