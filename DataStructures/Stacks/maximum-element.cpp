// https://www.hackerrank.com/challenges/maximum-element

#include <vector>
#include <set>
#include <cstdio>
using namespace std;

int main(){
	vector<int> v;
	multiset<int> se;
	int n, i;

	scanf("%d", &n);
	for ( ; n-- ; ) {
		scanf("%d", &i);
		if (i == 1) {
			scanf("%d\n", &i);
			se.insert(i);
			v.push_back(i);
		} else if (i == 2) {
			i = *v.rbegin();
			se.erase(se.find(i));
			v.pop_back();
		} else {
			printf("%d\n", *se.rbegin());
		}
	}
}
