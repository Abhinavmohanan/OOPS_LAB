package pack;

public class factorial{
        public int fact(int num){
            int factofnum=1,i;
            for(i=2;i<=num;i++){
                factofnum *= i;
            }       
            return factofnum;
        }
    }