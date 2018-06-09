package io.intercom.api;

import java.net.URI;

public class Intercom {

    private static final URI API_BASE_URI = URI.create("https://api.intercom.io/");
    private static final String VERSION = "2.3.3";
    public static final String USER_AGENT = "intercom-java/" + Intercom.VERSION;

    enum AuthKeyType {
        API_KEY,
        TOKEN
    }
    
    private URI apiBaseURI = API_BASE_URI;
    private AuthKeyType authKeyType = AuthKeyType.API_KEY;
    private String apiKey;
    private String token;
    private String appID;
    private int connectionTimeout = 3 * 1000;
    private int requestTimeout = 60 * 1000;
    private boolean requestUsingCaches = false;
    private HttpConnectorSupplier httpConnectorSupplier = HttpConnectorSupplier.defaultSupplier;

    public Intercom() {}
    
    public long currentTimestamp() {
        return System.currentTimeMillis()/1000;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(int requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public boolean isRequestUsingCaches() {
        return requestUsingCaches;
    }

    public void setRequestUsingCaches(boolean requestUsingCaches) {
        this.requestUsingCaches = requestUsingCaches;
    }

    public HttpConnectorSupplier getHttpConnectorSupplier() {
        return httpConnectorSupplier;
    }

    public void setHttpConnectorSupplier(HttpConnectorSupplier supplier) {
        this.httpConnectorSupplier = supplier;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public void setToken(String token) {
        authKeyType = AuthKeyType.TOKEN;
        this.token = token;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
        authKeyType = AuthKeyType.API_KEY;
        this.apiKey = apiKey;
    }

    public URI getApiBaseURI() {
        return this.apiBaseURI;
    }

    public void setApiBaseURI(URI apiBaseURI) {
        this.apiBaseURI = apiBaseURI;
    }

    AuthKeyType getAuthKeyType() {
        return authKeyType;
    }

    public String getToken() {
        return token;
    }

}
