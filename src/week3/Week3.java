package week3;

public class Week3 {

    public static int max(int m, int n) {
        // Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if (m > n) return m;
        return n;
    }

    public static int minOfArray(int[] array) {
        // Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int reslut = array[0];
        for (int i = 0, length = array.length; i < length; i++) {
            if (reslut < array[i]) reslut = array[i];
        }

        return reslut;
    }

    public static String calculateBMI(double weight, double height) {
        // Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight / Math.pow(height, 2);

        if (BMI < 18.5) return "Thiếu cân";
        if (BMI < 23) return "Bình thường";
        if (BMI < 25) return "Thừa cân";

        return "Béo phì";
    }
}
