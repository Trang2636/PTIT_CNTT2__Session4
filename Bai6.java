import java.util.regex.*;

public class Bai6 {

    // Hàm tạo chuỗi **** theo độ dài từ
    private static String saoHoa(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String review = """
        Cuốn sách này noi dung kha hay, tuy nhien co mot so doan rat te va cach trinh bay hoi xau.
        Nhung nhin chung thi van dang doc cho sinh vien moi bat dau lap trinh Java.
        """; // giả lập review dài

        // ----- 1. Blacklist -----
        String[] blacklist = {"xau", "te", "rac"};

        // ----- 2. Regex -----
        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        // ----- 3. Thay thế từ nhạy cảm -----
        StringBuilder filtered = new StringBuilder();
        int lastIndex = 0;

        while (matcher.find()) {
            filtered.append(review, lastIndex, matcher.start());
            filtered.append(saoHoa(matcher.group().length()));
            lastIndex = matcher.end();
        }
        filtered.append(review.substring(lastIndex));

        String ketQua = filtered.toString();

        // ----- 4. Cắt chuỗi nếu quá dài -----
        if (ketQua.length() > 200) {
            int cutIndex = ketQua.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }

            StringBuilder shortReview = new StringBuilder();
            shortReview.append(ketQua.substring(0, cutIndex))
                    .append("...");

            ketQua = shortReview.toString();
        }

        // ----- Kết quả -----
        System.out.println("Danh gia sau khi xu ly:");
        System.out.println(ketQua);
    }
}
