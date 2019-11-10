import connection.BlogConnector;

import java.io.IOException;

public class Application {
    public static void main(String args[]) throws IOException {

        //https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial
        //https://jsonplaceholder.typicode.com/
        BlogConnector blogConnector = new BlogConnector();
        System.out.println(blogConnector.connect());
    }
}
