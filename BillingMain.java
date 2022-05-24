package billing;

public class BillingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Sana Shopping" );
		System.out.println("lets get the things ");
		Billing p1 =new Billing();
		for(int i =1; i<=4; i++) {
			switch(i) {
			case 1:
				p1.mobilePhone();
				break;
			
			case 2:
				p1.watches();
				break;
				
			case 3:
				p1.book();
				break;
				
			case 4:
				p1.bill();
			}
		}

	}

}
