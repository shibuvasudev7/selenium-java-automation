package assesment;
abstract class Appliance {
    abstract void work();
    void plugIn() {
        System.out.println("Appliance is plugged in");
    }
}
class TV extends Appliance {
    void work() {
        System.out.println("TV is Playing");
    }
}
public class Appabst {
	public static void main(String[] args) {
        TV t = new TV();
        t.plugIn(); 
        t.work();   
    }
}
	

