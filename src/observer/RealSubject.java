package observer;

import java.util.ArrayList;
import java.util.List;

public class RealSubject implements Subject{
	private List<Observer> observers = new ArrayList<>();
	
	int value;
	
	public RealSubject() {
		value = 0;
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}
	@Override
	public void remove(Observer o) {
		observers.remove(o);
	}
	public void setValue(int value) {
		this.value = value;
		Notify();
	}
	@Override
	public void Notify() {
		observers.forEach(o -> o.update(value));
	}
	
}








