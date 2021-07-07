class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x >= 2 ** 31 - 1 or x <= -2 ** 31: #범위를넘으면
            return False #false리턴
        else:
            strg = str(x)
        if x >= 0:
            revst = strg[::-1]
        else: #음수면
            temp = strg[1:] #마이너스부호제외하고 숫자만 다룬다
            revst = temp[::-1] #숫자를 뒤집는다

        if int(revst) >= 2 ** 31 - 1 or int(revst) <= -2 ** 31:
            return False
        if revst == strg:
            return True
        else:
            return False