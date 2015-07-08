// https://www.hackerrank.com/challenges/tree-postorder-traversal

/* you only have to complete the function given below.  
Node is defined as  

struct node
{
    int data;
    node* left;
    node* right;
};

*/


void Postorder(node *root) {
    if (root == NULL) return;

    Postorder(root -> left);
    Postorder(root -> right);

    cout << root -> data << " ";
}

