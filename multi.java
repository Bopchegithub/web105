package palakjava;

public class multi {
void sound() {
	System.out.println("sound........");
}
void picture() {
	System.out.println("picture........");
}
}
class Threedtv extends multi{
	void threed() {
		
			System.out.println("three D........");
		
	}
	void dolbyaudio() {
		System.out.println("Dol by Audio........");
	}
	class smarttv extends Threedtv{
		void internet() {
			System.out.println("internet........");
		}
		void fullhd() {
			System.out.println("HD........");
		}
	}
	class inheritancedemo{
	public static void main(String[] args) {
		smarttv m= new smarttv();
		m.sound();
		m.picture();
		m.threed();
		m.dolbyaudio();
		m.internet();
m.fullhd();
	}

	}
}
