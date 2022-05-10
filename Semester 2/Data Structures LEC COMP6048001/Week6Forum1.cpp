#include <iostream>    
#include <stack>
using namespace std;

int main() {
	stack<int> stack1;
	stack<int> stack2;
    stack<int> stack3;

    stack1.push(12);
    stack2.push(24);
    stack3.push(11);
    stack1.push(37);
    stack2.push(59);
    stack3.push(46);
    stack1.pop();
    stack1.pop();
    stack2.pop();
	stack1.emplace(12);
	stack2.emplace(20);
    stack3.emplace(41);
	stack1.emplace(19);
	stack2.emplace(23);
    stack3.emplace(10);
	stack1.swap(stack2);
    stack2.swap(stack3);
    
	cout << "stack1 = ";
	while (!stack1.empty()) {
		cout << stack1.top() << " ";
		stack1.pop();
	}

	cout << endl << "stack2 = ";
	while (!stack2.empty()) {
		cout << stack2.top() << " ";
		stack2.pop();
	}

    cout << endl << "stack3 = ";
	while (!stack3.empty()) {
		cout << stack3.top() << " ";
		stack3.pop();
	}
}