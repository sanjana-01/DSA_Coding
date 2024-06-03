package com.linkedlist;
import java.util.HashSet;
public class intersection_ll {

        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        //Approach 1: Will use hashmap to find the intersection
        //utility function to check presence of intersection
        private static Node intersectionPresent(Node head1,Node head2) {
            HashSet<Node> st=new HashSet<>();
            while(head1 != null) {
                st.add(head1);
                head1 = head1.next;
            }
            while(head2 != null) {
                if(st.contains(head2)) return head2;
                head2 = head2.next;
            }
            return null;

        }

//    Solution 2: Difference in length
//
//    Approach:
//
//    We will reduce the search length. This can be done by searching the length of the shorter linked list. How? Let’s see the process.
//
//    Find the length of both lists.
//    Find the positive difference between these lengths.
//    Move the dummy pointer of the larger list by the difference achieved. This makes our search length reduced to a smaller list length.
//    Move both pointers, each pointing two lists, ahead simultaneously if both do not collide.

        static int getDifference(Node head1,Node head2) {
            int len1 = 0,len2 = 0;
            while(head1 != null || head2 != null) {
                if(head1 != null) {
                    ++len1; head1 = head1.next;
                }
                if(head2 != null) {
                    ++len2; head2 = head2.next;
                }

            }
            return len1-len2;//if difference is neg-> length of list2 > length of list1 else vice-versa
        }

        static Node intersectionPresentv1(Node head1,Node head2) {
            int diff = getDifference(head1,head2);
            if(diff < 0)
                while(diff++ != 0) head2 = head2.next;
            else while(diff-- != 0) head1 = head1.next;
            while(head1 != null) {
                if(head1 == head2) return head1;
                head2 = head2.next;
                head1 = head1.next;
            }
            return head1;

        }

   /* Solution 3: Optimised

    Approach:

    The difference of length method requires various steps to work on it. Using the same concept of difference of length, a different approach can be implemented. The process is as follows:-

    Take two dummy nodes for each list. Point each to the head of the lists.
    Iterate over them. If anyone becomes null, point them to the head of the opposite lists and continue iterating until they collide.*/


        static Node intersectionPresentv3(Node head1,Node head2) {
            Node t1 = head1;
            Node t2 = head2;

            while(t1 != t2) {
                t1=t1.next;
                t2=t2.next;

                if(t1==t2) return t1;

                if(t1==null) t1=head2;
                if(t2==null) t2=head1;
            }

            return t1;
        }


        public static void main(String[] args) {

        }
    }
