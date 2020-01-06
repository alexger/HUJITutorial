/**
 * Created by Shelly Bekhor on 06-01-20.
 */
public class factorial {
    static int factorial(int n){
        if (n<0){
            return -1;
        }
        else if(n==0){
            return 1;
        }
        else{
            return factorial(n-1);
        }
    }
}
