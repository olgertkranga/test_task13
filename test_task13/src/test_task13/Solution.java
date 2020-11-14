package test_task13;

import java.util.Scanner;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testC = Integer.parseInt(in.nextLine());
		while (testC > 0) {
			String patt = in.nextLine();
			testC--;
			try {
				Pattern.compile(patt);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
	}
}