import java.util.List;

public class Main {
    public static void main(String[] args){
//        Leet426 leet426 = new Leet426();
//        Node root = new Node(6);
//        Node t1 = new Node(3);
//        Node t2 = new Node(1);
//        Node t3 = new Node(4);
//        Node t4 = new Node(8);
//        Node t5 = new Node(7);
//
//        root.left = t1;
//        root.right = t4;
//        t1.left = t2;
//        t1.right = t3;
//
//        t4.left = t5;
//
//        Node head = leet426.treeToDoublyList(root);

//        Leet523 leet523 = new Leet523();
//        int[] nums = new int[]{0, 0};
//        boolean foundSum = leet523.checkSubarraySum(nums, 0);

//        Leet301 leet301 = new Leet301();
//        String parens = "(a)())()";

//        List<String> res = leet301.removeInvalidParentheses(parens);

        Leet1004 leet1004 = new Leet1004();
        int[] A = new int[]{1, 1, 0, 0, 1, 1, 0, 1, 1, 1};

        int[] B = new int[]{1, 1, 0, 0, 1, 1, 0, 1};

        int[] C = new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1};

        int numOnes = leet1004.longestOnes(C, 2);

        int numOnesB = leet1004.longestOnes(B, 2);
    }
}
