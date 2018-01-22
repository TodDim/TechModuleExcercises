package Exceptions;

import org.omg.CORBA.Environment;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpInFIles {
    public static void main(String[] args) throws IOException {

BufferedReader reader=new BufferedReader(new FileReader(""));
       List<String> arr=  Files.readAllLines(Paths.get("C:\\Users\\tydimitrov\\IdeaProjects\\Again\\src\\Exceptions\\textfile.txt"))  ;
        for (String str:arr
             ) {
            System.out.print(str);
        }
        FileWriter w=new FileWriter("");
        w.write("hello");
        w.close();
//        List<String> oddarr=arr.stream().forEach( {
//
//        });collect(Collectors.toList());


    }
}

