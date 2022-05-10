#include <iostream>
#include <cassert>
using namespace std;

template <class Type>
struct nodeType {
	Type info;
	nodeType<Type> *link;
};

template <class Type>
class linkedStackType {
	private:
        //pointer to the stack
		nodeType<Type> *stackTop;
	public:
		linkedStackType() {
            stackTop = NULL;
        }
        void push(const Type& newElement);
        void pop();
        Type top() const;
        bool isEmptyStack() const;
        bool isFullStack() const;
};

template <class Type> 
void linkedStackType<Type>::push(const Type& newElement) { 

    //(a)create a new node & store newElement
    nodeType<Type> *newNode; 
    newNode = new nodeType<Type>; 
    newNode->info = newElement; 

    //(b)put the new node on top
    newNode->link = stackTop; 

    //(c)stackTop points to new inserted node
    stackTop = newNode; 
}

template <class Type> 
void linkedStackType<Type>::pop() {

    //(a) create temp points to the top
    nodeType<Type> *temp; 
    if (stackTop != NULL) {

        //(b) move stackTop to the next node
        temp = stackTop;
        stackTop = stackTop->link;

        //(c) delete node temp
        delete temp;
    } else {
        cout<< "stack is empty" << endl;
    }
}

template <class Type> 
Type linkedStackType<Type>::top() const {
    assert(stackTop != NULL); //if stack is empty, //terminate the program
    return stackTop->info; 
}

template <class Type> 
    bool linkedStackType<Type>::isEmptyStack() const { 
    return(stackTop == NULL); 
}

template <class Type> 
    bool linkedStackType<Type>::isFullStack() const { 
    return false; 
} 

// void DisplayStack(Stack s) {
//     mystack s1;
//     while (!s.isEmpty()) {
//         s1.push(s.peek());
//         cout << (s1.peek()) << " ";
//         s.pop();
//     }
// };

int main() {
    linkedStackType<int> mystack;
    int current;
    mystack.push(1);
    mystack.push(2);
    mystack.push(3);

    // current = first;
    // while (current != NULL) {
    //     myStack.push(current);
    //     current = current->link;
    //     cout << current << " ";
    // }

    while (!mystack.isEmptyStack()) {
        current = mystack.top();
        mystack.pop();
        cout << current << " ";
    }

    // int nice = mystack.size();
    // for (int i = 0; i < nice;i++){ 
    //     cout << mystack.top() << ' ';
    //     mystack.pop();
    // }

    return 0;
}