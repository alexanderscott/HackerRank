// https://www.hackerrank.com/challenges/vector-sort

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> v(n);

    int i;
    while (cin >> i)
        v.push_back(i);

    sort(v.begin(), v.end());

    string str(v.begin(), v.end());
    cout << str;

    return 0;
}
