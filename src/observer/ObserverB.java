package observer;

public class ObserverB implements Observer{
	RealSubject realSubject;
	public ObserverB(RealSubject realSubject) {
		this.realSubject = realSubject;
		realSubject.register(this);
	}

	@Override
	public void update(int value) {
		System.out.println("ObserverB value: " + value);
	}
}


