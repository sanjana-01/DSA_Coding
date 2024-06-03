package com.linkedlist;

public class remove_duplicates {

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

        private static Node removeDuplicates(Node head){

            Node temp=head;

            while(temp != null && temp.next != null){
                Node  nextNode=temp.next;
                while(nextNode != null && nextNode.data == temp.data){
                    nextNode = nextNode.next;
                }
                temp.next=nextNode;
                if(nextNode != null){
                    nextNode.back = temp;
                }

                temp=temp.next;

            }
            return  head;
        }


        public static void main(String[] args) {

        }
    }
