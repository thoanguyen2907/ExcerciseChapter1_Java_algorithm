import java.util.Scanner;

public class  DuongTron{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Integer hoanhdoM;
	Integer tungdoM; 
	Integer hoanhdoO; 
	Integer tungdoO;
	Integer banKinh; 
	Integer khoangCachOM;
	String viTri; 
	Scanner scan = new Scanner(System.in); 
	
	System.out.print("Nhập vào hoành độ M:  ");
	hoanhdoM = Integer.parseInt(scan.nextLine());
	System.out.print("Nhập vào tung độ M:   ");
	tungdoM = Integer.parseInt(scan.nextLine());
	System.out.print("Nhập vào hoành độ O:   ");
	hoanhdoO = Integer.parseInt(scan.nextLine());
	System.out.print("Nhập vào tung độ O:  ");
	tungdoO = Integer.parseInt(scan.nextLine());
	System.out.print("Nhập vào bán kính O:  ");
	banKinh = Integer.parseInt(scan.nextLine());
	khoangCachOM = (hoanhdoM - hoanhdoO) * (hoanhdoM - hoanhdoO) + 
            (tungdoM - tungdoO) * (tungdoM - tungdoO);
	banKinh = banKinh * banKinh; 
	if (khoangCachOM < banKinh) {
        viTri = "Điểm M nằm bên trong đường tròn.";
    } else if (khoangCachOM == banKinh) {
        viTri = "Điểm M nằm trên đường tròn.";
    } else {
        viTri = "Điểm M nằm ngoài đường tròn.";
    }
	System.out.println(viTri);
	}
}
