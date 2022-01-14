#include<iostream>
using namespace std;

int main()
{
int no = 11;
int *p = &no;

int value = 21;
int &x = value;
    
    cout <<value<<"\n"; //21
    cout<<x<<"\n"; //21
    
    cout <<&value<<"\n"; //300
    cout<<&x<<"\n"; //300
    
return 0;
}
