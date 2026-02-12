package runTime_polymorphismPrograms;

public class MainApp 
{
	public static void show(Trainer t)
	{
		t.teach();
	}
	public static void main(String[] args) {
		show(new Pavan());
		show(new Yaswanth());
		show(new Siva());
	}
}
