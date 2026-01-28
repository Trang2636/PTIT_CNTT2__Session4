import java.util.Scanner;

public class Bai1 {

    // Hàm viết hoa chữ cái đầu mỗi từ
    public static String vietHoaChuCaiDau(String str) {
        str = str.toLowerCase();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap the loai: ");
        String theLoai = sc.nextLine();

        // Chuẩn hóa khoảng trắng
        tenSach = tenSach.trim().replaceAll("\\s+", " ");
        tacGia = tacGia.trim().replaceAll("\\s+", " ");
        theLoai = theLoai.trim().replaceAll("\\s+", " ");

        // Định dạng
        tenSach = tenSach.toUpperCase();
        tacGia = vietHoaChuCaiDau(tacGia);

        // Xuất kết quả
        System.out.println("\n--- Ket qua ---");
        System.out.println(tenSach + " - Tac gia: " + tacGia);
    }
}
