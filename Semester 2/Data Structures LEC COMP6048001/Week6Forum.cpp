#include <iostream>
#include <vector>
using namespace std;

string str;
int a;
int len;

vector<char> oper;

void convert() {
    char ch = str[a];

    //base case
    if (a > len) {
        return;
    }

    //general case
    else if (ch == '(') {
        a++;
        convert();
    }
    else if (ch == ')') {
        cout << oper[oper.size() - 1];
        oper.pop_back();
        a++;
        convert();
    }
    else if (isdigit(ch)) {
        a++;
        cout << ch;
        convert();
    }
    else if ((ch == '+') || (ch == '*')) {
        a++;
        oper.push_back(ch);
        convert();
    }
}


int main()
{
    cout << "Infix to postfix conversion using recursion" << endl;

    a = 0;
    str = "(5+5)";
    len = str.length();
    convert();
    cout << "\n";
    oper.clear();
    
    a = 0;
    str = "((5+5)*(6+6))";
    len = str.length();
    convert();
    cout << "\n";
    oper.clear();
    
    a = 0;
    str = "((4+8)*((5+5)*(6+6)))";
    len = str.length();
    convert();
    cout << "\n";
    
    return 0;
}