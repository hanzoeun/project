package Customer;

public class GoldCustomer extends Customer{
	public GoldCustomer (String customerName) {
		super(customerName);
		
		
		super.CustomerGrade = "GOLD";
		super.bounsRatio = 0.8;
	}

	@Override
	public int calcPrice(int Price) {
		
		bounsPoint += Price * bounsRatio;
		
		//2. 사용자가 지불할 가격을 리턴 
		
		return Price;
		
	}
	
	
}
