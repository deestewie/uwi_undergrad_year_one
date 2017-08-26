def mystery():
    cell_no = int(input("Enter the last digit of your cell phone number: "))
    birth_year = int(input("Enter the birth year: "))

    qa = (cell_no * 2) + 5
    qa = (qa * 50) + 1766
    qb = qa - birth_year

    return qb

def fuzzbiz(num):
    if num % 3 == 0 and num % 5 == 0:
        return "FuzzBiz"
    elif num % 3 == 0:
        return "Fuzz"
    elif num % 5 == 0:
        return "Biz"
    else:
        return "No Fuzz No Biz"

def leap_year(year):
    if year % 4 == 0 and year % 100 != 0:
        return True
    elif year % 400 ==0 :
        return True
    else: return False
    
