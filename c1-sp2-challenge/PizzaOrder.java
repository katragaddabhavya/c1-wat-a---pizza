//TASK 1
class PizzaOrder {
    // Every JAVA program has main method
    // Program execution begins with the main method
    public static void main(String[] args) {
        String customername ="Gary";
		String email= "gary@123.com";
		Long phoneNo= 41231255L;
		String address= "20, Marble Drive, Eville";
		int noofPizzasOrdered =  5 ;
		float pizzaprice = 12.5f;
		char pizzasize= 'M';
		int noofgarlicbreadordered= 3;
		float garlicbreadprice= 5.99f;
		int noofbeveragesOrdered= 3;
		float beveragesPrice= 1.99f;
		System.out.println("cutsomername " + customername);
		System.out.println("email" +email);
		System.out.println("phoneNo " +phoneNo);
		System.out.println("address" +address);
		System.out.println("pizzasize " +pizzasize);
	
//TASK 2
		float totalpizza= noofPizzasOrdered*pizzaprice;
		float totalgarlic = noofgarlicbreadordered*garlicbreadprice;
		float totalbeverage = noofbeveragesOrdered*beveragesPrice;
		System.out.println("total pizzaprice" +totalpizza);
		System.out.println("total garlicbreadprice" +totalgarlic);
		System.out.println("total beverages" +totalbeverage);


//TASK 3
	   
		float totalbill = totalpizza+totalgarlic+totalbeverage;
		System.out.println("total bill" +totalbill);
		boolean isgreater = totalbill> 100;
		System.out.println("totalbil is greater than 100" +isgreater);
//TASK 4
        
		float discountbill= totalbill-0.1f;
		System.out.println("discountbill" +discountbill);

		

	}
}
