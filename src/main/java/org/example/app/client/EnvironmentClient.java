package org.example.app.client;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.Map;

@ApplicationScoped
@Named("environmentClient")
public class EnvironmentClient {

    public Map<String, String> call() {
        Client client = ClientBuilder.newClient();
        Map<String, String> map = client
                .target("http://localhost:8080/homework_14_rest/app/service/environment")
                .request()
                .get(Map.class);
        System.out.println(map);
        return map;
    }


}
