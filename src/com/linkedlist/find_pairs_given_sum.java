package com.linkedlist;
import java.util.ArrayList;

public class find_pairs_given_sum {

        static class Node {
            int data;
            Node next;
            Node back;
            Node(int data) {
                this.data = data;
                this.next = null;
                this.back = null;
            }
            Node(int data, Node next , Node back) {
                this.data = data;
                this.next = next;
                this.back = back;
            }
        }


        //Approach 1 : Take the pointer 1 and pointer 2 ,iterate over DLL pointer 2 and find the pair sum

        //Approach 2: Take1 pointer at start and make 1 pointer at end , now compare both pointers , if sum is less than
        //target then increase left pointer else right pointer , if sum is  matched then add to your list , and move both pointers

        private static Node findTail(Node head ){
            Node tail=head;
            while(tail.next!=null){
                tail=tail.next;
            }
            return tail;
        }

        public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {

            ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
            if(head==null) return ans;
            Node left=head;
            Node right=findTail(head);
            while(left.data < right.data){
                if(left.data + right.data ==target){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(left.data);
                    pair.add(right.data);
                    ans.add(pair);
                    left=left.next;
                    right=right.back;
                }
                else if(left.data + right.data < target){
                    left=left.next;
                }
                else{
                    right=right.back;
                }
            }
            return ans;
        }


        public static void main(String[] args) {

        }
    }
