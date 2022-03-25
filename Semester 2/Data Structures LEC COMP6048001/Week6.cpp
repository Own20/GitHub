// #include <iostream>
// using namespace std;

// int fact(int num) {
//     if (num == 0) {
//         return 1;
//     } else {
//         return num * fact (num -1);
//     }
// }

// int main() {
//     int result = fact(5);
//     cout << result << endl;

//     return 0;
// }

// class Fraction {
//     public:
//         int numerator;
//         int denominator;

//         Fraction(int n, int d) {
//             numerator = n;
//             denominator = d;
//         }

//         int getNumerator() {
//             return numerator;
//         }
        
//         int getDenominator() {
//             return denominator;
//         }
        
//         double getDecimal() {
//             return numerator/denominator;
//         }
// };

// int main() {
//     Fraction f(5, 9);
//     cout << f << endl;
//     return 0;
// }

// class Planet(
// private:
// float diameter;
// string name;
// protected:
// Planet(float d, string n){
// diameter=d;
// name=n;
// }
// float distancefromearth;
// int calculatethevolume(){
// return 4/3 * 3.14*pow(diameter,3);
// }

// class Saturn: public Planet(
// private:
// string color;
// public;
// void changecolor(){
// if (calculatethevolume()>300) {
// color = "blue" ;
// cout<<'it's time to change the color of the planet to" << color <<endl;
// }
// }

// int main() {
//     Planet p;
//     Saturn s;
//     s.changecolor();
// }

#include <iostream>
using namespace std;

int fact(int num) {
    if (num == 36) {
        return 1;
    } else {
        cout << num << endl;
        return num * fact (num*3);
    }
}

int main() {
    int result = fact(4);
    cout << result << endl;

    return 0;
}