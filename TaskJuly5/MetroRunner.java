class MetroRunner
{
	public static void main(String[] metro)
	{
		System.out.println("Running main...");
		Metro train = new Metro ("Purple", 5, "Majestic", "VijayNagar", 1500);
		System.out.println("Line :"+train.line);
		System.out.println("Distance :"+train.distance);
		System.out.println("Start :"+train.start);
		System.out.println("Destination :"+train.destination);
		System.out.println("Capacity :"+train.capacity);
	}
}	