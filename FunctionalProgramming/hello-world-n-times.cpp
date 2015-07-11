// https://www.hackerrank.com/challenges/fp-hello-world-n-times

#include <cstdio>
#include <iostream>
using namespace std;

int main() {
    int c;
    cin >> c; 

    for (int i = 0; i < c; i++) {
        cout << "Hello World" << endl;
    }

    return 0;
}

