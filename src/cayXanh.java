import java.util.Scanner;
public class cayXanh {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter R: ");
        double R = scanner.nextDouble();
        System.out.println("Enter Space: ");
        double space = scanner.nextDouble();

        double tongsocay = ((length + space) / (space + 2*R));
        double tongduongkinh = Math.floor(2*R*tongsocay);

        System.out.println("Tong so cay co the trong: " + (double) Math.floor(tongsocay));
        System.out.println("Tong so duong kinh " + tongduongkinh);
	}

}
