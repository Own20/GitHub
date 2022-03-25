#include <iostream>
using namespace std;

//Definition of the node 
template <class Type> 
struct nodeType {
    Type info;
    nodeType<Type> *link; 
};

template <class Type> 
class linkedListType { 
    protected:
    int count;
    nodeType<Type> *first;
    nodeType<Type> *last;
    nodeType<Type> *current;
public:
    linkedListType() //default constructor 
    {
        first = NULL;
        last = NULL;
        count = 0;
    }
};

// template <class Type>
nodeType<int> *buildListForward() {
    nodeType<int> *first, *newNode, *last;
    int num;
    cout << "Enter a list of integers ending with -999." << endl;
    cin >> num;
    first = NULL;
    while (num != -999) {
        newNode = new nodeType<int>;
        newNode->info = num;
        newNode->link = NULL;
        if (first == NULL) {
            first = newNode;
            last = newNode;
        } else {
            last->link = newNode;
            last = newNode;
        }
        cin >> num;
    }
    return first;
}

template <class Type>
nodeType<Type> *printLinkedList(nodeType<Type> *first) {
    while (first != NULL) {
	    //Process current
        cout << first -> info << ' ';
	    first = first -> link;
    }
    return first;
}

// void printLinkedList() {
//     buildListForward();
//     current = first;
//     while (current != NULL) {
// 	    //Process current
//         cout << current << endl;
// 	    current = current -> link;
//     }
// }

int main () {
    linkedListType<int> linkedList;
    nodeType<int> *first = buildListForward();
    // buildListForward<int>();
    
    printLinkedList(first);

    return 0;
}
