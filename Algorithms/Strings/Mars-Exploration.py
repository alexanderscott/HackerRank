s=input()
st='SOS'
c=0
while len(st)<len(s):
    st=st+'SOS'
for i in range(len(s)):
    if s[i]!=st[i]:
        c+=1
print(c)
