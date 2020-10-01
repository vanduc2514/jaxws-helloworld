package jaxws;

import com.ifi.HelloWorld;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class HelloWorldServer {
    private HelloWorld helloWorld;

    public HelloWorldServer() {
        helloWorld = new HelloWorld();
    }

    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = helloWorld.sayHelloWorld(from);
        System.out.println(result);
        return result;
    }

    public static void main(String[] argv) {
        Object implementor = new HelloWorldServer();
        String address = "http://localhost:9000/HelloWorld";
        Endpoint.publish(address, implementor);
    }
}
