import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicates {
	private static Scanner read;
	// Simple program that filters negative numbers from positive numbers 
	
	public static void main(String[] args) throws InterruptedException {
		read = new Scanner(System.in);
		int p = read.nextInt();
		int q =	read.nextInt();
		int r = read.nextInt();
		int s = read.nextInt();
		int t = read.nextInt();
		int u = read.nextInt();
		int v = read.nextInt();
		int w = read.nextInt();
		int x = read.nextInt();
		int y = read.nextInt();
		
		List<Integer> numbers = Arrays.asList(p,q,r,s,t,u,v,w,x,y);
		List<Integer> filteredNumbers = getFilteredNumber(numbers, IntPredicate.positiveIntegerPredicate);
		filteredNumbers.forEach(System.out::println);
		}
	
	public static List<Integer> getFilteredNumber(List<Integer> numbers, Predicate<Integer> intPredicate) throws InterruptedException {
		List<Integer> filteredNumbers = new ArrayList<Integer>();
		for (Integer i : numbers) {
			if (intPredicate.test(i)) {
				filteredNumbers.add(i);
			}
		}
		System.out.println("The positive numbers are... ");
		Thread.sleep(1000);
		return filteredNumbers;
	}
	
	
	}
	



