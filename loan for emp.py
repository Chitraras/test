
while 1>0:
    print("Check loan eligibility for an employee")
    empname = []
    mtsat = []
    jbty = []
    exp = []
    ln=[]
    print("\t\t")
    print("_________INPUT__________")

    name=str(input("Enter the Employee name: "))
    empname=name
    
    sat=str(input("married  or unmarried: "))
    mtsat=sat

    ty=str(input("employee type permanent or temporary employee: "))
    jbty=ty

    ex=int(input("Year of experience: "))
    exp=ex

    if jbty == "temporary":
        ln=100000
        
    elif mtsat=="married":
        if exp>= 30:
            ln=600000
        elif exp<30:
            ln=350000
    elif mtsat=="unmarried":
        if exp>= 30:
            ln=500000
            
        elif exp<30:
            ln=250000
    print("\t\t")
    print("_________OUTPUT__________")
    print("Employee name: ",empname)
    print("Matirual status: ",mtsat)
    print("Employee job type: ",jbty)
    print("Experience: ",exp,"Years")
    print("Loan eligibility: ",ln)
    print("_________END__________")
    print("\t\t")

