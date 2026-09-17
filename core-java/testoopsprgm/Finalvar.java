package testoopsprgm;

 class Finalvar {
int speedlimit = 90;
final void run()
{
	speedlimit=400;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Finalvar f = new Finalvar();
f.run();
	}

}
