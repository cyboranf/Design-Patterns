package org.example.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        AppConfig appConfig=AppConfig.getINSTANCE();
        System.out.println(AppConfig.class+" "+appConfig.getHost());
        System.out.println(AppConfig.class+" "+appConfig.getServletPrefix());
        System.out.println(AppConfig.class+" "+appConfig.getPort());
    }
}
