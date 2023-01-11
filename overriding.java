class A
{
  string meth()
  {
    return "Invoking method from class A";
  }
}

class B extends A
{
  @overriding
  String meth()
  {
    return "Method is overridden in Extended class B";
  }
}

class overriding
{
  public static void main(String[] args)
  {
    B b = new B();
    b.meth();
  }
}
