class Solution {
    public String solution(String[] seoul) {
        String tmp = "Kim";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")) 
                tmp = "김서방은 "+i+"에 있다";
        }
        return tmp;
    }
}