#include <iostream>

using namespace std;

class Shape
{

public:

    void setWith(int w)
    {
        width = w;
    }
    void setHeight(int h)
    {
        height = h;
    }

protected:
    int width;
    int height;

};

class Rectangle : public Shape
{
public:
    int getArea()
    {
        return width * height;
    }

};



int main()
{
    Rectangle r;
    r.setWith(10);
    r.setHeight(15);
    
    cout << r.getArea() << endl;

    return 0;
}
