#include<iostream>
using namespace std;

class Box {       // The class
  private:             // Access specifier
    int length=30;     // Attribute (int variable)
    double width, height; 
	 // Attribute (string variable)
	public:
		void printlength(){
			cout<<length;
		}
		
		double getwidth(){
			return width;
		}
		double getheight(){
			return height;
		}
		
		void setwidth(double w){
			width=w;
			cout<<width<<endl;
		}
		
		void setheight(double h){
			height=h;
			cout<<height<<endl;
		}
		
		
		double getVolume(double width, double height){
			return (width*height)/2;		
		}
};


int main(){
	
	Box box1;
//	int choice;
	
//	cout<<"width: "<<endl; cin>>box1.width;
//	cout<<"height: "<<endl; cin>>box1.height;
//	
//	 cout<<"What calculation you want to do?"<<endl;
//  cout<<"Choose the following option:"<<endl;
//  cout<<"Choose 1: addition"<<endl;
//  cout<<"Choose 2: substraction"<<endl;
//  cout<<"Choose 3: multiplication"<<endl;
//  cout<<"Choose 4: division"<<endl;
//  cin>>choice;
//  
//  switch(choice){
//  	case 1:{
//  		box1.length=box1.width+box1.height;
//  		cout<<"Answer: "<<box1.length;
//		break;
//	  }
//  	case 2:{
//  		box1.length=box1.width-box1.height;
//  		cout<<"Answer: "<<box1.length;
//		break;
//	  }
//	case 3:{
//  		box1.length=box1.width*box1.height;
//  		cout<<"Answer: "<<box1.length;
//		break;
//	  }
//	case 4:{
//  		box1.length=box1.width/box1.height;
//  		cout<<"Answer: "<<box1.length;
//		break;
//	  }
//	default: 
//		cout<<"Eroor inputs"<<endl;
//  }
	
//	int width=box1.width=20;
//	int height=box1.height=30;
//	box1.length=width*height;
//	int length=box1.length;
//	
//	cout<<"Answer: "<<length;
	
box1.setwidth(30.0);
box1.setheight(40.0);

	
	return 0;
}
