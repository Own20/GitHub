#include <iostream>
#include <vector>
using namespace std;

int main() {
    // 1
    vector<int> intList();

    // 2
    vector<int> intList(10);
    for (auto num = intList.begin(); num != intList.end(); num++)
        cout << ' ' << *num;

    // 3
    int intArray[5] = {2, 4, 6, 8, 10};
    vector<int> intList(intArray, intArray + 7);
    for (auto num = intList.begin(); num != intList.end(); num++)
        cout << ' ' << *num;

    return 0;
}