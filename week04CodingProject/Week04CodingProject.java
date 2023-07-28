package week04CodingProject;

public class Week04CodingProject {

	public static void main(String[] args) {
//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		System.out.println("----Number1---");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//	a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int lastMinusFirst = ages[ages.length -1]-ages[0];
		System.out.println(lastMinusFirst);
		System.out.println(subtractFirstFromLast(ages));
		// I created a method to perform the task, as well as just following the prompt, because I see the next prompt wants me to repeat the task.
		
//	b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//
		int[] moreAges = {31, 29, 4, 42, 90, 84, 83, 38, 1};
		System.out.println(subtractFirstFromLast(moreAges));
//	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i]; // The Sum equals the sum, plus the value at the specified index.
		} 
		int agesAverage = sum / ages.length;
		System.out.println(agesAverage);
		
//	2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		System.out.println("---Number2---");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double numberOfLetters = 0;
		for (String name : names) {
			numberOfLetters += name.length();
		}
		double avgNumberOfLetters = numberOfLetters / names.length;
		System.out.println(avgNumberOfLetters);
//
//	b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String concatNames = new String();
		for (String name : names) {
			concatNames += name + " "; //For each name in names, add the name plus a space to the new String.
		}
		System.out.println(concatNames);
		
//	3. How do you access the last element of any array?
		System.out.println("---Number3---");
		// The Last element in an array is accessed by calling on the index of the length of the array minus one. 
		//For example:
		System.out.print("The last element in names[] is: ");
		System.out.println(names[names.length-1]);
		
//	4. How do you access the first element of any array?
		System.out.println("---Number4---");
		//The last element in an array can be accessed by calling on the index of 0. 
		//For example:
		System.out.print("The first element in names[] is: ");
		System.out.println(names[0]);
		
//	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.		
		System.out.println("---Number5---");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {	//At each index, starting with 0, takes the length of that string and adds that value to the nameLengths[] at the same index.
			nameLengths[i] = names[i].length();
		}
		for (int number : nameLengths) {	//Printed each number in nameLengths to the console.
		System.out.println(number);
		}
		
//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println("----Number6-----");
		
		int nameLengthsSum= 0;
		for (int i = 0; i < nameLengths.length -1; i++) {
		nameLengthsSum += nameLengths[i];
		}
		System.out.println(nameLengthsSum);
		
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).	
		System.out.println("---Number7---");
//		See *Methods below
		System.out.println(concatWord("Hello", 3));
		System.out.println(concatWord("Pizza", 8));
		
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println("---Number8---");
//		See *Methods below
		System.out.println(fullName("Danny", "Devito"));
		System.out.println(fullName("Tom", "Thompson"));
		
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
		System.out.println("---Number9---");
//		See *Methods below
		int[] numNineIntArr = {9, 8, 65, 32, 22, 1};
		System.out.println(isSumGreaterThan100(numNineIntArr)); //Will return true
		int[] numNineArr2 = {7, 3, 5, 33, 22, 11};
		System.out.println(isSumGreaterThan100(numNineArr2));	//Will return false
		
//10. Write a method that takes an array of double and returns the average of all the elements in the array
		System.out.println("---Number10---");
//		See *Methods below
		double[] number10doubles = {99, 88.4, 33.6, 2, 21.4, 90.3};
		System.out.println(averageOfAll(number10doubles));
		double[] secondNo10Doubles = {76.1, 33, 41, 13.9, 1.8};
		System.out.println(averageOfAll(secondNo10Doubles));
		
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array
		System.out.println("---Number11---");
//		See*Methods below
		double[] num11arr1 = {11.3, 33.2, 12.4, 61.3, 90.1};
		double[] num11arr2 = {12.1, 21.4, 90.5, 41.8, 6.2, 11};
		System.out.println(IsArray1AvgGreaterThanArray2(num11arr1, num11arr2)); // Returns true
		
		double[] elevenExample = {12, 16.4, 9.8, 11.4};
		double[] elevenExample2 = {100, 70.4, 31.2, 78, 89.8, 31};
		System.out.println(IsArray1AvgGreaterThanArray2(elevenExample, elevenExample2)); //Returns False
		
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("---Number12---");
//		See *Methods below
		System.out.println(willBuyDrink(true, 10));		//returns false
		System.out.println(willBuyDrink(true, 12.9));	//returns true
		System.out.println(willBuyDrink(false, 100));	//returns false

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it
		System.out.println("---Number13---");
//		Write a method called waterPlants that takes a boolean soilIsDry, and a boolean plantIsCactus, and an int daysSinceWatering and returns a String with a message to tell you if you need to water your plant or not.
//		If soil is dry, the plant is NOT a cactus(plant humor-my cacti hate water), and its been at least 4 days since watering, then waterPlant should return with a statement to water your plant. 
//		See *Methods below
		System.out.println(waterPlant(true, false, 5));	//returns with message to water plant
		System.out.println(waterPlant(true, true, 5));		//returns with message not to water plant
		System.out.println(waterPlant(true, false, 3));	//returns with message not to water plant
		System.out.println(waterPlant(false, false, 9));	//returns with message not to water plant
			
		
			
		}
	
//*Methods:
//1.)a.)	
	public static int subtractFirstFromLast(int[]numArray) {
		int result = numArray[numArray.length-1] - numArray[0];
		return result;
	}
//7.)
	public static String concatWord(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
//8.)
	public static String fullName(String firstName, String lastName) {
		String result = firstName + " " + lastName;
		return result;		//Returns the First and Last names, separated by a space.
	}
//9.)
	public static boolean isSumGreaterThan100(int[]intArray) {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {	//Iterates through the array, adding each element to the sum.
			sum += intArray[i];
		}
		return sum > 100;			//Will return true if the sum is greater than 100, and false if it is not greater than 100.
	}
//10.)
	public static double averageOfAll(double[]doubleArray) {
		double result = 0;
		for (int i = 0; i < doubleArray.length; i++) {	//Iterates through the array, adding each value to the result.
			result += doubleArray[i];
		}
		return result / doubleArray.length;		// returns the result divided by the length of the array to get the average of the values in the array.
	}
//11.)
	public static boolean IsArray1AvgGreaterThanArray2(double[]array1, double[]array2) {
		double result1 = 0;
		for (int i = 0; i < array1.length; i++) {	//First I wrote code to find the average of each array.
			result1 = (result1 + array1[i])/array1.length;
		}
		double result2 = 0;
		for (int i = 0; i < array2.length; i++) {
			result2 = (result2 + array2[i])/array2.length;
		}
		return result1 > result2;		//Returns true if result1 is greater than result2
	}
//12.)
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if ((isHotOutside) && (moneyInPocket > 10.50)){	//if isHotOutSide is true, and money in pocket is greater than 10.50, willBuyDrink returns as true
			return true;
	}
	return false;		//if the if statement above is not true, the method will return false.
}
//13.)
	public static String waterPlant(boolean soilIsDry, boolean plantIsCactus, int daysSinceWatering) {
		if ((soilIsDry) && !(plantIsCactus) && (daysSinceWatering > 4)) {
			return "Your plant is thirsty! Give 'em a drink!";
		}
		return "Your plant does not need water yet. Check back tomorrow.";
	}
}