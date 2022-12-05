package org.example.singleton;


//singleton
public class AppConfig {
    private static AppConfig INSTANCE;
    //ustawienia aplikacji
    private String host;
    private int port;
    private String servletPrefix;

    private AppConfig(String host, int port, String servletPrefix) {
        this.host = host;
        this.port = port;
        this.servletPrefix = servletPrefix;
    }

    public static AppConfig getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new AppConfig("127.0.0.1", 0100, "/admin");
        }
        return INSTANCE;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getServletPrefix() {
        return servletPrefix;
    }
}
