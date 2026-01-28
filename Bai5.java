import java.util.regex.*;
import java.util.*;

public class Bai5 {
    public static void main(String[] args) {

        List<String> logs = List.of(
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK12345",
                "2024-05-22 | User: LeVanC | Action: BORROW | BookID: BK67890"
        );

        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: ([A-Za-z0-9]+) \\| Action: (BORROW|RETURN) \\| BookID: (BK\\d+)";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if (matcher.matches()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                // In thông tin bóc tách
                System.out.println("Ngay: " + date);
                System.out.println("User: " + user);
                System.out.println("Action: " + action);
                System.out.println("BookID: " + bookId);
                System.out.println("------------------");

                // Thống kê
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }

        System.out.println("Tong BORROW: " + borrowCount);
        System.out.println("Tong RETURN: " + returnCount);
    }
}
