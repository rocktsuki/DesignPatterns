package pattern.lesson2.observers.Subject;

import pattern.lesson2.observers.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
