// https://www.hackerrank.com/challenges/staircase

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void printCount(int count, string str) {
    int i;
    for (i = 0; i < count; i++) {
        cout << str;
    }
}


int main() {
    int len;
    cin >> len;

    int c = len - 1;
    int i;
    for (i = 0; i < len; i++) {
        printCount(c, " ");
        printCount(len - c, "#");
        cout << endl;
        c--;
    }
    
    return 0;
}
