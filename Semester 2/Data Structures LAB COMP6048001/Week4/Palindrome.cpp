#include <iostream>
#include <string.h>
using namespace std;

int main() {
    char s[10];
    int l;
    bool c = true;

    cout << "Enter String: ";
    cin >> s;

    l = strlen(s);

    for(int i = 0; i < l; i++) {
        if(s[i] != s[l - i - 1]) {
            c = false;
            break;
        }
    }

    if(c == false) {
        cout << s << " is not a palindrome" << endl;
    } else {
        cout<< s << " is a palindrome" << endl;
    }
    
    return 0;
}