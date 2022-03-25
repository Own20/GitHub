#include <iostream>
#include <vector>
using namespace std;

int main() {
    // Exercise 1
    vector<int> intList(10);

    // Exercise 2
    for (auto num = intList.begin();
        num != intList.end();
        num++)
        cout << ' ' << *num;
        cout << endl;
    // Answer 0 0 0 0 0 0 0 0 0 0

    // Exercise 3
    intList = {2, 4, 6, 8, 10};
    for (auto num = intList.begin();
        num != intList.end();
        num++)
        cout << ' ' << *num;

    // Exercise 4
    int intArray[7] = {1, 3, 5, 7, 9, 11};
    // declare length of array 7, but only 6 values
    vector<int> vecList(intArray, intArray + 7);
    //
    vector<int>::iterator intVecIter;
    //
    intVecIter = vecList.begin();
    //
    ++intVecIter;
    //
    vecList.insert(intVecIter, 22);
    //

    return 0;

}