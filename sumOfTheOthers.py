import sys
lines = sys.stdin.readlines()
for line in lines:
    if line.strip() == '':
        continue
    ints = [int(x) for x in line.split(' ')]

    answer = 0

    # do your work here, store result in variable 'answer'
    # 'ints' is a list of integers

    print(answer)
