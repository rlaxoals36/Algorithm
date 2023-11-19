#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    while(true){
        if(n==1) break;
        if(n%2==0) answer += n;
        n--;
    }
    return answer;
}