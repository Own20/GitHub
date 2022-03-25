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
        Car(float mygas=0,float myefficiency=0, string mycolor="none", string mymake="none", string myname="none");
        void drive(){
	        cout<<"drive now!"<<endl;
        }
        void drive(string mysecondname){
	        cout<<"Hey "<<mysecondname<<", this is your name, drive now!"<<endl;
        }
        void refuel(float gas){
	        cout<<"need to refuel "<<gas<<endl;
        }
        void setColor(string c){
	        color=c;
        }
        string getColor(){
	        return color;
        }
        ~Car(void){
	        cout << "Object is being deleted" << endl;
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

class AbstractCar{
    virtual void NeedRepair()=0;
};

class Car:AbstractCar{
private:
    float gas;
    float efficiency;
    string color;
    string make;
    string name;
public:
    void NeedRepair(){
        if (efficiency<100) {
	        cout<<"Your car need to be repaired: your efficiency is"<<efficiency<<endl;
        }
    }
};

int main(){
	Car mycar1;
	mycar1.drive();

    Toyota t(0,0,"black","toyota","blacky","alphard");
}
