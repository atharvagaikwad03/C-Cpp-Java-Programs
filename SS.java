import java.util.*;

class SS
{
  public static void main(String[] args) 
  {
    Stack<String> sobj = new Stack<String>();

    sobj.push("India");
    sobj.push("US");
    sobj.push("NY");
    sobj.push("California");

    System.out.println(sobj);
    sobj.pop();

    System.out.println(sobj);

    sobj = null;
  }
}