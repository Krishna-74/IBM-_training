package assigment1;

public class Customer  {
	private String custNo;
	private String custName;
	private String category;
	public Customer() {
		
	}
	public Customer(String custNo, String custName, String category)throws InvalidInputException {
		if (custNo.startsWith("c") || custNo.startsWith("C"))
			this.custNo = custNo;
		else
			throw new InvalidInputException("custno should start with c");
		if (custName.length() == 4)
			this.custName = custName;
		else
			throw new InvalidInputException("Name must contain 4 letters");
		if (category.equalsIgnoreCase("Platinum") ||
				category.equalsIgnoreCase("Gold")
				|| category.equalsIgnoreCase("Silver"))
			this.category = category;
		else
			throw new InvalidInputException("not in list");
	}
	public String getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;

	}
	public String getCategory() {
		return category;
	}

	
	

}
