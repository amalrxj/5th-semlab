class operators{
  public static void main(String arg[]){
  int a=5,b=10;
  boolean x=false,y=true;
  
  System.out.println("a+b: "+(a+b));
  System.out.println("a-b: "+(a-b));
  System.out.println("b/a: "+(b/a));
  System.out.println("a*b: "+(a*b));
  System.out.println("a%b: "+(a%b));
  System.out.println("a%b: "+(-a%b));
  
  System.out.println("b>a: "+(b>a));
  System.out.println("b<a: "+(b<a));
  System.out.println("b=a: "+(b==a));
  System.out.println("b!=a: "+(b!=a));
  System.out.println("b<=a: "+(b<=a));
  System.out.println("b>=a: "+(b>=a));
  
  System.out.println("b: "+(+b));
  System.out.println("-b: "+(-b));
  System.out.println("b+1: "+(b++));
  System.out.println("b-1: "+(b--));
  
  System.out.println("x && y: "+(x && y));
  System.out.println("x || y: "+(x || y));
  System.out.println("!x: "+(!x));
  System.out.println("y^x "+(y^x));

  System.out.println("x | y: "+(x | y));
  System.out.println("x & y: "+(x & y));
  System.out.println("x ^ y: "+(x ^ y));

  System.out.println("b<<1: "+(b<<1));
  System.out.println("b>>1: "+(b>>1));
  }
}
