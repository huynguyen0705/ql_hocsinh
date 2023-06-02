import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            try {
                System.out.println("nhập số học sinh: ");
                Scanner scanner = new Scanner(System.in);
                HsHocSinh hsHocSinh = new HsHocSinh();
                int SoHs = scanner.nextInt();
                for (int i = 0; i < SoHs; i++) {
                    System.out.println("nập thông tin học sinh thứ " + (i + 1) + ":");
                    System.out.println("nhập họ tên: ");
                    String hoTen = scanner.next();
                    System.out.println("nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    System.out.println("nhập năm sinh: ");
                    int namSinh = scanner.nextInt();
                    System.out.println("nhập quê quán: ");
                    String queQuan = scanner.next();
                    System.out.println("nhập lớp học: ");
                    String lopHoc = scanner.next();
                    System.out.println("nhập khoá học: ");
                    String khoaHoc = scanner.next();
                    System.out.println("nhập kỳ học: ");
                    int kyHoc = scanner.nextInt();
                    hsHocSinh.ThemCaNhan(hoTen,tuoi,namSinh,queQuan,lopHoc,khoaHoc,kyHoc);
                    hsHocSinh.HienThi();
                }
                System.out.println("1. hiển thị học sinh sinh năm 1985");
                System.out.println("2. đếm có bao nhiêu hs sinh năm 1985 quê thái nguyên");
                System.out.println("mời chọn");
                int input = scanner.nextInt();
                if (input < 1 || input > 2){
                    System.out.println("nhập sai");
                }
                switch (input){
                    case 1:
                        System.out.println("học sinh sinh năm 1985: ");
                        hsHocSinh.HienThiHsSinhNam1985();
                        break;
                    case 2:
                        System.out.println("số học sinh sinh năm 1985 quê thái nguyên");
                        System.out.println(hsHocSinh.DemHsSinhNam1985QueThaiNguyen());
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("nhập sai kiểu");
            }
        }
    }
}