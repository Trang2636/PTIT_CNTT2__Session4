import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma the thu vien: ");
        String maThe = sc.nextLine();

        // Regex
        String PREFIX_REGEX = "^[A-Z]{2}";
        String YEAR_REGEX = "^[A-Z]{2}(\\d{4})";
        String FULL_REGEX = "^[A-Z]{2}\\d{4}\\d{5}$";

        // Kiểm tra tiền tố
        if (!Pattern.matches(PREFIX_REGEX, maThe)) {
            System.out.println("Loi: Thieu tien to 2 chu cai in hoa (VD: TV)");
            return;
        }

        // Kiểm tra năm
        Pattern yearPattern = Pattern.compile(YEAR_REGEX);
        Matcher yearMatcher = yearPattern.matcher(maThe);

        if (yearMatcher.find()) {
            int year = Integer.parseInt(yearMatcher.group(1));
            if (year < 2000 || year > 2030) {
                System.out.println("Loi: Nam vao hoc khong hop le");
                return;
            }
        } else {
            System.out.println("Loi: Thieu nam vao hoc");
            return;
        }

        // Kiểm tra toàn bộ
        if (!Pattern.matches(FULL_REGEX, maThe)) {
            System.out.println("Loi: Ma the khong dung dinh dang tong the");
            return;
        }

        System.out.println("Ma the hop le!");
    }
}
