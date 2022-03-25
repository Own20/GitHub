#include <iostream>
using namespace std;

double addition(double first,double second){
	return first+second;
}

double substraction(double first,double second){
	return first-second;
}

double multiplication(double first,double second){
	return first*second;
}

double division(double first,double second){
	return first/second;
}



void process(int choice,double first,double second){
	double answer;
	switch(choice){
  	case 1:{
  		answer=addition(first,second);
  		cout<<"Answer"<<endl;
  		cout<<answer<<endl;
		break;
	  }
  	case 2:{
  		answer=substraction(first,second);
  		cout<<"Answer"<<endl;
  		cout<<answer<<endl;
		break;
	  }
	case 3:{
  		answer=multiplication(first,second);
  		cout<<"Answer"<<endl;
  		cout<<answer<<endl;
		break;
	  }
	case 4:{
  		answer=division(first,second);
  		cout<<"Answer"<<endl;
  		cout<<answer<<endl;
		break;
	  }
	default: 
		cout<<"Error inputs"<<endl;
  }
}

int main() {
	double first,second,answer;
	int choice;
	
	
	
  cout << "Enter the first number: "<<endl;
  cin>>first;
  cout<<"Enter second number: "<<endl;
  cin>>second;
  cout<<"What calculation you want to do?"<<endl;
  cout<<"Choose the following option:"<<endl;
  cout<<"Choose 1: addition"<<endl;
  cout<<"Choose 2: substraction"<<endl;
  cout<<"Choose 3: multiplication"<<endl;
  cout<<"Choose 4: division"<<endl;
  
  cin>>choice;
  
  process(choice,first,second);
  process(choice,first,second);
  
  
  
  
  
  return 0;
}
