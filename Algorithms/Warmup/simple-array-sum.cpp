// https://www.hackerrank.com/challenges/simple-array-sum

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    cout << std::accumulate(arr.begin(), arr.end(), 0);
    return 0;
}
