package testoopsprgm;

class Sports {
 void play() {
	 System.out.println("Playing a Sport....\n");
 }
}
class Football1 extends Sports{
	void play() {
		System.out.println("Playing Football...");
	}
}
class Basketball1 extends Sports {
	void play() {
		System.out.println("Playing Basketball...");
	
	}
}
class Rugby extends Sports {
	void play() {
		System.out.println("Playing Rugby...");
		
	}
}
public class Sportsover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports sport= new Sports();
		Football1 football = new Football1();
		Basketball1 basketball = new Basketball1();
		Rugby rugby =new Rugby();
		sport.play();
		football.play();
		basketball.play();
		rugby.play();

	}

}
