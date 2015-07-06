// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list

/*
  Delete Node at a given position in a linked list 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Delete(Node *head, int position)
{
    Node *currentNode, *nextNode;
    int p = 0;
    currentNode = head;
    nextNode = currentNode -> next;


    if (position == 0) {
        head -> data = nextNode -> data;
        head -> next = nextNode -> next;
    }

    while (nextNode != NULL) {
        if (p == (position - 1)) {
            currentNode -> next = nextNode -> next;
            delete nextNode;
            nextNode = currentNode -> next;
        } else {
            currentNode = nextNode;
            nextNode = nextNode -> next;
        }
        p = p + 1;
    }

    return head;
    
}
