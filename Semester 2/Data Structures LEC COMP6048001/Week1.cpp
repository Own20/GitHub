//#include <iostream>
//#include <string>
//using namespace std;
//int main()
//{
//	string name;
//	cout << "What is your name?";
//	getline (cin, name);
//	cout << "Hello " << name << "!\n";
//}

// example of c++ code
//#include <iostream>
//#include <string>
//#include <iomanip>
//using namespace std;
//int main(){
//	char letter = 'A';
//	cout << letter << endl;
//	printf("%d\n", letter);
//	
//	int sum = 1;
//	int foo[5] = {2, 4, 5, 3, 1};
//	
//	for(int i = 0; i<5; i++){
//		sum += foo[i];
//		cout << sum << endl;
//	}	
//	
//	return 0;	
//}

//#include <iostream>
//#include <string>
//using namespace std;
//int main()
//{
//	string day;
//	cout << "What is the day? ";
//	getline (cin, day);
//	cout << "the day is " << day << "!\n";
//	
//	if (day == "weekend"){cout << "Im Studying" << "!\n";}
//	if (day == "weekday"){cout << "Im Fishing" << "!\n";}
//	
//	return 0;
//}

//#include <iostream>
//using namespace std;
//int main () {
//	int i, n;
//	bool is_prime = true;
//	cout << "Enter a positive integer: ";
//	cin >> n;
//	//0 and 1 are not prime numbers
//	if (n == 0 || n == 1){
//		is_prime = false;
//	}
//	//loop to check if n is prime
//	for (i = 2; i <= n/2; ++i) {
//		if (n % i == 0) {
//			is_prime = false;
//			break;
//		}
//	}
//	if (is_prime) {
//		cout << n << " is a prime number";
//	}
//	else {
//		cout << n << " is not a prime number";
// 	}
//	return 0;
//}

// #include <iostream>
// #include <string>
// using namespace std;
// int main () {
// 	int numbers;
// 	cout << "What data are you searching for? ";
// 	cin >> numbers;
// 	for (int n : {3, 49, 1, 6, 33, 13, 9, 4, 6}) {
// 		cout << numbers << " ";
// 		if (numbers == n) {
// 			cout << "found" << endl;
// 		}
// 		else {
// 			cout << "not found" << endl;
// 		}
// 	}
// 	return 0;
// }

// #include <iostream>
// using namespace std;
// int main () {
// 	double first, second, answer;
// 	int choice;
// 	cout << "Enter the first number: " << endl;
// 	cin >> first;
// 	cout << "Enter the second number: " << endl;
// 	cin >> second;
// 	cout << "What calculation you want to do?" << endl;
// 	cout << "Choose the following option:" << endl;
// 	cout << "Choose 1: Addition" << endl;
// 	cout << "Choose 2: Substraction" << endl;
// 	cout << "Choose 1: Multiplication" << endl;
// 	cout << "Choose 1: Division" << endl;
// 	cin >> choice;
// 	switch (choice)
// 	{
// 	case 1: {
// 		answer = first + second;
// 		cout << "Answer" << endl;
// 		cout << answer << endl;
// 		break;
// 		}
// 	case 2: {
// 		answer = first - second;
// 		cout << "Answer" << endl;
// 		cout << answer << endl;
// 		break;
// 		}
// 	case 3: {
// 		answer = first * second;
// 		cout << "Answer" << endl;
// 		cout << answer << endl;
// 		break;
// 		}
// 	case 4: {
// 		answer = first / second;
// 		cout << answer << endl;
// 		cout << "Answer" << endl;
// 		break;
// 		}
// 	}
// 	return 0;
// }

#include <iostream>
using namespace std;

class Box {
	public:
		int length;
		double width, height;
};

int main () {
	Box box1;
	int choice;

	cout << "Width: " << endl;
	cin >> box1.width;
	cout << "Height: " << endl;
	cin >> box1.height;

	cout << "What calculation you want to do?" << endl;
	cout << "Choose the following option:" << endl;
	cout << "Choose 1: Addition" << endl;
	cout << "Choose 2: Substraction" << endl;
	cout << "Choose 1: Multiplication" << endl;
	cout << "Choose 1: Division" << endl;
	cin >> choice;
	switch (choice)
	{
	case 1: {
		box1.length = box1.width + box1.height;
		cout << "Answer" << endl;
		cout << box1.length << endl;
		break;
		}
	case 2: {
		box1.length = box1.width - box1.height;
		cout << "Answer" << endl;
		cout << box1.length << endl;
		break;
		}
	case 3: {
		box1.length = box1.width * box1.height;
		cout << "Answer" << endl;
		cout << box1.length << endl;
		break;
		}
	case 4: {
		box1.length = box1.width / box1.height;
		cout << "Answer" << endl;
		cout << box1.length << endl;
		break;
		}
	default:
		cout << "Error input" << endl;
	}
	
	cout << "Answer: " << endl;
	cout << box1.length << endl;


	return 0;
}