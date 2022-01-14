class StaticBlock
{
  public static void main(String arg[])
  {
     Sysytem.out.println("Inside main");
     Demo obj1 = new 
  }
}

class Demo 
{
  public int i,j ;
  public static int x,y;

  static 
  {
     System.out.println("Inside static block");
     x=10;
     y=20;
  }

  public Demo()
  {
     System.out.println("Inside Construtor");
     i = 10;
     j = 20;
  }
}