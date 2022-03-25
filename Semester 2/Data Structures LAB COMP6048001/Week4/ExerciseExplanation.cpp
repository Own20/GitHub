#include <iostream>
#include <vector>
using namespace std;

int main() {

    int intArray[7] = {1, 3, 5, 7, 9, 11};
    // declare an array called intArray with the length of 7 containing 1, 3, 5, 7, 9, 11

    vector<int> vecList(intArray, intArray + 7);
    // declare a vector called vecList containing the intArray with the range of intArray + 7

    vector<int>::iterator intVecIter;
    // declare a vector iterator called intVecIter

    intVecIter = vecList.begin();
    // intialize intVecIter iterator to the first element of vecList array

    ++intVecIter;
    // increment intVecIter iterator by 1 from first to the second elemnt of vecList array

    vecList.insert(intVecIter, 22);
    // use the insert function on vecList array to insert 22 on intVecIter iterator
    // all index will be incremented by 1, because 22 will be the second element, and vecList array will be increased by 1
    // {1, 22 , 3 , 5, 7, 9, 11}
    
}