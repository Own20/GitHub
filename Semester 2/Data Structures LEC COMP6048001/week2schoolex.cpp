#include<iostream>
using namespace std;

class School {
  	private:
        string name;
  	public:
        void setName(string myname){
            name = myname;
        };
        void stateName(){
        cout << "Hello"<<name<<endl; 
    }
};

// Derived class
class Teacher : public School {
  	public:
    	string role;
    	Teacher(string myname,string myrole): School(myname){
        	role = myrole;
        	cout << "You are a"<<role<< endl; 
    	}

   		string job;
    	Teacher(string myname,string myjob): School(myname){
        	job = myjob;
        	cout << "Your job is to"<<job<< endl; 
    	}
};

// Derived class
class Student : public School {
  	public:
    	string role;
    	Student(string myname,string myrole): School(myname){
        	role = myrole;
        	cout << "You are a"<<role<< endl; 
    	}

    	string job;
    	Student(string myname,string myjob): School(myname){
        	job = myjob;
        	cout << "Your job is to"<<job<< endl; 
    	}
};

int main(){
    School s("John");
    return 0;
}
