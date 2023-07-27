
public class Week4Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Step 1
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // created an array age and used .length - to get the last value in the array and subtract it from the first element  
		int sum = ages[ages.length-1] - ages [0]; 
		
		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 96};
		int sum2 = ages2[ages2.length-1] - ages2 [0]; 
		
		System.out.println(sum);
		System.out.println(sum2);
		
		double total = 0;
		
		for (int i =0; i<ages2.length;i++) { // used a for loop to iterate through the array. create the variable call total to hold the value of all the elements in the array
			total += ages2[i];								// divided the totals by all the elements in the array. 
			
		}
		System.out.println(total/ages2.length);
	
		// Step 2
		
		String [] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // used the for loop to iterate through the array. used sum += to set the sum equal to the number of characters in the array 
		sum = 0; 															// in the for loop using the .length method to return the size of the array. 
																			// using .lenght() to return the # of characters in the string
		for (int i = 0; i < names.length; i++) {                            // created a double call average that is going to = the sum which is the number of characters / size of the array. 
			sum += names[i].length();                                       // using [i] to access each element in the array
		}	
		double average = sum /names.length; 
			System.out.println("The average number of letters per name in names[] = " + average); 
		
			String namesConcat = "";                      // created an empty string called namesConCat to pass each element of the array through. 
			                                              // names.length to get the size of the array. names[i] to iterate through each element. + " " to include a space between the names
			for (int i = 0; i < names.length; i++) {
					namesConcat += names[i] + " ";
			}
			System.out.println(namesConcat); 
	
			
			// Step 3
			// How do you access the last element of any array?
				// to get the last element of any array you would use [arr.length]
			
			// Step 4
			// How do you access the first element of any array?
				// the first element of any array would begin with index 0. So you would call for the 0 index in the array to return the first element
			
			
		// Step 5
			int [] nameLengths = new int [names.length];
			
			for (int i = 0; i < names.length; i++) {
					nameLengths[i] = names [i].length();
			} 
		// Step 6	                                                 
			sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {        // using the nameLegths array that was created in the pervious step. 
				sum += nameLengths[i];								// using the sum += to the sum equal to the number of characters in the array. 
			}                                                       // names.lenghts [i] to iternate through each value in the array
			System.out.println("The sum of all lengths in nameLengths[] = " + sum);
	
		// Step 7 
			String word = "Lemon";
			int n = 5; 
			String words = "";
		//	String result = repeatWord(word,n); 
			System.out.println(n);
		
		// Step 8
			String firstName = "Mike";                                  // method comments down below. 
			String lastName = "O'Neil";                                 
			String fullName = createFullName(firstName, lastName); 
			System.out.println(fullName);
			
		
			
		// Step 9
		// using the first array in of ages in step 1
		boolean isGreater = sumOfArray(ages); 
		System.out.println(isGreater);
			
		// Step 10
		// 
		double [] testScores = {96.52, 75.63, 85.63, 87.06, 92.26}; 
		double averageTest = averageTestScoreArray(testScores);
		System.out.println(averageTest);
	
		// Step 11
		double [] testScores2 = {96.52, 52.8, 65.3, 87.06, 92.26};
		boolean myResult = isAverageGreater(testScores,testScores2); 
		System.out.println(myResult);
		
		// Step 12
		
		boolean isHotOutside = true; 
		double moneyInPocket = 12.50; 
		boolean myResult2 = willBuyDrink(isHotOutside, moneyInPocket); 
		System.out.println(myResult2);
		
		// Step 13 
		
		double [] testScores3 = {50.3, 52.8, 65.3, 98.5, 92.26};
		double myResult3 = getBestGrade(testScores3); 
		System.out.println(myResult3);
		
	}
		// step 7 method
	
	//	public static String repeatWord(String word, int n) {
		//		 words = ""; 
		//	for (int i = 0; i < n; i++) {
		//		String repeatWord += word; 
		//		} return result; 
		//	}	
				
		
	
	 // step 8 method
			public static String createFullName(String firstName, String lastName) {
				String fullName = firstName + " " + lastName;   
				return fullName;                                              // created a method called createFullName that is going to take in the arguement firstName and last name
			}                                                                 // created a string variable full name that is the first name "" used for space between the first and last name. 
 	                                                                          // using the return to return the fullName. fullName will print when call from the method. 
	
	// step 9 method 
		
		public static boolean sumOfArray(int input[]) {                       // created a boolean method using an array call SumOfArray
				int sum = 0;                                                  // boolean variable isGreater is sent to the method name sumofArray and the array rages from the first step.
			for (int i = 0; i < input.length; i++) {                          // using the for loop to iterate through all the elments in the array. 
					sum += input[i];                                          // using sum to total up all the ages and then going to return if the sum is > than 100
			}																	// above I call the boolean variable isGreater and the sytem.out.println and it prints out true 
			return (sum > 100); 
		}
		
		// Step 10 Method
		public static double averageTestScoreArray(double testScores[]) {    // created an array called double testScores. 
				double sum = 0;                                              // double sum because the number will be a decimal. For loop created to iterate through the array and .length to return all the elements of the array.
			for (int i = 0; i < testScores.length; i++) {                      // testscore [i] to add up all the elements of the array into sum. dividing sum by all the elements of the array. 
					sum += testScores[i];                                      // prinitng out the variable averageTest which is tied to the method averageTestScoreArray(testScores);
			}
			return (sum / testScores.length); 
		}
	
		// Step 11 Method 
		
		public static boolean isAverageGreater (double arr1[], double arr2[]) {   
			// get the average of array 1 and store it in a variable 
			// get the average of array 2 and store it in a variable 
			// return if array 1 average is great than array 2 average
			double averageArr1 = averageTestScoreArray(arr1); 
			double averageArr2 = averageTestScoreArray(arr2); 
			boolean retVal = false; 
			if (averageArr1 > averageArr2) {
				retVal = true; 
			}
			return retVal; 
		}
	
		public static boolean willBuyDrink (boolean isHotOutSide, double moneyInPocket) {  //created a boolean method. created a if statement that will look to is if it is hot outside && if the person has greater than $12.00 in their po
			boolean returnVal = false;                                                     // created a boolean variable that is = to the method. boolean myResult2 = willBuyDrink(isHotOutside, moneyInPocket); 
			if (isHotOutSide && moneyInPocket >10.50) {
				returnVal = true; 
			}
			return returnVal; 
		}
		/// this method fines the best grades in an array of grades 
		public static double getBestGrade(double grades[]) { 
				double bestGrade = 0; 
			for (int i = 0; i < grades.length; i++) {
				if (grades[i] > bestGrade) {
					bestGrade = grades[i]; 
				}
			} 
			return bestGrade;
		}
	
	


}
