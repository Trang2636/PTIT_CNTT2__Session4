import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mo ta sach: ");
        String moTa = sc.nextLine();

        if (moTa.contains("Kệ:")) {

            int start = moTa.indexOf("Kệ:") + "Kệ:".length();
            int end = moTa.indexOf(",", start);

            if (end == -1) {
                end = moTa.length();
            }

            String maViTri = moTa.substring(start, end).trim();

            System.out.println("Ma vi tri ke sach: " + maViTri);

            String moTaMoi = moTa.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mo ta moi: " + moTaMoi);

        } else {
            System.out.println("Khong tim thay thong tin ke sach.");
        }
    }
}
