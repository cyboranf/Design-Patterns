package org.example.obserwator;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Post implements Subject{
    private List<Observer> observers;
    private String content;
    private String title;

    public Post() {
        this.observers = new ArrayList<>();
    }

    public void share(){
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        System.out.println("New Observer added: "+observer.getClass().getSimpleName());
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        System.out.println("Observer removed: "+observer.getClass().getSimpleName());
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obs->{
            System.out.println("NEW NOTIFY FOR: "+obs.getClass().getSimpleName());
            obs.update(title);

        });

    }
}
