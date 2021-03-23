package observer;

public class main {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();

		ObserverA obA = new ObserverA(realSubject); 
		ObserverB obB = new ObserverB(realSubject);
		
		realSubject.setValue(10);
		
		
	}
}






