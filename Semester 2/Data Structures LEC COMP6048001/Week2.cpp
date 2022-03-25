// #include <iostream>
// using namespace std;
// class Car{
//     private:
//         float gas;
//         string name;
//     public:
//         // Car (float mygas = 0, string myname = "carrie");
//         // Car(float mygas, string myname) {
//         //     gas = mygas;
//         //     name = myname;
//         // }
//         Car (float mygas = 0, string myname = "none");
//         void drive() {
//             cout << "please " << name << " drive car now!" << endl; 
//         }
//         void setName(string myname) {
//             name = myname;
//         }
// };

// int main () {
//     // Car mycar;
//     // mycar.setName ("lovable car");
//     // mycar.drive ();
//     Car mycar(0, "mine");
//     mycar.drive();
//     return 0;
// }

#include <iostream>
using namespace std;

class Car{
    private:
        float gas;
        float efficiency;
        string color;
        string make;
        string name;
    public:
        // Car (float mygas = 0, string myname = "carrie");
        // Car(float mygas, string myname) {
        //     gas = mygas;
        //     name = myname;
        // }
        Car(float mygas=0,float myefficiency=0, string mycolor="none", string mymake="none", string myname="none");void drive(){
        	cout<<"Hey "<<name<<", drive now!"<<endl;
        }
        void refuel(float gas){
        	cout<<"need to refuel "<<gas<<endl;
        }
        void setColor(string c){
        	color=c;
        }
};

class Toyota: public Car{
    public:
        string model;
        Toyota(float mygas,float myefficiency, string mycolor, string mymake,string myname,string mymodel)
        	:Car(mygas,myefficiency,mycolor,mymake,myname)
            {
            model=mymodel;
            cout<<"Your car is:"<< model<<endl;
            }
};

int main() {
    // Car mycar(0, "mine");
    // mycar.drive();
    Toyota t(0, 0, "black", "toyota", "blacky", "alphard");
    return 0;
}