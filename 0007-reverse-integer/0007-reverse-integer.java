class Solution {
    public int reverse(int x) {
    if(x<Math.pow(2,31)-1 && x>Math.pow(-2,31)){
        int x2 = x;
        int b = 0;
        int x3;
        if(x>0){
            x3 = x;
        }else{
           x3 = -1*x;
        }
        int count = 0;
        while(x3>0){
            x3 /= 10;
            count++;
        }
       if(x!=0){
           for(int i=0;i<count;i++){
               int a = x2%10;
               x2 /= 10;
               b += a*Math.pow(10,count-i-1);
           }
       }
       if(b<Math.pow(2,31)-1 && b>Math.pow(-2,31)){
            return b;
       }else{
           return 0;
       }
    }
    else{
        return 0;
        }
    }
}