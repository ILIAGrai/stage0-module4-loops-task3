package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.print(second);
        } else {
            if (second == 0) {
                System.out.print(first);
            } else {

                while (first != second) {
                    if (first > second)
                        first = first - second;
                    else
                        second = second - first;
                }
                System.out.println(second);

            }
        }
    }
}

