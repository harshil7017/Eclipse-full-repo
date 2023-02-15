package Automation;

public class String1 {



	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("HARSHIL SHETH VADODARA");
		String[] spilttedString=s1.split("VADODARA");
		System.out.println(spilttedString[0]);
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
				
		}

	}
}

