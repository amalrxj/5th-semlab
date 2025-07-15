class Box{
 double height;
 double width;
 double depth;
}
class Volume{
public static void main(String args[]){
Box b= new Box();
b.height = 10;
b.width = 20;
b.depth = 30;
double vol = b.height * b.depth *b.width;
System.out.println("Volume is: "+vol);
}
}

