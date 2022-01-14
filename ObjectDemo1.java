class Demo implements Cloneable
{
  public String Name;
  public String Batch;

  public Demo(String x, String y)
  {
    this.Name =x;
    this.Batch =y;
  }
  public String toString()
  {
    return this.Name+" "+this.Batch;
  }
  protected void finalize()
  {
    System.out.println("Inside finalize method");
  }
  public Object clone() throws Exception
  {
    return super.clone();
  }
}

class ObjectDemo1
{
  public static void main(String arg[])
  {
    Demo obj1 = new Demo("Rahul","PPA");
    Demo obj2 = new Demo("Atharva","Python");

    System.out.println("Hashcode of obj1 is :"+obj1.hashCode());
    System.out.println("Hashcode of obj2 is :"+obj2.hashCode());
    System.out.println(obj1.toString());

    Class cobj = obj1.getClass();
    System.out.println("Name of class is :"+cobj.getName());

    Demo objX = (Demo)obj1.clone();
    obj1 = null;
    obj2 = null;
    System.gc();
  }
}