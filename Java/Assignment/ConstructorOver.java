class Box{
double height;
double width;
double depth;
Box(Box obj){
height = obj.height;
width = obj.width;
depth = obj.depth;
}
Box(double h, double w, double d){
height = h;
width = w;
depth = d;
}
double volume(){
return width * height * depth;
}
}
class ConstructorOver{
public static void main(String args[])
{
double vol;
Box box1 = new Box(10, 11, 12);
Box box2 = new Box(box1);
vol = box1.volume();
System.out.println("Volume: "+ vol);
vol = box2.volume();
System.out.println("Volume: "+ vol);
}
}
