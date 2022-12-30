import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritTEst {

    public static void makeFile() throws IOException {

        File file=new File("g://myFile.txt");

            boolean b=file.createNewFile();
            if (b==true){
                System.out.println("done");
            }else {
                System.out.println("it's already created");
            }

            //A2


           FileWriter fileWriter=new FileWriter(file);
            fileWriter.write("Hello World:::::::::::::;");
            fileWriter.close();

            //A3 to read the file

            Scanner scanner=new Scanner(file);
            while (scanner.hasNext()){
                String s=scanner.next();
                System.out.print(s+" ");
            }}





    public static void main(String[] args) throws IOException {
        makeFile();


    }
}
