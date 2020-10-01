package com.ifi.client;

import com.ifi.client.generated.HelloWorldServer;
import com.ifi.client.generated.HelloWorldServerService;

import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:9000/HelloWorld?wsdl");
        HelloWorldServerService service = new HelloWorldServerService(url);
        HelloWorldServer server = service.getHelloWorldServerPort();
        System.out.println(server.sayHelloWorldFrom("Duc"));
    }
}
