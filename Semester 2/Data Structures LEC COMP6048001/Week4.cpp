#include <iostream>
#include <vector>
using namespace std;

int main() {
    // // Exercise 1
    // vector<int> intList(8);
    // // Excersize 3
    // intList = {2, 4, 6, 8, 10};
    // vector<int> intList(intArray, intArray + 7);
    // for (auto num = intList.begin();
    //     num != intList.end();
    //     num++)
    //     cout << ' ' << *num;

    // // Excersice Iterator
    // int intArray[7] = {1, 3, 5, 7, 9, 11};
    // vector<int> vecList(intArray, intArray + 7);
    // vector<int>::iterator intVecIter;
    // intVecIter = vecList.begin();
    // ++intVecIter;
    // vecList.insert(intVecIter, 22);
    // for (int i = 0; i < 8; i++)
    //     cout << ' ' << vecList[i];

    vector<int> theVect, thisVect, myVect;

    theVect.push_back(1);
    theVect.push_back(1);
    theVect.push_back(1);
    theVect.pop_back();
    theVect.push_back(1);
    theVect.push_back(1);
    theVect.back() = 1;
    theVect.front() = 1;

    thisVect.assign(5, 2);
    thisVect.push_back(1);
    thisVect.push_back(1);
    thisVect.push_back(1);
    thisVect.erase(thisVect.begin()+2);
    thisVect.push_back(1);
    thisVect.push_back(1);
    thisVect.insert(thisVect.begin(), 7);
    thisVect.erase(thisVect.begin()+ 5);

    myVect.push_back(1);
    myVect.push_back(1);
    myVect.front() = 1;
    myVect.insert(myVect.end(), 5);
    myVect.push_back(1);
    myVect.pop_back();
    myVect.assign(0, 5);

    thisVect.swap(myVect);
    theVect.swap(thisVect);

    cout << thisVect.size() << endl;
    cout << theVect.size() << endl;
    cout << myVect.size() << endl;

    return 0;
}