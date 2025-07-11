n=int(input("Enter the range:"))
result=0
for i in range(1,n+1):
  result+=i**(i+1)
print("result=",result)
