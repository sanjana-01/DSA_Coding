package com.linkedlist;

public class rotate_ll {

        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private static Node findNthNode(Node temp, int k) {
            k--;
            while(temp!=null && k > 0){
                k--;
                temp=temp.next;
            }
            return temp;

        }


        public Node rotateRight(Node head, int k) {
            if(head==null ||k ==0) return head;

            int length=1;
            Node tail=head;
            while(tail.next != null){
                length++;
                tail = tail.next;
            }

            if(k % length ==0){
                return head;
            }
            k=k%length;
            tail.next=head;

            Node newLastNode=findNthNode(head,length-k);
            head=newLastNode.next;
            newLastNode.next=null;

            return head;
        }



        public static void main(String[] args) {


        }
    }
}
