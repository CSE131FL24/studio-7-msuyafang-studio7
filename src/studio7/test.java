package studio7;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(6, 8);
		
		Die d8 = new Die(8);
		
		System.out.println(r.area());
		for (int i = 0; i<10; i++) {
			System.out.print(d8.roll()+"  ");
		}
		System.out.println();
		Complex x = new Complex(2,3);
		
		Complex y = new Complex(5,8);
		
		Complex z = y.multiply(x);
		System.out.println(z.show());
	}
}
