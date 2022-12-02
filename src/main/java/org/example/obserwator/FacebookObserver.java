package org.example.obserwator;

public class FacebookObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("Facebook: " + title);
    }
}
