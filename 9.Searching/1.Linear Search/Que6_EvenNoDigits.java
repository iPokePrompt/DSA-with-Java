// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

class  Que6_EvenNoDigits{
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};
        System.out.println(findNumberOfDigits(nums));
    }

    static int findNumberOfDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether the number contains even or odd digits
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {
        if(num<0) num = num * -1; // to handle negative numbers
        if(num==0) return 1; // edge case
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
