import io.github.ausf_software.jcp.CommandParser;
import io.github.ausf_software.jcp.CommandToken;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<CommandToken> ttokens = null;
        try {
            ttokens = CommandParser.parse(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ttokens);
    }

}
