num=int(input("Enter 3 digit num: "))
ognum=num;
res=0;
while(ognum!=0):
 rem=ognum%10;
 res+=(rem*rem*rem);
 ognum//=10;
if(res==num):
   print("Armstrong",num);
else:
   print("Not an Armstrong",num);
