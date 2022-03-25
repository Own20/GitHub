#include <iostream>
using namespace std;

struct DataUser {
    string nama;
    string username;
    string email;
    string password;
    DataUser *prev;
    DataUser *next;
};

DataUser *head;
DataUser *tail;
DataUser *cur;
DataUser *newNode;
DataUser *del;

void createDoubleLinkedList(string data[4]) {
    head = new DataUser();
    head -> nama = data[0];
    head -> username = data[1];
    head -> email = data[2];
    head -> password = data[3];
    head -> prev = NULL;
    head -> next = NULL;
    tail = head;
}

void addFirst(string data[4]) {
    if(head == NULL) {
        cout << "Double Linked List belum dibuat!!!" << endl;
    }
    else {
        newNode = new DataUser();
        newNode -> nama = data[0];
        newNode -> username = data[1];
        newNode -> email = data[2];
        newNode -> password = data[3];
        newNode -> prev = NULL;
        newNode -> next = head;
        head -> prev = newNode;
        head = newNode;
    }
}

void addLast(string data[4]) {
    if(head == NULL) {
        cout << "Double Linked List belum dibuat!!!" << endl;
    }
    else {
        newNode = new DataUser();
        newNode -> nama = data[0];
        newNode -> username = data[1];
        newNode -> email = data[2];
        newNode -> password = data[3];
        newNode -> prev = tail;
        newNode -> next = NULL;
        tail -> next = newNode;
        tail = newNode;
    }
}

void removeFirst() {
    if(head == NULL) {
        cout << "Double Linked List belum dibuat!!!" << endl;
    }
    else {
        del = head;
        head = head -> next;
        head -> prev = NULL;
        delete del;
    }
}

void removeLast() {
    if(head == NULL) {
        cout << "Double Linked List belum dibuat!!!" << endl;
    }
    else {
        del = tail;
        tail = tail -> prev;
        tail -> next = NULL;
        delete del;
    }
}

void printDoubleLinkedList() {
    if(head == NULL) {
        cout << "Double Linked List belum dibuat!!!" << endl;
    }
    else {
        cout << "Isi Data: " << endl;
        cur = head;
        while(cur != NULL) {    
        cout << "Nama User: " << cur -> nama << endl;
        cout << "Username User: " << cur -> username << endl;
        cout << "Email User: " << cur -> email << endl;
        cout << "Password User: " << cur -> password << "\n" << endl;

        cur = cur -> next;
        }
    }
}

int main() {
    string newData[4] = {"Yunus Febriansyah", "yunuss", "yunus@gmail.com", "gampangAja"};
    createDoubleLinkedList(newData);
    printDoubleLinkedList();

    string data2[4] = {"Bambang", "bmb", "bambangdong@gmail.com", "dongBambang"};
    addFirst(data2);
    printDoubleLinkedList();

    string data3[4] = {"Siti Hidayah", "sitii", "sisiti@gmail.com", "sitiAja"};
    addLast(data3);
    printDoubleLinkedList();

    removeFirst();
    printDoubleLinkedList();

    removeLast();
    printDoubleLinkedList();
}