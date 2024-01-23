
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1); // Customer's toString() 
		c1.setDiscount(5); // set customer's discount is 5 
		System.out.println(c1); // Customer's toString()
		 
		Line();
		System.out.println("id is: " + c1.getID()); // Show customer's id
		System.out.println("name is: " + c1.getName()); // Show customer's name
		System.out.println("discount is: " + c1.getDiscount()); // Show customer's discount// show customer's id
		 
		Line();
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		System.out.println(inv1); // Invoice's toString()
		inv1.setAmount(10000.0); // Set invoice's amount to 10000
		System.out.println(inv1); // Invoice's toString()
		 
		Line();
		System.out.println("id is: " + inv1.getID()); // Show invoice's id
		System.out.println("customer is: " + inv1.getCustomer()); // Customer's toString() by instance inv1
		System.out.println("amount is: " + inv1.getAmount()); // Show invoice's amount
		 
		Line();
		System.out.println("customer's id is: " + inv1.getCustomer().getID()); // Show customer's id by instance inv1
		System.out.println("customer's name is: " + inv1.getCustomer().getName()); // Show customer's name by instance inv1
		System.out.println("customer's discount is: " + inv1.getCustomer().getDiscount()); // Show customer's discount by instance inv1
		System.out.println("amount after discount is: " + String.format("%.2f", inv1.getAmountAfterDiscount())); // Show invoice's amount after discount (format as output)
	} //end of main method()
	public static void Line() {
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}