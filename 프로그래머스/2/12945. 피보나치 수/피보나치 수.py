def solution(n): # n
    answer = 0
    numberfn=0
    f_list = []
    
    for i in range(n+1):
        if(i==0):
            f_list.append(0)
        elif(i==1):
            f_list.append(1)
        else:
            f_list.append(f_list[i-2] + f_list[i-1])
            
    answer = f_list[n]%1234567
    return answer