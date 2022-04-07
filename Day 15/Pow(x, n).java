import java.util.*;
class Solution {
    public double power(double x, long n)
    {
        if(n == 0)
            return 1;
        
        if(n<0)
            return power(1/x, -n);
        double a = power(x*x, n/2);
        if(n%2==0)
            return a;

        return x*a;
        
    }
    public double myPow(double x, int n) {
        
        return power(x, n);
    }
}