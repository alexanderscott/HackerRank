#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,q,i,k,x,j;
    vector<int> v;
    std::vector<int>::iterator low;
    
    cin>>n;
    for(i=0;i<n;i++){
        cin>>k;
        v.push_back(k);
    }
    cin>>q;
    for(i=0;i<q;i++){
        cin>>x;
       vector<int>::iterator low = lower_bound(v.begin(), v.end(), x);
       
       if (v[low - v.begin()] == x)
           cout << "Yes " << (low - v.begin()+1) << endl;
       else
           cout << "No " << (low - v.begin()+1) << endl;
       

    }



    return 0;
}
