import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by fmiranda on 10/14/15.
 */
public class ParseDuplicates {

    private String htmlData;

    public ParseDuplicates(){

        this.htmlData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("Content.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }
            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHtmlData(){
        return htmlData;
    }

    public static void main(String[] args){
        ParseDuplicates parseHTML = new ParseDuplicates();
        System.out.println(parseHTML.getHtmlData());
    }
}
