#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
   int i,j,n,q,k,t,size=0,p,s;
   vector<long> arr;
   cin>>n>>q;
   int sp[n];
   for(i=0;i<n;i++){
       sp[i]=size;
       cin>>k;
       for(j=0;j<k;j++){
           cin>>t;
           arr.push_back(t);
       }
       size+=k;
   }
   for(i=0;i<q;i++){
       cin>>p>>s;
       cout<<arr[sp[p]+s]<<endl;
   }

    return 0;
}
