package org.example.app.bean;

import javax.ejb.Stateless;
import java.util.Map;

@Stateless
public class EnvironmentEjb {

    /**
     * Collects environment variables
     * @return Map with variable name as key and its value as 'value'
     */
    public Map<String, String> getEnvironmentVars() {
        return System.getenv();
    }
}
