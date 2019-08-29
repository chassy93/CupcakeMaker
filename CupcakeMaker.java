
public class CupcakeMaker {
	public static void main(String args[]) {
		Cupcake cupcake = new ChocoCupcake();
		cupcake = new ChocoIce(cupcake);
		System.out.println(cupcake.getDescription()+" $"+cupcake.cost());
		
		Cupcake cupcake2 = new RedVelvet();
		cupcake2 = new ButtercreamIce(cupcake2);
		System.out.println(cupcake2.getDescription()+" $"+cupcake2.cost());
		
		Cupcake cupcake3 = new Vanilla();
		cupcake3 = new ChocoIce(cupcake3);
		cupcake3 = new ChoppedNuts(cupcake3);
		System.out.println(cupcake3.getDescription()+" $"+cupcake3.cost());
		
		Cupcake cupcake4 = new SugarFree();
		cupcake4 = new SugarFreeIce(cupcake4);
		System.out.println(cupcake4.getDescription()+" $"+cupcake4.cost());
	}
}
