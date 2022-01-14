class Demo
{
    public int i;
    public final int j =10;
}

class FinalChar
{
  public static void main(String arg[])
  {
    Demo obj = new Demo();
    System.out.println("Value of j : "+obj.j);

    //obj.j++
  }
}
