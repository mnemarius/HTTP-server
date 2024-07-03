import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class Handler {
    
    // Create an HttpServer instance
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
 
        // Create a context for a specific path and set the handler
        server.createContext("/", new MyHandler());
 
        // Start the server
        server.setExecutor(null); // Use the default executor
        server.start();
 
        System.out.println("Server is running on port 8000");

}
