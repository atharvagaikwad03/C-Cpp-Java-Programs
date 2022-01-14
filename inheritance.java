


class inheritance
{
    public static void main(String arg [])
    {
        Base bobj ;

    }
}

class Base
{
    public int x;
    public int y;

    
    public Base(int i, int j)
    {
        System.out.println("Base Constructor");
        this.x = 0;
        this.y = 0;
    }
    Base(int i, int j)
    {
        System.out.println("Base Constructor");
        this .x = i;
        this.y = j;
    }
    public void fun()
    {
        System.out.println("Base fun");
    }
}
class Derived extends Base  
{
    public int a,b;
    public Derived()
    {
        System.out.println("Derived Constructor");
        this.a=no1;
        this.b=no2;
    }
    public void gun()
    {
        System.out.println("Derived gun");
    }
}

