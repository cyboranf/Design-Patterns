package org.example.obserwator;

public class TwitterObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("Twitter: " + title);
    }
}
