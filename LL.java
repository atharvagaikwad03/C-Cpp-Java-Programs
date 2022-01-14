import java.util.*;

class LL
{
  public static void main(String Arg[])
  {
    //          Key    Value
    Hashtable<String,Integer> hobj = new Hashtable<String,Integer>();
    hobj.put("PPA",10);
    hobj.put("LB",20);
    hobj.put("PML",30);
    hobj.put("LSP",40);
    hobj.put("Angular",50);
    hobj.put("C#",60);

    System.out.println(hobj.get("LB")); //Data search with the key.

    System.out.println("Data from Hashtable");
    hobj.remove("C#");
    Enumeration eobj =hobj.keys();

    while(eobj.hasMoreElements())
    {
      System.out.println(eobj.nextElement());
    }

    hobj = null;
  }
}