import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Q5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        Scanner reader;
        int line=0;
        int number[] =new int[]{0,0,0,0,0,0};
        try {
            reader = new Scanner(file);
            while(reader.hasNextInt()){
                line = reader.nextInt();
                    number[line]++;
                }
            System.out.println();
            PrintWriter outputFile = new PrintWriter("output.txt");
            System.out.println("Writing content to output file");
            outputFile.write(String.format("%-20s%-20s\n","Rating","Frequency"));
            for(int i = 1; i <= 5; i++){
                outputFile.write(String.format("%-20d%-20d\n",i,number[i], args));
            }
            outputFile.close();
            } catch (FileNotFoundException e) {
                System.out.println("file not found");
            }
            sc.close();
        }
}
