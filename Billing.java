package billing;
import java.util.*;

public class Billing {
	double totalBill=0;
	double mobileBill = 0;
	double watchBill = 0,bookBill =0;
	Scanner obj = new Scanner(System.in);
	void mobilePhone() {
		int oneplus =0, realme=0;
		System.out.println("the available mobiles are :");
		System.out.println("1.ONEPLUS\n2.REALME\n");
		for(int i =1; i<2; i++) {
			switch(i) {
			case 1:
				System.out.println("enter no.of ONEPLUS mobile you wish to buy :");
				oneplus = obj.nextInt();
				if(oneplus >0) {
					System.out.println("products added to cart");
				}
				else {
					System.out.println("no products added in this section");
				}
				//break;
			case 2:
				System.out.println("enter no.of REALME mobile you wish to buy :");
				realme = obj.nextInt();
				if(realme >0) {
					System.out.println("products added to cart");
				}
				else {
					System.out.println("no products added in this section");
				}
				break;
			}
		}
		mobileBill=(oneplus*299)+(realme*249);
		mobileBill=mobileBill+(mobileBill*0.15);
	}
	
	void watches() {
		System.out.println("the available watches are : ");
		System.out.println("1.FOSSIL \n 2.FASTRACK");
		int fossil=0,fastrack=0;
		for(int i =1; i<2; i++) {
			switch(i) {
			case 1:
				System.out.println("enter no.of FOSSIL watch you wish to buy :");
				fossil = obj.nextInt();
				if(fossil >0) {
					System.out.println("products added to cart");
				}
				else {
					System.out.println("no products added in this section");
				}
				//break;
			case 2:
				System.out.println("enter no.of FASTRACK watch you wish to buy :");
				fastrack = obj.nextInt();
				if(fastrack >0) {
					System.out.println("products added to cart");
				}
				else {
					System.out.println("no products added in this section");
				}
				break;
			}
		}
		watchBill = (fossil*599)+(fastrack*449);
		watchBill= watchBill+(watchBill*0.1);
	}
	void book() {
		System.out.println("the available books are : ");
		System.out.println("1.TAMIL \n2.ENGLISH \n3.SCIENCE ");
		int tamil = 0,english =0,science=0;
		for(int i =1; i<2; i++) {
			switch(i) {
			case 1:
				System.out.println("enter no.of TAMIL books you wish to buy :");
				tamil = obj.nextInt();
				if(tamil >0) {
					System.out.println("products added to cart");
				}
				else {
					System.out.println("no products added in this section");
				}
				//break;
			case 2:
				System.out.println("enter no.of ENGLISH books you wish to buy :");
				english = obj.nextInt();
				if(english >0) {
					System.out.println("products added to cart");
				}
				else {
					System.out.println("no products added in this section");
				}
				//break;
				
			case 3:
				System.out.println("enter no.of SCIENCE books you wish to buy :");
				science = obj.nextInt();
				if(science >0) {
					System.out.println("products added to cart");
				}
				else {
					System.out.println("no products added in this section");
				}
			}
		}
		bookBill = (tamil*299)+(english*199)+(science*249);
		
		
	}
	void bill() {
		totalBill = bookBill+watchBill+mobileBill;
		System.out.println("the total bill amount is : "+totalBill);
	}

}

