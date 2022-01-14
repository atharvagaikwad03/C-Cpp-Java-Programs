import java.lang.*;
class Arithmatic
{
    public int no1;
    public int no2;
    
    Arithmatic() //Default Constructor
    {
        this.no1=0;
        this.no2=0;
    }
   public  Arithmatic(int x,int y)  //Parametrised Constructor
    {
        this.no1=x;
        this.no2=y;
    }
    public int Addition() //Behaviour
    {
        int ans=0;
        ans=this.no1+this.no2;
        return ans;
    }
    public int Subtraction() //Behaviour
    {
        int ans=0;
        ans=this.no1-this.no2;
        return ans;
}
class Vs
{
   public static void main(String arg[])
    {
        System.out.println("Inside main");
        Arithmatic obj1;     //Reference
        obj1=new Arithmatic();  //Dynamic Memory Allocation
        Arithmatic obj2=new Arithmatic(21,11);
        int ret=0;
        ret=obj2.Addition();
        System.out.println("Addition is :"+ret);
        ret=obj2.Substraction();
        System.out.println("Substraction is :"+ret);
    }
}


