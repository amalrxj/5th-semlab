class mOverload{
void test(){
System.out.println("No Parameter");
}
void test(int a, int b){
System.out.println("a and b is: " +a+","+b);
}
void test(double d){
System.out.println("d is: "+d);
}
int test(int d){
return d;
}
}

class Overload{
public static void main(String args[]){
mOverload  obj =  new mOverload();
obj.test();
obj.test(10,20);
obj.test(20.0);
int val = obj.test(21);
System.out.println("d is: "+val);
}
}
