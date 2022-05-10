#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void menu(){
    cout << "MENU"<<endl;
    cout<< "Press 1 to create order."<<endl;
    cout<<"Press 2 to display all orders."<<endl;
    cout<<"Press 3 to delete an order."<<endl;
    cout<<"Press 4 to update an order (name, amount, price)."<<endl;
    cout<<"Press 5 to exit."<<endl;
}

void createOrder(vector<int>& arrId, vector<string>& arrName, vector<int>& arrAmt, vector<int>& arrPrice){
    // int num;
    // printf("Enter number of items to be inserted: ");
    // cin >> num;

    int id_cin;
    string name_cin;
    int amt_cin;
    int price_cin;

    // for (int i = 0; i < num; i++) {
    //     cout << "Input ID: ";
    //     cin >> id_x;
    //     arrId.push_back(id_x);

    //     cout << "Input food name: ";
    //     cin >> name_x;
    //     arrName.push_back(name_x);
    // }
    cout << "Input ID: ";
    cin >> id_cin;
    arrId.push_back(id_cin);

    cout << "Input food name: ";
    getline(cin >> ws, name_cin);
    vector<string>::iterator it = arrName.insert(arrName.end(), name_cin);

    cout << "Input amount: ";
    cin >> amt_cin;
    arrAmt.push_back(amt_cin);

    cout << "Input price ";
    cin >> price_cin;
    arrPrice.push_back(price_cin);
}

void displayOrder(vector<int>& arrId, vector<string>& arrName, vector<int>& arrAmt, vector<int>& arrPrice){

    cout << "Order is as follows\n" <<endl;
    cout << "ID\tName\t\tAmount\tPrice" <<endl;
    for (int i = 0; i < arrId.size(); ++i) {
        cout << arrId[i] << "\t"<< arrName[i] << "\t\t" << arrAmt[i] << "\t" << arrPrice[i] <<endl;
    }
}

// index finder
int getIndex(vector<int> arr, int K){
    vector<int>::iterator it = find(arr.begin(), arr.end(), K);

    int index;
    if (it != arr.end()) {
        index = it - arr.begin();
    } else {
        index = -1;
    }

    return index;
}

void deleteOrder(vector<int>& arrId, vector<string>& arrName, vector<int>& arrAmt, vector<int>& arrPrice){
    int idDel;
    printf("Enter ID of order to be deleted:\n");
    cin >> idDel;

    int indexDel = getIndex(arrId, idDel);

    arrId.erase(arrId.begin() + indexDel);
    arrName.erase(arrName.begin() + indexDel);
    arrAmt.erase(arrAmt.begin() + indexDel);
    arrPrice.erase(arrPrice.begin() + indexDel);

    cout<<"Order has been successfully deleted."<<endl;
}

void updateOrder(vector<int>& arrId, vector<string>& arrName, vector<int>& arrAmt, vector<int>& arrPrice){
    int idUpdate;
    string nameUpdate;
    int amtUpdate;
    int priceUpdate;

    printf("Enter ID of order to be updated:\n");
    cin >> idUpdate;

    int indexUpdate = getIndex(arrId, idUpdate);

    cout << "ID: " << arrId[indexUpdate] << endl;
    cout << "name: " << arrName[indexUpdate] << endl;
    cout << "amount: " << arrAmt[indexUpdate] << endl;
    cout << "price: " << arrPrice[indexUpdate] << endl;

    cout << "Input food name to be updated: ";
    getline(cin >> ws, nameUpdate);
    arrName.at(indexUpdate) = nameUpdate;
    cout << "Input amount to be updated: ";
    cin >> amtUpdate;
    arrAmt.at(indexUpdate) = amtUpdate;
    cout << "Input price to be updated: ";
    cin >> priceUpdate;
    arrPrice.at(indexUpdate) = priceUpdate;
}

// void searchOrder(vector<int>& arrId, vector<string>& arrName){
//     string searchByName;

//     printf("Enter name of order to be updated:\n");
//     getline(cin >> ws, searchByName);

//     int indexSearch = getIndex(arrName, searchByName);
//     if (index > 0){
//         cout << "ID: " << arrId[indexSearch] << endl;
//         cout << "name: " << arrName[indexSearch] << endl;
//     } else {
//         cout << "Order is not found" <<endl;
//     }
// }

int main() {
    int choice;

    vector<int> arrId;
    vector<string> arrName;
    vector<int> arrAmt;
    vector<int> arrPrice;

    // int arrID[], arrAmount[], arrPrice[];
    // string arrName[];

    do {
        cout << "\n";
        menu();
        cout << "\nEnter your choice: ";
        cin >> choice;
 
        switch (choice) {
        case 1:
            createOrder(arrId, arrName, arrAmt, arrPrice);
            break;
        case 2:
            displayOrder(arrId, arrName, arrAmt, arrPrice);
            break;
        case 3:
            deleteOrder(arrId, arrName, arrAmt, arrPrice);
            break;
        case 4:
            updateOrder(arrId, arrName, arrAmt, arrPrice);
            break;
        case 5:
            exit(0);
            break;
        default:
            cout << "INVALID CHOICE :-(";
        }
 
    } while (choice != 5);

    return 0;
}