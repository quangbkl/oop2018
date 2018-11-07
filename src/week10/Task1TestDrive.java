package week10;

import week9.Utils;

import java.io.File;
import java.util.List;

public class Task1TestDrive {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
//        String code = task1.getSourceCode(new File("C:\\Users\\DELL\\Desktop\\Code\\Java\\oop2018\\src\\week9\\Utils.java"));
//        int index = code.indexOf("public static");
//        String func = task1.getCodeFunction(code, index);
//        Utils.writeContentToFile("C:\\Users\\DELL\\Desktop\\Code\\Java\\oop2018\\src\\week10\\test.txt", func, false);
        List<String> funcs = task1.getAllFunctions(new File("C:\\Users\\DELL\\Desktop\\Code\\Java\\oop2018\\src\\week9\\Utils.java"));
        for (String func : funcs) {
            Utils.writeContentToFile("C:\\Users\\DELL\\Desktop\\Code\\Java\\oop2018\\src\\week10\\test.txt", "\n// Func: \n", true);
            Utils.writeContentToFile("C:\\Users\\DELL\\Desktop\\Code\\Java\\oop2018\\src\\week10\\test.txt", func, true);
        }
    }
}
