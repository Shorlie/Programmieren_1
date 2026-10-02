package Block_1;
import java.io.*;
import static java.lang.System.*;
public class Auf_4 {
    public static void main(String[] args) throws IOException {
        int code = in.read();

        int lines = 0;
        int chars = 0;

        while(code >= 0){
            chars++;
            if(code == '\n'){
                lines++;
            }

            code = in.read();

        }
        out.printf("%d Zeichen ,%d Zeichen %n",chars,lines);
    }
}
