public class Bai3 {
    public static void main(String[] args) {

        int soGiaoDich = 10000;

        // ----- String -----
        long start1 = System.currentTimeMillis();

        String report1 = "Thoi gian tao bao cao: " + System.currentTimeMillis() + "\n";
        for (int i = 1; i <= soGiaoDich; i++) {
            report1 = report1 + "BK" + i + " - 2026-01-28\n";
        }

        long end1 = System.currentTimeMillis();

        // ----- StringBuilder -----
        long start2 = System.currentTimeMillis();

        StringBuilder report2 = new StringBuilder();
        report2.append("Thoi gian tao bao cao: ")
                .append(System.currentTimeMillis())
                .append("\n");

        for (int i = 1; i <= soGiaoDich; i++) {
            report2.append("BK")
                    .append(i)
                    .append(" - 2026-01-28\n");
        }

        long end2 = System.currentTimeMillis();

        // ----- Kết quả -----
        System.out.println("String (+): " + (end1 - start1) + " ms");
        System.out.println("StringBuilder: " + (end2 - start2) + " ms");
    }
}
