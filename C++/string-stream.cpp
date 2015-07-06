// https://www.hackerrank.com/challenges/c-tutorial-stringstream

#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

// returns count of non-overlapping occurrences of 'sub' in 'str'
int countSubstring(const std::string& str, const std::string& sub)
{
    if (sub.length() == 0) return 0;
    int count = 0;
    for (size_t offset = str.find(sub); offset != std::string::npos;
     offset = str.find(sub, offset + sub.length()))
    {
        ++count;
    }
    return count;
}

vector<int> parseInts(string str) {
    stringstream ss(str);
    int count = countSubstring(str, ",");
    vector<int> intArr (0);
    for (int i = 0; i < count + 1; i ++) {
        int j;
        char ch;
        ss >> j >> ch;
        intArr.insert(intArr.end(), j);
    }
    return intArr;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
