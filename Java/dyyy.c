#include<iostream>
using namespace std;
class new_delete
{
int size i;
int*arr;
public:
void new_operator(void);
void read(void);
void display(void);
void delete_operator(void);
};
void new_delete::new_operator(void)
{
cout<<"enter the array size";
cin>>size;
cout<<"creating an array of size";
arr=new int[size];
cout<<"\n dynamic memory allocation for array is successful";
}
void new_delete::read(void)
{
cout<<"enter the elements";
for(i=0;i<size;i++;)
{
cin>>arr[i];
}
}
void new_delete::display(void)
{ 
cout<<"the elements are:";
for(i=0;i<size;i++;)
{
cout<<arr[i];
cout<<"\t";
}
}
void new_delete::delete_operator(void)
{
delete arr;
cout<<"deallocation of memory is successful";
}
int main
{
new_delete n;
n.new_operator();
n.read();
n.display();
n.delete_operator();
return 0;
}

