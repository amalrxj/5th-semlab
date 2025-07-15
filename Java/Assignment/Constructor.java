class Box{
 int height;
 int width;
 int depth;
 Box(int h, int w, int d){
 height = h;
 width = w;
 depth = d;
 }
}
class Constructor{
public static void main(String args[]){
Box b = new Box(10,10,20);
int vol = b.height * b.depth *b.width;
System.out.println("Volume is: "+vol);
}
}

