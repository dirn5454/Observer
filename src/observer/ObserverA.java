package observer;

public class ObserverA implements Observer{
	RealSubject realSubject;
	public ObserverA(RealSubject realSubject) {
		this.realSubject = realSubject;
		realSubject.register(this);
	}

	@Override
	public void update(int value) {
		System.out.println("ObserverA value: " + value);
	}
}


