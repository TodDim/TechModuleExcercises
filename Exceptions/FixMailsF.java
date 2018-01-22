package Exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixMailsF {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input6.txt"));
//        for (String s : lines) {
//            System.out.println(s);
//        }
//        String []files= Arrays.stream(new File(".").listFiles()).filter(f->f.getName().startsWith(".\\output")).forEach(f-> Arrays.stream(f.getName().split("_")).skip(1).findFirst());
        Files.delete(Paths.get("output.txt"));
        for (int i = 0; i < lines.size(); i += 2) {
            if (lines.get(i).equals("stop")) {
                break;
            }
            String name = lines.get(i);
            String mail = lines.get(i + 1);
            if (mail.endsWith("uk") || mail.endsWith("us")) {
                continue;
            }
            String output = name + " -> " + mail;
            FileWriter writer = new FileWriter("output.txt", true);
            writer.append(output + System.lineSeparator());
            writer.close();
        }

    }

}
