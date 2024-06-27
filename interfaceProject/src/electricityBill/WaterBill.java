package electricityBill;

public class WaterBill implements Bill{

	private int house_Number;
	private static int idgen = 1001;
	private int units; // in liters 
	
	private String name;
	
	public WaterBill()
	{
		house_Number = idgen++;
	}
	
	public WaterBill(String name,int units)
	{
		this();
		this.name = name;
		this.units = units;
	}
	
	public void setHouse_Number(int house_Number)
	{
		this.house_Number = house_Number;
	}
	
	public int getHouse_Number()
	{
		return house_Number;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setUnits(int units)
	{
		this.units = units;
	}
	
	public int getUnits()
	{
		return units;
	}

	@Override
	public double calc_Bill() {
		// water rate in bangalore
	
		if(units<8000)
			return 7;
		else if(units<25000 && units>8001)
			return 11;
		else if(units<50000 && units>25001)
			return 26;
		else
			return 45;
		
	}

	@Override
	public void display_Bill() {
		
		System.out.println("Total water bill for this month is : "+calc_Bill());
		
	}

	@Override
	public String toString() {
		return "WaterBill [house_Number=" + house_Number + ", units=" + units + ", name=" + name + ", calc_Bill()="
				+ calc_Bill() + "]";
	}
	
}
