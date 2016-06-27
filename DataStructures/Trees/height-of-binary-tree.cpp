// https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree


/*The tree node has data, left child and right child
struct node
{
    int data;
    node* left;
    node* right;
};

*/

int height(node *root) {
    if (root == nullptr) return -1;

    return max(
        height(root -> left)  + 1,
        height(root -> right) + 1
    );

}


