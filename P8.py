# # The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
# Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
n=input("Enter the number ")
# print(n)
n = ''.join(n.split())#important trick
print(n)
m=0
i=0
while i<(len(n)-13):
    s=1
    for j in n[i:i+13]:
        s*=int(j)
    if s>m:
        m=s
    i+=1
print(m)
