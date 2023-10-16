import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] grades = {84, 29, 55, 38, 45};

        // Test case for insufficient grades
        int[] insufficientGrades = getInsufficientGrades(grades);
        System.out.println("Insufficient Grades: " + arrayToString(insufficientGrades));

        // Test case for average grade
        double averageGrade = getAverageGrade(grades);
        System.out.println("Average Grade: " + averageGrade);

        // Test case for rounded grades
        int[] roundedGrades = getRoundedGrades(grades);
        System.out.printf("Rounded Grades: %s%n", arrayToString(roundedGrades));

        // Test case for maximum rounded grade
        int maxRoundedGrade = getMaximumRoundedGrade(grades);
        System.out.println("Max Rounded Grade: " + maxRoundedGrade);
    }

    public static int[] getInsufficientGrades(int[] grades) {
        List<Integer> insufficientGrades = new ArrayList<>();

        for (int grade : grades) {
            if (grade < 40) {
                insufficientGrades.add(grade);
            }
        }

        int[] result = new int[insufficientGrades.size()];
        for (int i = 0; i < insufficientGrades.size(); i++) {
            result[i] = insufficientGrades.get(i);
        }

        return result;
    }

    public static double getAverageGrade(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int[] getRoundedGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                int nextMultipleOf5 = (grades[i] + 4) / 5 * 5;
                if (nextMultipleOf5 - grades[i] < 3) {
                    roundedGrades[i] = nextMultipleOf5;
                } else {
                    roundedGrades[i] = grades[i];
                }
            } else {
                roundedGrades[i] = grades[i];
            }
        }
        return roundedGrades;
    }

    public static int getMaximumRoundedGrade(int[] grades) {
        int[] roundedGrades = getRoundedGrades(grades);
        int maxRoundedGrade = 0;
        for (int grade : roundedGrades) {
            if (grade > maxRoundedGrade) {
                maxRoundedGrade = grade;
            }
        }
        return maxRoundedGrade;
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}