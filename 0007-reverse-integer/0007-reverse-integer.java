class Solution {
    public int reverse(int x) {
        int x2 = x,b = 0,x3;
        if(x>0) x3 = x;
        else x3 = -1*x;
        String z = Integer.toString(x3);
        int count = z.length();
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
}