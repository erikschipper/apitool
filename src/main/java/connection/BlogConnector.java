package connection;

import static connection.requestMethod.REQUEST_METHOD_GET;

public class BlogConnector extends AbstractHttpConnector {

    public BlogConnector() {
        this.urlString ="https://jsonplaceholder.typicode.com/todos";
        this.requestMethod = REQUEST_METHOD_GET;
    }
}
