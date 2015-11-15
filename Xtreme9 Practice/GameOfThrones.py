__author__ = 'Rajind'

string = raw_input()
found = True
# Write the code to find the required palindrome and then assign the variable 'found' a value of True or False

odd_count = 0;
for i in range(0 , len(string)):
    char = string[i]
    #print char
    #print char.isalpha()
    if char.isalpha():
        count = string.count(char)
        #print count
        string = string.replace(char, '1')
        if count%2 != 0:
            odd_count += 1

    #print string

    if odd_count > 1:
        found = False
        break

if not found:
    print("NO")
else:
    print("YES")