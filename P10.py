def primes(m,n):
    l=[]
    for i in range(m,n):
        c=0
        for j in range(2,n//2):
            if i!=j and i%j==0:
                c=1
                break
        if c==0:
            yield i
