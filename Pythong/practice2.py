#question

# name = input("enter your name : ")
# print("good afternoon \n" + name)

#question
letter = '''dear <|Name|>
you are selected

Date = <|DATE|>'''

name = str(input("enter the name"))
date = str(input("enter full date "))
letter = letter.replace("<|Name|>",name)
letter = letter.replace("<|DATE|>",date)

print(letter)