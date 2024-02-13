package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

class Message{
    private String message;

    Message(String message){
        this.message = message;
    }

    String getMessage(){
        return this.message;
    }
}


interface Subject{
    //call attach() to add observers to the observer list
    public void attach(Observer observer);
    
    //call detach() to remove observers from the observer list
    public void detach(Observer observer);

    //call notify() to publish all the changes made by the subject
    public void notify(Message message);
}

interface Observer{

    //call update() to inform all the observers about the chnages in the subject
    public void update(Message m);
}
//concrete class extends the base class
class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notify(Message message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }
}
//individual child observers implements the parent observer class
class ObserverA implements Observer{

    @Override
    public void update(Message m){
        System.out.println("observerA: " + m.getMessage());
    }
}

class ObserverB implements Observer{

    @Override
    public void update(Message m){
        System.out.println("observerB: " + m.getMessage());
    }
}

class ObserverC implements Observer{

    @Override
    public void update(Message m){
        System.out.println("observerC: " + m.getMessage());
    }
}



public class ObserverClient {
	public static void main(String[] args){
        ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();
        ObserverC c = new ObserverC();
    
        ConcreteSubject publisher = new ConcreteSubject();
        publisher.attach(a);
        publisher.attach(b);
    
        publisher.notify(new Message("First update\n"));
    
        publisher.attach(c);
        publisher.detach(b);
        publisher.notify(new Message("Second update\n"));
    
    }
}
