
public class Week3CodingAssignment {

	public static void main(String[] args) {
		
//		Question 1
		System.out.println("** Question 1 **\n");
		int[] ages = {3,9,23,64,2,8,28,93,72};
		
		System.out.println("Last Age - First Age: " + (ages[ages.length - 1] - ages[0]));
		
		double total = 0;
		
		for(int i = 0; i < ages.length; i++) {
			total += ages[i];
		}
		
		double average = total/ages.length;
		
		System.out.printf("Average Age: %.2f%n", average);
		
//		Question 2
		System.out.println("\n** Question 2 **\n");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double totalNameLength = 0;
		
		for(String name: names) {
			totalNameLength += name.length();
		}
		
		double averageNameLength = totalNameLength / names.length;
		
		System.out.printf("Average Name Length: %.2f%n", averageNameLength);
		
		String allNames = "";
		
		for (String name: names) {
			allNames += name + " ";
		}
		
		System.out.println(allNames);
		
//		Question 5
		System.out.println("\n** Question 5 & 6 **\n");
		int[] nameLengths = new int[names.length];
		
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
//		Question 6
		int totalNameLengths = 0;
		
		for(int num: nameLengths) {
			totalNameLengths += num;
		}
		
		System.out.println("Total Names Length: " + totalNameLengths);
		
//		Question 7
		System.out.println("\n** Question 7 **\n");
		String wordMultiplied = wordMultiplier("Hello", 3);
		System.out.println(wordMultiplied);
		
//		Question 8
		System.out.println("\n** Question 8 **\n");
		String fullName = fullName("John", "Doe");
		System.out.println(fullName);
		
//		Question 9
		System.out.println("\n** Question 9 **\n");
		int[] intArr1 = {10, 20, 30, 41};
		int[] intArr2 = {10, 20, 30, 40};
		System.out.println(greaterThan100(intArr1));
		System.out.println(greaterThan100(intArr2));
		
//		Question 10
		System.out.println("\n** Question 10 **\n");
		double[] nums = {1.2, 5.1, 6.7, 8.324, 4.996};
		double averageOfDoubles = averageOfDoubleArray(nums);
		System.out.println(averageOfDoubles);
		
//		Question 11 (I used nums array above for example)
		System.out.println("\n** Question 11 **\n");
		double[] nums2 = {1.1, 4.9, 6.6, 8.234, 4.874};
		System.out.println(firstArrayAverageGreaterThanSecond(nums, nums2));
		System.out.println(firstArrayAverageGreaterThanSecond(nums2, nums));
		
//		Question 12
		System.out.println("\n** Question 12 **\n");
		boolean hot = true;
		double money = 13.45;
		boolean drinkBought = willBuyDrink(hot, money);
		System.out.println(drinkBought);
		
//		Question 13
		System.out.println("\n** Question 13 **\n");
		double kilometers = 144;
		double miles = kilometersToMiles(kilometers);
		System.out.println(kilometers + " km = " + miles + " mi");
		
	}
	
//	*** METHODS ****
	
//	For Q7
	public static String wordMultiplier(String word, int n) {
		String result = "";
		for(int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
//	For Q8
	public static String fullName(String fname, String lname) {
		return fname + " " + lname;
	}
//	For Q9
	public static boolean greaterThan100(int[] nums) {
		int sum = 0;
		for (int num: nums) {
			sum += num;
		}
		return sum > 100;
	}
//	For Q10
	public static double averageOfDoubleArray(double[] arr) {
		double total = 0;
		for(double n: arr) {
			total += n;
		}
		return total / arr.length; 
	}
//	For Q11
	public static boolean firstArrayAverageGreaterThanSecond(double[] arr1, double[] arr2) {
		double average1 = averageOfDoubleArray(arr1);
		double average2 = averageOfDoubleArray(arr2);
		return average1 > average2;
	}
//	For Q12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
///	For Q13. This method takes a double, kilometers, and returns a double that is the kilometers value converted to miles.  I created this method because I like to travel but most countries use kilometers and I am always curious what it would be in miles.
//	Please note that my method is an estimate conversion.  
	public static double kilometersToMiles(double kilometers) {
		double halfKm = kilometers / 2;
		return halfKm + (halfKm/4);
	}
	
}
