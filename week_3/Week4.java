public class Week4 {

    /**
     * tim max 2 so.
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * tim min cua array.
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    /**
     * tinh BMI.
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = (double) Math.round(bmi * 10) / 10;
        if (bmi < 18.5) return "Thiếu cân";
        else if (bmi >= 18.5 && bmi < 23) return "Bình thường";
        else if (bmi >= 23 && bmi < 25) return "Thừa cân";
        else return "Béo phì";
    }
}
