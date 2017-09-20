package DaysOfCode.Day22;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Solution {
    public static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        int lefth = getHeight(root.left);
        int righth = getHeight(root.right);

        if (lefth > righth) {
            return lefth + 1;
        } else {
            return righth + 1;
        }
    }
}
