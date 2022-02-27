import java.util.*;
import java.io.*;
import static java.lang.System.exit;

public class FileReader {
    public static void main(String[] args){
        int lineC = 0;
        int wordC = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = input.next();
        try{
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                lineC ++;
                String line = fileReader.nextLine();
                String []words = line.split(" ");
                for(String word: words){
                    if(word != ""){
                    wordC++;
                    }
                }
            }
        }catch(FileNotFoundException ex){
            System.out.println("File " + fileName + " not found");
            exit(1);
        }

        System.out.println("File "+ fileName+" has: ");
        System.out.println(lineC +" lines");
        System.out.println(wordC +" words");
        }
    }