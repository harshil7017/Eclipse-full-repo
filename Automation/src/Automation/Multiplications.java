package Automation;

public class Multiplications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2==0)
			{
			System.out.println(arr[i]);
			break;
			}
			else
			{
				System.out.println("multiple of 2");
			}
			
		}

	}

}
