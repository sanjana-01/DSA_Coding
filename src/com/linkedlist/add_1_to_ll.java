package com.linkedlist;

public class add_1_to_ll {

        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        //Approach 1: First reverse and then do carry over things and then reverse , if at last carry is left , add it after reversing
        private static Node reverse(Node head) {
            Node temp=head;
            Node prev=null;
            while(temp!=null){
                Node front=temp.next;
                temp.next=prev;
                prev=temp;
                temp=front;
            }
            return prev;
        }

        public static Node addOne(Node head)
        {
            head=reverse(head);
            Node temp=head;
            int carry=1;
            while(temp !=null){
                temp.data =temp.data +carry;
                if(temp.data <10){
                    carry=0;
                    break;
                }
                else{
                    temp.data=0;
                    carry=1;
                }
                temp=temp.next;
            }

            if (carry == 1) {
                Node newNode =new Node(1);
                head=reverse(head);
                newNode.next=head;
                return newNode;
            }

            head=reverse(head);
            return head;
        }
        public static void main(String[] args) {

        }

    }
