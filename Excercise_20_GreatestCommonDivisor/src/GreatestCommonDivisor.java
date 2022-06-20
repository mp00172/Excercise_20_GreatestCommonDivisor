public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int smallerNumber = 0;
        if (first < second || first == second) {
            smallerNumber = first;
        } else {
            smallerNumber = second;
        }

        int greatestCommonDivisor = 0;
        int currentDivisor = 0;

        while (currentDivisor != smallerNumber) {
            currentDivisor++;
            if (first % currentDivisor == 0 && second % currentDivisor == 0) {
                greatestCommonDivisor = currentDivisor;
            }
        }
        return greatestCommonDivisor;


    }
}
