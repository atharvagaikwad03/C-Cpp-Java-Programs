import java.util.*; //util means utility

class Input
{
    public static int Addition(int iNo1, int iNo2)
    {
        int iAns=0;
        iAns=iNo1 + iNo2;
        return iAns;
    }
    public static void main(String arg[])
    {
        int iValue1=0,iValue2=0,iRet =0;
      Scanner sobj= new Scanner(System.in);

      System.out.println("Enter first number");
      iValue1=sobj.nextInt();

      
      System.out.println("Enter second  number");
      iValue2=sobj.nextInt();

      iRet=Addition(iValue1,iValue2);
      System.out.println("Additiom is :"+iRet);


    } 
}
   

