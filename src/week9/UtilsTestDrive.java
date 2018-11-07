package week9;

public class UtilsTestDrive {
    public static void main(String[] args) {
        Utils.writeContentToFile("C:\\Users\\DELL\\Desktop\\test.txt", "Quang BKL.", false);
        System.out.println(Utils.readContentFromFile("C:\\Users\\DELL\\Desktop\\test.txt"));
        System.out.println(Utils.findFileByName("C:\\Users\\DELL\\Desktop", "test.txt"));
    }
}
