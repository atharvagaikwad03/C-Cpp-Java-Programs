#include <iostream>
using namespace std;

class Base
{
    public:
    int x,y;
    Base() { cout<<"Base construtor\n";}
    ~Base()
    { cout<< "Base Destructor";}


void fun()
    { cout<<"inside fun\n";  }
};
class Derived : public Base //single level inheritance
{
public:
    int a,b;
    Derived() { cout<<"Derived Construtor\n"; }
    ~Derived() { cout<<"Derived Destrutor\n" ;}
    
    void gun()
    { cout<<"Inside gun\n"; }
};

int main()
{
    Base bobj;
    Derived dobj;
    dobj.fun();
    
    return 0;
}
