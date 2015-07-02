// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list

/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
void Print(Node *head)
{
    Node *current = head;

    while (current != NULL) {
        cout << current -> data << endl;
        current = current -> next;
    }
}
