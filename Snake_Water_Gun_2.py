import random

computerChose = random.choice(['w','s','g'])
yourChoice = input("Enter Your Choice : ")

dict1 = {'w':"Water", 's':"Snake", 'g':"Gun"}
dict2 = {'w':1, 's': 0, 'g':-1}

print(f" Computer Chose : {dict1[computerChose]} \n You Chose : {dict1[yourChoice]}")

point = dict2[computerChose] - dict2[yourChoice]
if (point == 0) :
    print("Draw!")
else :
    if (point == -2 or point == 1) :
        print("You Win!")
    elif (point == -1 or point == 2) :
        print("You Lose!")
    else :
        print("Something Wrong!")