import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Server {
    
    // Main Method
    public Server() throws IOException {
        // Create an HttpServer instance
        HttpServer server = HttpServer.create(new InetSocketAddress(8008), 0);

        // Create a context for a specific path and set the handler
        server.createContext("/", new MyHandler());

        // Start the server
        server.setExecutor(null); // Use the default executor
        server.start();

        System.out.println("Server is running on port 8008. Now in separate classes!");
    }

}
