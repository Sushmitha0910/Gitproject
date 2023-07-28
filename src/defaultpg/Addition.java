package defaultpg;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num");
		x=sc.nextInt();
		System.out.println("enter another num");
		y=sc.nextInt();
		z=x+y;
		System.out.println("sum is:" +z);
		
		int a=5,b=4;
		if(a>b) {
			System.out.println("execute"); }
		else if(a<b) {
			System.out.println(" not execute");	
			}
		else {
			System.out.println("exec");
		}
		}
	}


