# Snake, Water, Gun game
import random

computerChose = random.choice(['w', 's', 'g'])
yourChoice = input("Enter Your choice ( w / s / g ) : ")

dict = {'w':"Water", 's':"Snake", 'g':"Gun"}

computer = dict[computerChose]
you = dict[yourChoice]

print(f" Computer Chose : {computer} \n You Chose : {you}")

if (computerChose == yourChoice) :
    print("Draw!")
else :
    if (computerChose == 'w' and yourChoice == 's'):
        print("You Win!")
    elif (computerChose == 'w' and yourChoice == 'g'):
        print("You Lose!")
    elif (computerChose == 'g' and yourChoice == 's'):
        print("You Lose!")
    elif (computerChose == 'g' and yourChoice == 'w'):
        print("You Win!")
    elif (computerChose == 's' and yourChoice == 'w'):
        print("You Lose!")
    elif (computerChose == 's' and yourChoice == 'g'):
        print("You Win!")
    else :
        print("Something went wrong!")