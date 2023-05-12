package Todaysale;

public class KoreaMeat implements Meat{

	
	private int Price;



	@Override
	public int money(String grade) {
		int money = 0;

		if (grade.equals("A+")) {
			money = (int) (Price * 0.25);
		} else if (grade.equals("A")) {
			money = (int) (Price * 0.2);
		} else if (grade.equals("B")) {
			money = (int) (Price * 0.1);
		}

		return money;

	}
	

}
