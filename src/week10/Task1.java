package week10;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public String getCodeFunction(String code, int startFunction) {
        int pos = code.indexOf("{", startFunction);
        int deviation = pos != -1 ? 1 : 0;
        if (deviation == 0) return "";

        while (deviation != 0) {
            pos = Math.min(code.indexOf("{", pos), code.indexOf("}", pos));
            if (code.charAt(pos) == '{') deviation += 1;
            else deviation -= 1;
        }

        return code.substring(startFunction, pos);
    }

    public String getSourceCode(File path) {
        String code = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String temp;
            boolean isComment = false;
            while ((temp = bufferedReader.readLine()) != null) {
                if (temp.contains("/*")) {
                    isComment = true;
                    code += temp.substring(0, temp.indexOf("/*")) + "\n";
                }
                if (temp.contains("*/")) {
                    isComment = false;
                    code += temp.substring(temp.indexOf("*/")) + "\n";
                }

                int indexComment = temp.indexOf("//");
                if (indexComment != -1) {
                    code += temp.substring(0, indexComment) + "\n";
                } else {
                    if (!isComment) code += temp + "\n";
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error read file.");
        }

        return code;
    }

    public List<String> getAllFunctions(File path) {
        List<String> result = new ArrayList<>();


        return result;
    }
}
