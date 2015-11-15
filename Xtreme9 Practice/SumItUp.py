__author__ = 'Rajind'

from sys import stdin

arr = []

n = int(stdin.readline())
line = stdin.readline()

arr = map(int, line.split())
q = int(stdin.readline())

arrsum =  sum(arr)
result =  (2**q)*arrsum % (10**9+7)
print result