package org.example.app.bean;

import javax.ejb.Stateless;
import java.util.Map;

@Stateless
public class EnvironmentEjb {
    public Map<String, String> getEnvironmentVars() {
        return System.getenv();
    }
}
