package math;

public class Pattern {

	public static void main(String[] args) {
		/*
		 * Read this numbers, find the pattern then implement the logic from
		 * this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64
		 * ,61,58,55,52,49,46,43,40,36,32
		 * 
		 */
		//turn this into design pattern will require more time
		//short but not the best solution due to short time  
		int countFirst = 0;
		int fisrtNumber = 100;
		int lastNumber = 30;
		while (fisrtNumber > lastNumber) {
			countFirst++;
			if (countFirst <= 10) {
				System.out.println(fisrtNumber);
				fisrtNumber--;
			} else if (countFirst <= 20) {
				System.out.println(fisrtNumber);
				fisrtNumber = fisrtNumber - 2;
			} else if (countFirst <= 30) {
				System.out.println(fisrtNumber);
				fisrtNumber = fisrtNumber - 3;
			} else if (countFirst <= 40) {
				System.out.println(fisrtNumber);
				fisrtNumber = fisrtNumber - 4;
			}
		}

	}
}
