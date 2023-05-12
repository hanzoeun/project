package Todaysale;

public class USAMeat implements Meat {
	private int Price;



	@Override
	public int money(String grade) {
		int money = 0 ;
		
		if(grade.equals("Primes")) {
			 money = (int) (Price * 0.2);
		} else if (grade.equals("Choice")) {
			 money = (int) (Price * 0.15);
		} else if (grade.equals("Stendard")) {
			 money = (int) (Price * 0.1);
		} 
		
		return money  ;
	}


}
