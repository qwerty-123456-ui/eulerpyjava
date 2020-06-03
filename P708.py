import numpy as np
from functools import reduce
def factors(n):
    return set(reduce(list.__add__,
        ([i, n//i] for i in range(1, int(n**0.5) + 1) if n % i == 0)))
def f(nu):
    l=list(factors(nu))
    # print(l)
    k=0
    i=0
    while i<len(l) :
        c=0
        for j in range(2,l[i]//2+1):
            if l[i]%j==0:
                # print(j)
                c=1
                break
        # print(c)
        if c==1:
            l.remove(l[i])
            i-=1
        else:
            l[i]=2
            i+=1
    p=1
    for i in l:
        p*=i
    return (p)
# print(f(90))
# print(type(f(9)))
s=0
for i in range(1,int(100_000_000)):
    s+=f(i)
print(s)
# print(np.sum(s))
