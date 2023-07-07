class StoveRunner
{
public static void main(String[] args)
    {
        Stove stove1 = new Stove("Samsung", "Gas", 4, true, false, false, "Stainless Steel", 0000.00);
        Stove stove2 = new Stove("LG", "Electric", 5, true, true, true, "Black", 12000.00);
        Stove stove3 = new Stove("Whirlpool", "Gas", 6, true, true, false, "White", 8000.00);
        Stove stove4 = new Stove("GE", "Electric", 4, false, false, true, "Silver", 7000.00);
        Stove stove5 = new Stove("Frigidaire", "Gas", 5, true, false, false, "Stainless Steel", 11000.00);
        Stove stove6 = new Stove("Bosch", "Electric", 6, true, true, true, "Black Stainless Steel", 14000.00);
        Stove stove7 = new Stove("KitchenAid", "Gas", 4, true, true, false, "Red", 10000.00);
        Stove stove8 = new Stove("Maytag", "Electric", 5, false, true, true, "White", 9000.00);
		System.out.println("Brand: " +stove1.brand);
        System.out.println("Fuel Type: " + stove1.fuelType);
        System.out.println("Number of Burners: " +stove1.numberOfBurners);
        System.out.println("Has Oven: " + stove1.hasOven);
        System.out.println("Has Grill: " +stove1.hasGrill);
        System.out.println("Is Electric: " +stove1.isElectric);
        System.out.println("Color: " +stove1.color);
        System.out.println("Price:" + stove1.price +" RS");
	}
}
