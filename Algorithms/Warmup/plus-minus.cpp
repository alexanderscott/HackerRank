// https://www.hackerrank.com/challenges/plus-minus

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

struct Results {
    float positive;
    float negative;
    float zero;
};

Results calcResults(vector<int> intArr) {
    int size = intArr.size();
    
    int i = 0, p = 0, n = 0, z = 0;
    
    for (i = 0; i < size; i++) {
        if (intArr[i] > 0) { p++; }
        else if (intArr[i] == 0) { z++; }
        else n++;
    }

    Results r;
    r.positive = (float) p / size;
    r.negative = (float) n / size;
    r.zero = (float) z / size;
    return r;
}

int main() {
    int len;
    cin >> len;
    
    int i;
    vector<int> intArr (0);
    
    for (i = 0; i < len; i++) {
        int k;
        cin >> k;
        intArr.push_back(k);
    }
    
    Results r = calcResults(intArr);
    printf("%.3f\n", r.positive);
    printf("%.3f\n", r.negative);
    printf("%.3f\n", r.zero);

    return 0;
}

