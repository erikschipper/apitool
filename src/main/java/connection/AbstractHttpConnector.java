package connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class AbstractHttpConnector {

    protected String urlString;
    protected String requestMethod;
    private final int HTTP_OK = 200;

  public String connect() throws IOException {
        String resultMessage = "";

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(requestMethod);
        int status = connection.getResponseCode();
        if ( status != this.HTTP_OK) {
            throw new IOException( String.format("Response code: %d not equal to 200 (OK)", status));
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            resultMessage = resultMessage.concat( inputLine);
        connection.disconnect();
        return resultMessage;
    }

}
