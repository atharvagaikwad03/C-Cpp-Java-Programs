#include<iostream>
using namespace std;

void fun(int x) //Call by value
{
    x++;
}
void gun()//Call by address
{
    
}
void sun() //Call by refernce
{
    
}





int main()
{
    int a=10,b=10,c=10;
    cout<<"Before call to fun"<<a<<"\n";
    fun(a);
    cout<<"After call to fun"<<a<<"\n";

return 0;
}
