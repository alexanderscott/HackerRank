// https://www.hackerrank.com/challenges/arrays-introduction
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


void printArr(int arr[], int count) {
    for(int i = 0; i < count; ++i)
        cout << arr[i] << ' ';

    cout << '\n';
}

void reverseArr(int arr[], int count) {
   int temp;
   for (int i = 0; i < count/2; ++i) {
      temp = arr[i];
      arr[i] = arr[count-i-1];
      arr[count-i-1] = temp;
   }
}

int main() {
    int n;
    cin >> n;
        
    int arr[n];

    for(int i = 0; i < n; ++i) {
        int tmp;
        cin >> tmp;
        arr[i] = tmp;
    }
    
    reverseArr(arr, n);
    
    printArr(arr, n);
        
    return 0;
}
