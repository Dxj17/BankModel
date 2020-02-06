package rigthWay;

import bank.Bank;

public class RightWay {

	public static void main(String[] args) {
		Bank bank = new Bank("Milford", "Loveland", "Online");
		System.out.println(bank.toString());

	}

}
