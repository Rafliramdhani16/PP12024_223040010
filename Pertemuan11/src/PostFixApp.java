import java.io.IOException;
import java.util.Scanner;

public class PostFixApp {
    public static void main(String[] args) {
        String input;
        int output;

        while(true){
            System.out.println("Enter postFix: ");
            System.out.flush();
            try {
                input = getString();
                if(input.equals("")){
                    break;
                }
                ParsePost aparser = new ParsePost(input);

                output = aparser.doParse();
                System.out.println("Hasil operasi "+ output);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String getString() throws IOException{
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
