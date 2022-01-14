#include<iostream>
using namespace std;

class Array
{
public:
    int *Arr;
    int size;
    
    Array(int length=10)
    {
        size=length;
        Arr =new int[size];
    }
    ~Array()
    {
        delete []Arr;
    }
    void Accept()
    {
        int i =0;
        cout<<"Enter the elements\n";
        for(i=0; i<size;i++)
        {
            cin >> Arr[i];
        }
    }
    void Display()
    {
        int i=0;
        cout<<"Elements are \n";
        for(i=0;i<size;i++)
        {
            cout<<Arr[i]<<"\n";
        }
    }
};
int main()
{
    Array obj(5);
    obj.Accept();
    obj.Display();
    return 0;
}
