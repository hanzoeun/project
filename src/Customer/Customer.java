package Customer;

public class Customer {

	protected String CustomerName; // 고객 이름
	protected String CustomerGrade; // 고객 등급
	
	
	int bounsPoint; // 보너스 포인트 적립양
	double bounsRatio; //보너스 비율 
	
	//생성자 
	public Customer() {
		initCustomer();
	}
	
	public Customer(String CustomerName) {
		
		this.CustomerName = CustomerName;
		initCustomer();
	}
	
	//메소드 
	//고객등급 초기화 
	private void  initCustomer() {
		CustomerGrade = "Nomarl";
		bounsRatio = 0.05;
	}
	
	//보너스 포인트 계산, 가격 리턴 
	public int calcPrice(int Price) {
		//1. 보너스 포인트 적립 
		bounsPoint += (Price * bounsRatio);
		
		
		//2. 사용자가 지불할 가격을 리턴 
		return Price; 
		
	}
	
	//고객 정보 출력 메소드 
	public String showCustomerInfo() {
		return CustomerName + "님의 등급: " + CustomerGrade + ", 보너스 포인트: " + bounsPoint + "점";
	}




	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return CustomerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	/**
	 * @return the customerGrade
	 */
	public String getCustomerGrade() {
		return CustomerGrade;
	}

	/**
	 * @param customerGrade the customerGrade to set
	 */
	public void setCustomerGrade(String customerGrade) {
		CustomerGrade = customerGrade;
	}
	
	
}
