// https://www.hackerrank.com/challenges/c-tutorial-strings

#include <iostream>
#include <string>
using namespace std;

int main() {
    string a;
    string b;
    
    cin >> a;
    cin >> b;

    cout << a.size() << " " << b.size() << endl;
    cout << a + b << endl;
    cout << b.substr(0, 1) << a.substr(1, a.size()) << " " << a.substr(0, 1) << b.substr(1, b.size()) << endl;

    return 0;
}

