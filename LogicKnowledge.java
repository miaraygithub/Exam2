public class LogicKnowledge { //question 3 and 4 class
    public static int greenTicket(int a, int b, int c) { //question 3 method
        if ((a != b) && (b != c) && (c != a)) { //if none of them are equal to any others (all different)
            return 0;
        } else if ((a == b) && (b == c)) { //if a = b = c
            return 20;
        } else { //the only case left is if two match and the third doesnt
            return 10;
        }
    }

    public static int makeChocolate(int small, int large, int goal) { //Question 4 method
        //we break up the goal into how many whole multiples of 5 (largeNeed) are contained, and the remainder (smallNeed)
        int largeNeed = (goal / 5);
        int smallNeed = (goal % 5);
        //if we don't have enough large chocolate bars
        if (largeNeed > large) {
            if (small >= ((largeNeed - large) * 5) + smallNeed) { //the case where we have enough small bars to add 5n smalls (instead of the missing n larges) AND the ideal number of smalls
                return ((largeNeed - large) * 5) + smallNeed; //return that number (including making up for missing big bars)
            } else { //if we don't have enough small bars to cover the deficit we're fucked
                return -1;
            }
        } else { //we have enough big bars yay
            if (smallNeed > small) { //but in this case we don't have enough small bars oh noo
                return -1;
            } else { //but otherwise we have enough to just return the remainder
                return smallNeed;
            }
        }
    }

    public static void main(String[] args) {

    }
}
