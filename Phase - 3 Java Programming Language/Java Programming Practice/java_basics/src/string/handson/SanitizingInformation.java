package string.handson;

import java.util.*;

public class SanitizingInformation {
	
	public static String sanitizePassword(String password)
	{
		return password.replaceAll(".", "*");
	}
	
	public static String sanitizeIp(String ip)
	{
		return ip.replaceAll("[0-9]", "*");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the password: ");
		String password = sc.nextLine();
		
		System.out.print("Enter the IP: ");
		String ip = sc.nextLine();
		
		System.out.print("Enter the status: ");
		String status = sc.nextLine();
		
		String sanitizedPassword = sanitizePassword(password);
		
		String sanitizedIp = sanitizeIp(ip);
		
		System.out.println("Sanitized Information.");
		System.out.println("Name : "+name);
		System.out.println("Password : "+sanitizedPassword);
		System.out.println("IP : "+sanitizedIp);
		System.out.println("Status : "+status);
		
	}
}
