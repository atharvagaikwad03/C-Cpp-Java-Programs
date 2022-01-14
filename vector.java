import java.util.*;

class vector
{
  public static void main(String str[]) 
  {
    Vector <Integer>vobj1 = new Vector<Integer>();
    System.out.println("Size of vobj1 is "+ vobj1.size());
    System.out.println("Capacity of vobj1"+ vobj1.capactiy());

    Vector <Integer>vobj2 = new Vector<Integer>(20);
    System.out.println("Size of vobj2 is "+ vobj2.size());
    System.out.println("Capacity of vobj2"+ vobj2.capactiy());

    Vector <Integer>vobj3 = new Vector<Integer>(30,40);
    System.out.println("Size of vobj3 is "+ vobj3.size());
    System.out.println("Capacity of vobj3"+ vobj3.capactiy());
  }
} 