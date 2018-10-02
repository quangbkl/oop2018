public class TestDrive {
    public static void main(String[] args) {
        int count = (int) (Math.random() * 20 + 10);
        for (int i = 0; i < count; i++) {
            int random = (int) (Math.random() * 500 - 250);
            System.out.print(random + ", ");
        }
    }
}
