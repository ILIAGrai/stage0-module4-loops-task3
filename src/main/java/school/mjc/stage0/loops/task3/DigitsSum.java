package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        double sum = 0;
        for(int n = t; n != 0; n /= 10)
        {
           sum += (n % 10);
        }
        if(sum<0) {
            Math.abs(sum);
            int aaa = (int) sum;
        }
        System.out.println( (int)Math.abs(sum));
}

    }

