class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int M = attacks[attacks.length - 1][0];
        int con = 0;
        int j = 0;
        int h = health;
        for(int i = 1; i <= M; i++ ){
            if(attacks[j][0] == i){
                h = h - attacks[j][1];
                if(h <= 0){
                    h = -1;
                    break;
                }
                j++;
                con = 0;
            } else {
                if(h + bandage[1] > health){
                    h = health;
                    con++;
                    if(con == bandage[0]){
                        con = 0;
                    }
                }else{
                    h += bandage[1];
                    con++;
                    if(con == bandage[0]){
                        con = 0;
                        h += bandage[2];
                    }
                }
                
            }
        }
        
        int answer = h;
        return answer;
    }
}