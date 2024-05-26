package com.linkedlist;

public class delete_middle_node {

    // In order to delete  the middle node, we need to reach node just prior to middle node

        //Approach 1 : Calculate n/2 for reaching 1 node prior to middle node and change the links at the node

        //Approach 2 : will use the same slow and faster pointer approach but with little modification , like
        //we will skip one step for slow as we need to reach 1 node prior to middle node,  rest all will be same .

        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public Node deleteMiddle(Node head) {
            Node slow=head;
            Node fast=head;

            fast=fast.next.next;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            slow.next=slow.next.next;
            return head;

        }


        public static void main(String[] args) {

        }
    }
