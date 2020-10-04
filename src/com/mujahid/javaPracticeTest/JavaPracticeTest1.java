package com.mujahid.javaPracticeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaPracticeTest1 {

	public static void main(String[] args) {
	
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result;
		try {
			int input1 = Integer.parseInt(br.readLine());
			int input2 = Integer.parseInt(br.readLine());

			result = input1/input2;
			System.out.println("result is :"+ result);
		}*/
		try {
            Scanner scanner = new Scanner(System.in);
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();
            int result;
            result = input1/input2;
            System.out.println(result);
        }        
        
        catch(InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }catch(NumberFormatException e) {
            System.out.println("java.util.InputMismatchException");
        }catch(Exception e) {
            e.printStackTrace();
        }    
	}

}
