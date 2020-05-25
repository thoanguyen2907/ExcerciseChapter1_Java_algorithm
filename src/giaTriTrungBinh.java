import java.util.Scanner;

public class giaTriTrungBinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số thứ 1 :   ");
		float num1  = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập vào số thứ 2 :   ");
		float num2  = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập vào số thứ 3 :   ");
		float num3  = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập vào số thứ 4 :   ");
		float num4  = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập vào số thứ 5 :   ");
		float num5  = Float.parseFloat(scan.nextLine());
		float giaTriTrungBinh = num1 + num2 + num3 + num4 + num5; 
		System.out.println("Gia Tri Trung Binh : " + giaTriTrungBinh);
	}

}
