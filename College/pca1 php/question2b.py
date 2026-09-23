# 10 fibonacci numbers 
a = 0 
b = 1
print(a)
print(b)
for i in range ( 8 ): 
    c = a + b 
    a = b 
    b = c 
    print(c)

