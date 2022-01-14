#include<iostream>
using namespace std;
 class Array

{
private:
    int*ptr;
    int size;
public:
    Array(int no=5)  //construter
    {
        cout<<"Construter\n";
        size=no;
        ptr=new int[size];
    }
    ~Array()
    {
        cout<<"Destuctor\n";
        delete[]ptr;
    }
    void Accept()
    {
        int iCnt=0;
        cout<<"Enter the elements\n";
        //*for( iCnt=0 : iCnt < size; iCnt++ )
       // {
         //  Cin >>ptr[iCnt];
        //}
    }
    void Display()
    {
        cout<<"Elements are\n";
        int iCnt=0;
        for (iCnt =0;iCnt<size;iCnt++)
        {
            cout<<ptr[iCnt]<<"\n";
        }
    }
};

int main( )
{
  cout<<"Inside main \n";
  int value=0;
  cout<<"Enter the number of elements";
  cin>>value;
  Array*obj=NULL;
  obj = new Array(value);
  obj -> Accept();
  obj -> Display();
    
delete obj;
return 0;
}
