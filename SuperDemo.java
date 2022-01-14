class  SuperDemo
{
    public static void main(String arg[])
    {
       Derived dobj=new Derived();

    }
}

class Base
{
     public int x,y;
     public Base(int a, int b)
     {
        System.out.println("Base construtor");
        this.x=a;
        this.y=b;
     }
     public void fun()
     {
        System.out.println("Base fun");
     }
}

class Derived extends BBase
{
    public int a,b;
    public Derived()
    {
        super(11,21);
      System.out.println("Derived construtor");
    }
    public void gun()
    {
        System.out.println("Value of x : "  + super.x);
        super.fun();
    }
}

