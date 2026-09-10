package homework;

public class Printer03 {
	private int numOfPapers;
	private boolean duplex;
	
	public Printer03(int numOfPapers ,boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print (int amount) {
		
		if(this.numOfPapers != 0) {
			if(duplex) {
				amount = (amount % 2 != 0)?amount/2+1:amount/2;
				if(this.numOfPapers * 2 >= amount) {
					
					for(int i = 1; i <= amount; i++) {

						this.numOfPapers--;
						
					}
					System.out.println("양면으로 "+(amount)+"장 출력했습니다. 현재 " +this.numOfPapers+"장 남아있습니다");
				}else {
					System.out.println("모두 출력하려면 용지가 "+(amount-this.numOfPapers)+"장 부족합니다 "+this.numOfPapers+"장만 출력합니다");
					amount = this.numOfPapers;
					for(int i = 1; i <= amount; i++) {
						this.numOfPapers--;
					}
				}
			}else {
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
			}
			
		}else{
			System.out.println("용지가 없습니다");
		}
		
	}
	
	public boolean getDuplex() {
		return this.duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}
