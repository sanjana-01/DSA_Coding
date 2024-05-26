package com.linkedlist;

public class length_of_loop {

    public class FindTheLength_of_Loop_in_LL {

        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        //Approach 1 : Using timer and hashmap , will store every node with its timer , and if any stage again same node is found , we will
        //subtract that node timer from the earlier found one , that diff will be the length.

        //Approach 2 : using slow and fast pointer

        private static int findLength(Node slow, Node fast) {
            int count=1;
            fast=fast.next;
            while(slow!=fast){
                count++;
                fast=fast.next;
            }
            return count;
        }
        private static  int lengthOfLoop(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return findLength(slow,fast);
                }
            }
            return 0;
        }


        public static void main(String[] args) {


        }
    }
}
