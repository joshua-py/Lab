class Box
{

  double width = 5;
  double height = 7;
  double depth = 9;
 
  Box (double w, double h, double d)
  {
    width = w;
    height = h;
    depth = d;
  }
}

class BoxWeight extends Box
{
  double weight;
    BoxWeight (double w, double h, double d, double m)
  {
    super(w, h, d);
    weight = m;
  }
}

class nava
{
  public static void main (String args[])
  {
    BoxWeight mybox1 = new BoxWeight (10, 20, 15, 34.3);
    BoxWeight mybox2 = new BoxWeight (2, 3, 4, 0.076);
      System.out.println ("Weight of mybox1 is " + mybox1.weight);
      System.out.println ();
      System.out.println ("Weight of mybox2 is " + mybox2.weight);
  }
}