package StringManipulation;
import java.util.Scanner;
public class CheckCreditCardType {
        public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Card Number");
		String inputCardNumber=sc.next();
		String cardName=checkCreditCardType(inputCardNumber);
        System.out.println("Your card type is: "+cardName);
		sc.close();
        }
	public static String checkCreditCardType(String cardNumber) {
		int visaCard=Character.getNumericValue(cardNumber.charAt(0));
		int otherCard=Integer.valueOf(cardNumber.substring(0, 2));
		if(cardNumber.length() != 10) 
			return "Invalid_Card";
		else {
			if (visaCard==4)
				return"Visa_Card";
			else if(otherCard==35 || otherCard==37)
				return "American_Express";
			else if(otherCard>=51 && otherCard<=55)
				return "Master_card";
			else
				return "Card type not present";
			}
		
		}
}
