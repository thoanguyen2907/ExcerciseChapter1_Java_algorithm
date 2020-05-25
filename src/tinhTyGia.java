import java.util.Scanner;
public class tinhTyGia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final double vnd = 23500;
	double result; 
	int usaValue; 
	Scanner scan = new Scanner(System.in); 
	System.out.print("Enter usd value:  ");
	usaValue = Integer.parseInt(scan.nextLine());
	result = usaValue * vnd; 
	System.out.print("The exchange result is :  "+ result);
	}

}
