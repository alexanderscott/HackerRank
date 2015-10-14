// https://www.hackerrank.com/challenges/rectangle-area

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
using namespace std;

class Rectangle {
private:
    int width;
    int height;

public:
    /*
    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    */

    int size() { 
        return width * height; 
    }

    void Display() {
        cout << width << " " << height << endl;
    }
    
};

class RectangleArea : public Rectangle {
private:
    int width;
    int height;

public:
    //RectangleArea(int w, int h);

    void Input() {
        cin >> width;
        cin >> height;
    }

    void Display() {
        cout << width * height << endl; 
    }
};
