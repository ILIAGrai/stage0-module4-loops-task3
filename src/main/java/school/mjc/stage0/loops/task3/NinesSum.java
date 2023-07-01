package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        if (lengthOfLastNumber < 0) {
            System.out.println(0);
        } else {
            for (int i = 0, f = 9; i <= lengthOfLastNumber; i++) {
                if (i == lengthOfLastNumber) {
                    System.out.println(sum);
                }

                sum += f;
                f = f * 10 + 9;

            }
        }
    }
}