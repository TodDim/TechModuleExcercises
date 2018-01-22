package TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberOfWordOccurences {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\tydimitrov\\IdeaProjects\\Again\\src\\TextFiles\\sample.txt";
        Scanner fileReader = null;
        int occurrences = 0;
        String word = "Java";
        try{
            fileReader=new Scanner(new File(fileName));
            System.out.println("The file "+fileName+" is opened");
            while (fileReader.hasNextLine()){
                String line=fileReader.nextLine();
                int index=line.indexOf(word);
                while(index!=-1){
                    occurrences++;
                    index=line.indexOf(word,index+1);
                }
            }
        }
        catch (FileNotFoundException fne){
            System.out.println("The file"+fileName + " was not found");
        }
        catch (NullPointerException npe){
            System.out.println("The file"+fileName + " was not found");
        }
        finally {
            if(fileReader!=null){
                fileReader.close();
                System.out.println("The file is closed");
            }
        }
        System.out.printf("The word %s is met %d times",word,occurrences);
    }
}