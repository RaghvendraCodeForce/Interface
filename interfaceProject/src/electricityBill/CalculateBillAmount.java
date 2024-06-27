package electricityBill;

public class CalculateBillAmount {

	public static void main(String[] args) {
		
		WaterBill tanu = new WaterBill("Diskha",523049);
		WaterBill raghav = new WaterBill("Raghvendra",4500);
		System.out.println("Water Bill details :");
		System.out.println(tanu.toString());
		System.out.println(raghav.toString());
		
		ElectricityBill tanu_E = new ElectricityBill("Diksha",324);
		ElectricityBill ragha_E = new ElectricityBill("Raghvendra",200);
		System.out.println("********************************");
		System.out.println("Electricity Bill details :");
		System.out.println(tanu_E.toString());
		System.out.println(ragha_E.toString());
		
	}
}
