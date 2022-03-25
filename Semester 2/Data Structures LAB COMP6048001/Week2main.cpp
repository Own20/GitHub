//
//  main.cpp
//  Test
//
//  Created by Lay Achea Deth on 2/24/22.
//

#include <iostream>

using namespace std;

//class Shape{
//public:
//    double width;
//    double height;
//
//    double getArea();
//
//};

class Shape{
private:
    double width;
    double height;
    
public:
    
    
    
    
    void setWidth(double w){
        this->width=w;
    }
    void setHeight(double h){
        this->height=h;
    }
    
    double getHeight(){
        return height;
    }
    double getWidth(){
        return width;
    }
    
   
    
    
};

class Rectangle : public Shape{
public:
    double getArea(){
        return getHeight()*getWidth();
    }
    
    void calculate(){
        cout<<getArea()*3;
    }
    void calculate(double value){
        cout<<getArea()*value;
    }
    
    void calculate(int  value){
        cout<<getArea()*value;
    }
    
    
    
   
};

template <typename T>
T myMax(T x, T y)
{
   return (x > y)? x: y;
}


template <class T, int max>
int arrMin(T arr[], int n)
{
   int m = max;
   for (int i = 0; i < n; i++)
      if (arr[i] < m)
         m = arr[i];
  
   return m;
}


int main()
{
//    Rectangle box1;
//    box1.setWidth(30);
//    box1.setHeight(20);
//
//    cout<<"Area of box1: "<<box1.getArea()<<endl;
//
//    box1.calculate();
//    cout<<endl;
//    box1.calculate(5.5);
//    cout<<endl;
//
//    box1.calculate(5.4);
//    cout<<endl;
    
    cout << myMax<int>(3, 7) << endl;  // Call myMax for int
      cout << myMax<double>(3.0, 7.0) << endl; // call myMax for double
      cout << myMax<char>('g', 'e') << endl;   // call myMax for char
    
    
    int arr1[]  = {10, 20, 15, 12};
       int n1 = sizeof(arr1)/sizeof(arr1[0]);
      
       char arr2[] = {1, 2, 3};
       int n2 = sizeof(arr2)/sizeof(arr2[0]);
      
       // Second template parameter to arrMin must be a constant
       cout << arrMin<int, 10000>(arr1, n1) << endl;
       cout << arrMin<char, 256>(arr2, n2);

    return 0;
}
