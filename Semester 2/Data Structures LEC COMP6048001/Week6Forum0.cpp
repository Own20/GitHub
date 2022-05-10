#include <iostream>
#include <vector>
std::string inp;
int i, len;


std::vector<char> ops;
void convert()
{
    char ch = inp[i];
    if (i > len) //base case
    {
        return;
    }

    //general case
    else if (ch == '(')
    {
        i++;
        convert();
    }
    else if (ch == ')')
    {
        std::cout << ops[ops.size()-1];
        ops.pop_back();
        i++;
        convert();
    }
    else if (isdigit(ch))
    {
        i++;
        std::cout << ch;
        convert();
    }
    else if ((ch == '+') || (ch == '*'))
    {
        i++;
        ops.push_back(ch);
        convert();
    }
}


int main()
{
    std::cout << "Infix to postfix conversion using recursion" << std::endl;
    i = 0;
    inp = "(5+5)";
    len = inp.length();
    convert();
    std::cout << "\n";
    ops.clear(); i = 0;
    inp = "((5+5)*(6+6))";
    len = inp.length();
    convert();
    std::cout << "\n";
    ops.clear(); i = 0;
    inp = "((4+8)*((5+5)*(6+6)))";
    len = inp.length();
    convert();
    std::cout << "\n";
    return 0;
}