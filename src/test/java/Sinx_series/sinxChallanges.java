
//Author : Ravindra Phapale

//	sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......

package Sinx_series;

import java.util.Scanner;
public class sinxChallanges {

	int fact=1,sin=-1;
	double sinxValue;

	public void calculateSinx(int n,double x)

	{
		x = Math.toRadians(x);
		sinxValue=x;
		for(int i=3;i<=n;i=i+2)
		{
			fact = fact*i*(i-1);
			sinxValue = sinxValue + sin * Math.pow(x,i)/fact;
			sin = sin * -1;

		}
		System.out.println("sin of x is  : " + sinxValue);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n tearm");
		int n = sc.nextInt();
		System.out.println("Enter the value of x");
		double x = sc.nextFloat();
		sc.close();
		sinxChallanges sinx =new sinxChallanges();
		sinx.calculateSinx(n,x);
	}
}
	
	
	

