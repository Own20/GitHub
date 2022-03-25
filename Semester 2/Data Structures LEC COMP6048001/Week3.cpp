#include <iostream>
using namespace std;

struct student {
    string id;
    string name;
    char gender;
    int age;
};

void example_ref(int &p1) { //int num will be changed because &p1 = reference
    p1=p1*2;
}

template <class myType>
myType GetMax (myType a, myType b) {
return (a>b?a:b);
}

template <class T, class U>
T GetMin (T a, U b) {
return (a<b?a:b);
}

int main() {
    // struct student stud[2];
    // stud[0].gender = 'F';
    // stud[0].id = "B12345";
    // stud[0].name = "Annie"; 
    // stud[0].age = 17;
    // stud[1].gender = 'F';
    // stud[1].id = "B12345";
    // stud[1].name = "Annie"; 
    // stud[1].age = 17;
    // cout << stud[0] << endl;

    // string cars[4] = {"Volvo", "BMW", "Ford", "Mazda"};
    // for(int i = 0; i < 4; i++) {
    //     cout << cars[i] << "\n";
    // }

    // int myarray[4];
    // myarray[0] = 20;
    // myarray[1] = 40;
    // myarray[2] = 60;
    // myarray[3] = 80;
    // cout << myarray[0] << endl;

    // int var1;
    // int *ptr;
    // ptr = &var1;                        //the pointer puts the value to value 1 using its address
    // *ptr = 100;                         //the pointer has the 100
    // cout << "&ptr= " << &ptr << endl;   //address pointer
    // cout << "&var1= " << &var1 << endl; //address variable
    // cout << "*ptr= " << *ptr << endl;
    // cout << "var1= " << var1 << endl;

    // string *str;
    // str = new string;
    // *str = "Sunny Day";
    // cout << str->length() << endl;

    // int *p;
    // char *c;
    // p = new int;
    // c = new char[10];
    // delete p; // to deallocate a single variable
    // delete [] c; //to deallocate an array of variables

    // int num = 5;
    // example_ref(num);
    // cout<<num<<endl;

    cout<<GetMax<string> ("hello", "zero")<<endl;

    return 0;
}