import java.util.Scanner;
class typeca{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.print("Enter First string: ");
		String b=a.nextLine();
		System.out.print("Enter Second string:");
		String c=a.nextLine();
		int d=Integer.parseInt(b);
		int e=Integer.parseInt(c);
		int comp=d>e?d:e;
		System.out.print("Largest is:"+comp);
	}
}


