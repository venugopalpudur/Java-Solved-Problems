head = int(input("Enter Heads:"))
legs = int(input("Enter Legs:"))
rab=0
chick=0
for i in range(1,legs+1):
    #print("run")
    if rab+chick==head:
        break
    rem = legs-i
    rab = rem/4
    chick = i/2
if(rab%2==0 and chick%2==0):
    print(rab)
    print(chick)
else:
    print("invalid inputs")