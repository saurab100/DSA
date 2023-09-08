nlist = input("Enter the number: ")

num = 0
while val > 9:
    val = 0
    for n in nlist:
        val = val + int(n)*int(n)
    # for i in str(val):
    #     num += int(i)*int(i)
print("Reduce number by sum is: ", num)