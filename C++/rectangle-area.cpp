// https://www.hackerrank.com/challenges/rectangle-area

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>

using namespace std;

class Rectangle {
protected:
    int width;
    int height;

public:

    int size() { 
        return width * height; 
    }

    void display() {
        cout << width << " " << height << endl;
    }
    
};

class RectangleArea : public Rectangle {
public:

    void read_input() {
        cin >> width;
        cin >> height;
    }

    void display() {
        cout << width * height << endl; 
    }
};
