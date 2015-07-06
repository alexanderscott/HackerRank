// https://www.hackerrank.com/challenges/reverse-a-linked-list

/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Reverse(Node *head)
{
    Node *prev   = NULL;
    Node *current = head;
    Node *next;
    while (current != NULL) {
        next = current -> next;  
        current -> next = prev;   
        prev = current;
        current = next;
    }
    head = prev;
    return head;
}

