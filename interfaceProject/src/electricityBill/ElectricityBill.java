package electricityBill;

public class ElectricityBill implements Bill{

	private int bill_number;
	private static int idgen = 20021;
	private String name;
	private int units;
	
	public ElectricityBill()
	{
		bill_number = idgen++;
	}
	
	public ElectricityBill(String name, int units)
	{
		this();
		this.name = name;
		this.units = units;
	}

	public int getBill_number() {
		return bill_number;
	}

	public void setBill_number(int bill_number) {
		this.bill_number = bill_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public double calc_Bill() {
		 if(units<200)
		return 0;
		 else
			 return 6.5*units;
	}

	@Override
	public void display_Bill() {
	
		System.out.println("Total electricity bill for the month is : "+calc_Bill());
		
	}

	@Override
	public String toString() {
		return "ElectricityBill [bill_number=" + bill_number + ", name=" + name + ", units=" + units + ", calc_Bill()="
				+ calc_Bill() + "]";
	}
}
