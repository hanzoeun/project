package Customer;

public class VipCustomer extends Customer{
	public VipCustomer (String customerName) {
		super(customerName);
		
		
		super.CustomerGrade = "GOLD";
		super.bounsRatio = 0.15;
	}

	@Override
	public int calcPrice(int Price) {
		
		bounsPoint += Price * bounsRatio;
		
		//2. 사용자가 지불할 가격을 리턴 
		
		return Price;
		
	}
}
