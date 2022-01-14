#include <iostream>
using namespace std;

class Demo
{
public:
    int i;
    int j;
    
    
    Demo()
    {
        i=0;
        j=0;
        cout<<"Default\n";
        
    }
    Demo(int x,int y)
    {
        i=x; j=y;
        cout<< "Paramterised\n";
        
    }
void fun()
    {
    i++; j++;
    }
    void gun() const
    {
        int no=10;
        //i++ ; j++; error
    }
};
    

int main()
{
    const Demo obj(10,20);
    obj.fun();
    obj.gun(11,21); //gun(&obj,11);
    return 0;
}
