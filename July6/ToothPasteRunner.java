class ToothPasteRunner
{
public static void main(String[] args)
 {
        
        ToothPaste ToothPaste1 = new ToothPaste("Colgate", "Mint", 150, "Blue", true, true, false, 45.00);
        ToothPaste ToothPaste2 = new ToothPaste("Crest", "Cinnamon", 100, "Red", true, false, false, 30.00);
        ToothPaste ToothPaste3 = new ToothPaste("Sensodyne", "Fresh Mint", 75, "Green", true, false, true, 15.49);
        ToothPaste ToothPaste4 = new ToothPaste("Aquafresh", "Bubble Mint", 125, "Pink", true, true, false, 50.49);
        ToothPaste ToothPaste5 = new ToothPaste("Arm & Hammer", "Baking Soda", 200, "White", false, true, false, 100.00);
        ToothPaste ToothPaste6 = new ToothPaste("Close-Up", "Lemon Mint", 90, "Yellow", true, false, false, 50.49);
        ToothPaste ToothPaste7 = new ToothPaste("Oral-B", "Pro-Health", 175, "Purple", true, true, false, 75.29);
        ToothPaste ToothPaste8 = new ToothPaste("Pepsodent", "Peppermint", 80, "Orange", true, false, true, 55.79);
		System.out.println("Brand: " + ToothPaste1.brand);
        System.out.println("Flavor: " + ToothPaste1.flavor);
        System.out.println("Volume: " + ToothPaste1.volume + " ml");
        System.out.println("Color: " + ToothPaste1.color);
        System.out.println("Has Fluoride: " +ToothPaste1.hasFluoride);
        System.out.println("Is Whitening: " + ToothPaste1.isWhitening);
        System.out.println("Is Sensitive: " + ToothPaste1.isSensitive);
        System.out.println("Price:" +ToothPaste1.price + " RS");
	}
}
