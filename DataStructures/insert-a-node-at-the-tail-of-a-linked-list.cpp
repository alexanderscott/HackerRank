//https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/submissions/code/12326697

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Insert(Node *head,int data)
{
    Node *node = new Node;
    node -> data = data;

    if (head == NULL) {
        return node;
    }
    else {
        Node *last = head;
        while (last -> next != NULL) {
            last = last -> next;
        }
        last -> next = node;
        return head; 
    }

}
