public class Problem1 {
    public static int[] getInsufficientGrades(int[] grades) {
        int n = grades.length;
        int[] insufficientGrades = new int[n];
        int count = 0;

        for (int grade : grades) {
            if (grade < 40) {
                insufficientGrades[count] = grade;
                count++;
            }
        }

        // Create a new array with the exact size needed
        int[] result = new int[count];
        System.arraycopy(insufficientGrades, 0, result, 0, count);

        return result;
    }

    public static double getAverageGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int[] getRoundedGrades(int[] grades) {
        int n = grades.length;
        int[] roundedGrades = new int[n];

        for (int i = 0; i < n; i++) {
            if (grades[i] < 38) {
                roundedGrades[i] = grades[i];
            } else {
                int nextMultipleOf5 = ((grades[i] + 4) / 5) * 5;
                if (nextMultipleOf5 - grades[i] < 3) {
                    roundedGrades[i] = nextMultipleOf5;
                } else {
                    roundedGrades[i] = grades[i];
                }
            }
        }

        return roundedGrades;
    }

    public static int getMaximumRoundedGrade(int[] grades) {
        int[] roundedGrades = getRoundedGrades(grades);
        int maxRoundedGrade = Integer.MIN_VALUE;

        for (int roundedGrade : roundedGrades) {
            if (roundedGrade > maxRoundedGrade) {
                maxRoundedGrade = roundedGrade;
            }
        }

        return maxRoundedGrade;
    }

    public static void tests(int[] grades) {
        // Test case for insufficient grades
        int[] insufficientGrades = getInsufficientGrades(grades);
        System.out.print("Insufficient Grades: ");
        for (int grade : insufficientGrades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        // Test case for average grade
        double averageGrade = getAverageGrade(grades);
        System.out.println("Average Grade: " + averageGrade);

        // Test case for rounded grades
        int[] roundedGrades = getRoundedGrades(grades);
        System.out.print("Rounded Grades: ");
        for (int grade : roundedGrades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        // Test case for maximum rounded grade
        int maxRoundedGrade = getMaximumRoundedGrade(grades);
        System.out.println("Max Rounded Grade: " + maxRoundedGrade);
    }
}
