package com.linkedlist;

public class delete_occurence_dll {

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

        static Node deleteAllOccurOfX(Node head, int x) {
            Node temp=head;
            while(temp!=null){
                if(temp.data == x){
                    //edge case for head
                    if(temp==head){
                        head=head.next;
                    }
                    Node nextNode=temp.next;
                    Node prevNode=temp.back;

                    if(nextNode !=null){
                        nextNode.back=prevNode;
                    }
                    if(prevNode !=null){
                        prevNode.next=nextNode;
                    }
                    temp=temp.next;
                }
                else{
                    temp=temp.next;
                }
            }
            return head;
        }


        public static void main(String[] args) {

        }
    }

