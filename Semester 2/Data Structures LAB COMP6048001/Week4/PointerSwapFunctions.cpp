#include <iostream>
using namespace std;

void swap(int *p1, int *p2){
    int a;
    a = *p1;
    *p1 = *p2;
    *p2 = a;
}

int main() {
    int num1;
    int num2;

    cout << "Input first Number: ";
    cin >> num1;

    cout << "Input second Number: ";
    cin >> num2;

    cout << endl;
    cout << "Before swap" << endl;
    cout << "First number\t: " << num1 << endl;
    cout << "Second number\t: " << num2 << endl;
   
    swap(&num1, &num2);

    cout << endl;
    cout << "After swap" << endl;
    cout << "First number\t: " << num1 << endl;
    cout << "Second number\t: " << num2 << endl;
   
    return 0;
}