package ex_004_Strings;

import java.util.Arrays;

public class Lab_0049_Max_Number_Array {
    public static void main(String args[]) {
        int[] array = {11, 34, 66, 99, 19, 34, 76, 88, 91, 37};

        int max_output = gave_me_max(array);
        System.out.println("Maximum number is: " + max_output);

        int min_output = gave_me_min(array);
        System.out.println("Minimum number is: " + min_output);
    }

    // Function to return maximum element in array
    static int gave_me_max(int[] array) {
        int max = array[0]; // assume first element is max
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Function to return minimum element in array
    static int gave_me_min(int[] array) {
        int min = array[0]; // assume first element is min
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}