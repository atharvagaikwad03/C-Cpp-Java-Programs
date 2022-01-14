#include <iostream>
using namespace std;

class Base
{
    public:
    int x,y;
    Base()
    {
        cout<<"Base construtor\n";
    }
    ~Base()
    {
        cout<<"Base destructor\n";
    }
    
};
class Derived : public Base
{
public:
    int i,j;
    Derived()
    {
        cout<<"Derived construtor\n";
    }
    ~Derived()
    {
        cout<<"Derived destrutor\n";
    }
};

int main()
{
    Derived dobj;
    return 0;
}
