package com.Practics;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

interface test
{
	public int test1(int a,int b);
}
public class JavaScriptExecutor {

	public static void main(String[] args) 
	{
		
		test t1=(a,b)->(a+b);		
		System.out.println(t1.test1(50, 20));
		test t2=(a,b)->(a-b);
		System.out.println(t2.test1(30, 20));
		
		ArrayList<String> arrylist = new ArrayList<>();
		arrylist.add("App");
		arrylist.add("Java");
		arrylist.add("Selenium");
		arrylist.add(".net");
		
		arrylist.forEach((n)->System.out.println(n));
	

	}

}
