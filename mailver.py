id=""
a=str(input("Enter your mail ID: "))
id=a
if a[0]=="." :
  print("Email id should not start with '.'")
elif  a[0]=="@" :
  print("Email id should not start with '@'")
  ## condition one completed
  
mc=0
for i in a:
    mc=mc+1

cmc=mc-1
if a[cmc]!="m":
    print("Email id should end with either 'm'or 'n'")
    ##condition two compeleted
c=0
ce=0
while c<mc:
    if ce==2:
        print("Email id should have '@' only once")
        break
    elif a[c]!="@":
        c+=1
   
    elif a[c]=="@":
        c+=1
        ce+=1
    ## condition c is compeleted
        

    
if mc<10:
    print("Length should be minimum 10 and maximum 30")
if mc>30:
    print("Length should be minimum 10 and maximum 30")
    ## condition six completed
    print(a[mc])


