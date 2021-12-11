package day4homework;

public class LoopConcept {

	public static void main(String[] args) {
		// suppose I want to print 1-10 what is the first way of doing it
		// what is loop? Answer: Repeat the repetitive work
		int i=1;
		while(i<=10) {
			System.out.println(i);
			// if I run it will  print infinite result because we did not break the loop
			// now I need increment 
			//i++;  
			//++i;
			i=i+1;
		}

	}

}
