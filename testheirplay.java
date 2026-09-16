package testoopsprgm;
interface Playable{
	void play();
}
class Football implements Playable {
	public void play() {
		System.out.println("Playing Football...");
	}
}
class Basketball implements Playable {
	public void play() {
		System.out.println("\nPlaying Basketball...");
	}
}
class Vollyball implements Playable {
	public void play() {
		System.out.println("\nPlaying Vollyball...");
	}
}
public class testheirplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Football f=new Football();
Basketball b = new Basketball();
Vollyball v = new Vollyball();
f.play();
b.play();
v.play();
	}

}
