package example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StringTemplate.STR;

public class Main {




    public static void main( String[] args) {


        int x = 5;

        String html = """
        <html>
            <body>Hello World</body>
        </html>
        """;

        System.out.println(html);

        String text = """
    Hello \
    World
    """;

        System.out.println(text);


        String name = "Lisa".repeat(5);
        String message = STR."""
                \s
                Hello \{name},
                \sWelcome to Java 21!\
                                    """;

        System.out.println(message);
    }


}



