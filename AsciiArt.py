import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

l = int(raw_input())
h = int(raw_input())
t = raw_input()
    
alphabet = [str(raw_input()) for i in range(h)]    

for i in range(h):
    for ch in t:
        if ch >= 'a' and ch <= 'z':
            x = ord(ch) - ord('a')
        elif ch >= 'A' and ch <= 'Z':
            x = ord(ch) - ord('A')
        else:
            x = ord('z') - ord('a') + 1
            
        for j in range(l):
            print alphabet[i][x * l + j], end=""
            
# Write an action using print
# To debug: print("Debug messages...", file=sys.stderr)

    print ""

