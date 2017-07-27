// https://www.hackerrank.com/challenges/arrays-introduction
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


 


int main() {
    int n;
    cin >> n;
        
    int arr[n];

    for(int i = 0; i < n; ++i) {
        int tmp;
        cin >> tmp;
        arr[i] = tmp;
    }
    
    for(int i=n-1;i>=0;i--)
      {
cout<<arr[i]<<" ";
}
cout<<endl;
        
    return 0;
}
