
class Complex_Number_addition {
	int real, image;
	public Complex_Number_addition(int r, int i)
	{
		this.real = r;
		this.image = i;
	}

	public void showC()
	{
		System.out.print(this.real + "+" + this.image+"i");
	}
	public static Complex_Number_addition add(Complex_Number_addition n1,
									Complex_Number_addition n2)
	{
		Complex_Number_addition res = new Complex_Number_addition(0, 0);
		res.real = n1.real + n2.real;
		res.image = n1.image + n2.image;
		return res;
	}

	public static void main(String arg[])
	{

		Complex_Number_addition c1 = new Complex_Number_addition(4, 5);
		Complex_Number_addition c2 = new Complex_Number_addition(10, 5);
		System.out.print("first Complex number: ");
		c1.showC();
		
		System.out.print("\nSecond Complex number: ");
		c2.showC();

		Complex_Number_addition res = add(c1, c2);

		System.out.println("\nAddition is :");
		res.showC();
	}
}
