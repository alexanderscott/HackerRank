// https://www.hackerrank.com/challenges/tree-level-order-traversal

#include <iostream>
#include <queue>
using namespace std;

/*
struct node
{
    int data;
    node* left;
    node* right;
}*/

void LevelOrder(node * root) {
    queue<node*> q;

    if (root == NULL) return;

    q.push(root);

    while (!q.empty()) {
        node *n = q.front();
        q.pop();

        cout << n -> data << " ";

        if (n -> left) q.push(n -> left);
        if (n -> right) q.push(n -> right);
    }
}

