// https://www.hackerrank.com/challenges/compare-two-linked-lists 

/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int CompareLists(Node *headA, Node* headB)
{
    if (headA == NULL && headB == NULL) return 1;
    if (headA == NULL || headB == NULL) return 0;

    int equal = 1;

    Node *lastA = headA;
    Node *lastB = headB;
    while (lastA -> next != NULL) {
        if (lastB -> next == NULL) {
            equal = 0;
            break;
        }
        if (lastA -> data != lastB -> data) {
            equal = 0;
            break;
        }
        lastB = lastB -> next;
        lastA = lastA -> next;
    }
    if (lastA -> data != lastB -> data || lastB -> next != NULL) {
        equal = 0;
    }
    return equal;
}
