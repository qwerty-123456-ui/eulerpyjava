# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
# a2 + b2 = c2
# For example, 32 + 42 = 9 + 16 = 25 = 52.
# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.
import math
def gen(n):
    for a in range(n):
        for b in range(n):
            c=math.sqrt(a**2+b**2)
            if c==1000-a-b:
                print(f"a is {a}, b is {b}")
                yield a*b*c

print(list(gen(1000)))

#         if a+b+c==1000:
#                 if a**2+b**2==c**2:
#                         p=a*b*c
#
# print(p)
