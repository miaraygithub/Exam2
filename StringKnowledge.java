public class StringKnowledge {
    public static boolean endOther(String a, String b) { //Question 1 method
        a = a.toLowerCase(); //this is a caseless comparison
        b = b.toLowerCase(); //get those capital letter OUTTA HERE
        if (b.contains(a)) { //case 1: a is contained in b
            if (a.length() + b.lastIndexOf(a) == b.length()) { //if the before bit and the length of a add to the length of b, its at the end!
                return true;
            } else return false; //it's not at the very end of b
        } else if (a.contains(b)) { //case 2: b is contained in a
            if (b.length() + a.lastIndexOf(b) == a.length()) { //if the before bit and the length of b add to the length of a, its at the end
                return true;
            } else return false; //not at the end
        } else { //neither contains the other
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
