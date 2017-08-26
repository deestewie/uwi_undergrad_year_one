def isUpper(char):
    return ord(char) >= 65 and ord(char) <=90

def isLower(char):
    return ord(char) >= 97 and ord(char) <= 122


def lowercase(string):
    if len(string) == 0:
        return ''
    elif isUpper(string[0]):       
        return chr(ord(string[0]) + 32) + lowercase(string[1::])
    else:    
        return string[0] + lowercase(string[1::])


def encode(string):
    if len(string) == 0:
        return ''
    else:
        return chr(ord(string[0]) + 5 ) + encode(string[1::])

def decode(string):
    if len(string) == 0:
        return ''
    else:
        print (string[0])
        return chr(ord(string[0]) - 5 ) + decode(string[1::])


