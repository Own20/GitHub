#include <iostream>
using namespace std;

class order {
private:
int id;
    string foodName;
    int amount;
    int price;
    int idDelete;
    int idUpdate;
    string foodNameSearch;
    int idSearch;

    public:
void printOrder() {
    cout << "a. Create Order" << endl;
    cout << "b. Display Order" << endl;
    cout << "c. Delete Order" << endl;
    cout << "d. Update Order" << endl;
    cout << "e. Search Order" << endl;
    cout << "f. Sort Order" << endl;
}

void createOrder() {
    cout << "Input id: ";
    cin >> id;
    cout << "Input food name: ";
    cin >> foodName;
    cout << "Input amount: ";
    cin >> amount;
    cout << "Input price: ";
    cin >> price;
}

void displayOrder() {
    createOrder();

    cout << "Ex. id\tname\tamount\tprice" << endl;
    for (int i = 0; i > 0; i++) {
        cout << "\t" << id << "\t" << foodName << "\t" << amount << "\t" << price << endl;
    }
}

void deleteOrder() {
    cout << "Insert id of order to delete: ";
    cin >> idDelete;
    cout << "Deleting success";
}

void updateOrder() {
    cout << "Insert id of order to update: ";
    cin >> idUpdate;
    cout << "Input food name: ";
    cin >> foodName;
    cout << "Input amount: ";
    cin >> amount;
    cout << "Input price: ";
    cin >> price;
}

void searchOrder() {
    cout << "Enter the name to search for order: ";
    cin >> foodNameSearch;
    cout << "Enter the id to search for order: ";
    cin >> idSearch;
}

};

int main() {

    return 0;
}