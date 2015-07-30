// https://www.hackerrank.com/challenges/a-very-big-sum

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int len;
    cin >> len;
    
    long long sum = 0;

    int i;
    for (i = 0; i < len; i++) {
        long long ll;
        cin >> ll;
        sum += ll;
    }

    cout << sum;
    
    return 0;
}
