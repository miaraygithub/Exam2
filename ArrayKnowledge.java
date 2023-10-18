public class ArrayKnowledge { //Question 5 and 6 class
    public static char[] stringToArray(String in) { //question 5 method
        char[] output = new char[in.length()]; //initializing an array of chars (with the length of the input string)
        int i = 0; //index variable
        while (i < in.length()) { //until we run out of letters
            output[i] = in.charAt(i); //assign the indexed spot of output array with the corresponding string char
            i++; //increase i
        }
        return output; //return our array of chars
    }
    public static int[] generateArrayWithBounds(int start, int end, int step) { //Question 6 method
        //I need to figure out how many spots to save for the array, so i run the while loop (and just don't save the values, just the index value)
        int ntest = start; //test int to increase
        int itest = 0; //keeping track of how many iterations
        while (ntest < end) { //while our int is less than the maximum
            itest++; //add one iteration
            ntest += step; //increase int by step
        }
        int[] output = new int[itest]; //now that we know how long the array needs to be, initalize array with itest size
        int i = 0; //actual index variable
        int n = start; //actual int to increase and log
        while (n < end) { //while int is less than maximum
            output[i] = n; //log int n in the indexed location on output
            i++; //increase index
            n += step; //add step to n
        }
        return output; //returns array of int
    }

    public static void main(String[] args) {

    }
}
