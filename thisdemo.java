class thisdemo
{
    public static void main(String arg [])
    {
      Demo obj=new Demo (10,20);
    }
}

class Demo 
{
    public int x,y;
    public Demo()
    {
        System.out.println("Default Constructor");
    }
    public Demo(int a,int b)
    {
        this();
        System.out.println("Inside parametrized Constructor");
        this.x=a;
        this.y=b;
    }
    public void fun()
    {
        System.out.println("Inside fun");
        System.out.println("value of x : "+this.x);
    }
    public void gun()
    {
        System.out.println("Inside gun");
    }
}