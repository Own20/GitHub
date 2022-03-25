#include <iostream>
using namespace std;

struct Buku
{
    string judul;
    string pengarang;
    int tahunTerbit;
    Buku *next;
};

Buku *head;
Buku *tail;
Buku *cur;
Buku *newNode;
Buku *del;
Buku *before;

int countSingleLinkedList() {
    cur = head;
    int jumlah = 0;
    while(cur != NULL) {
        jumlah++;
        cur = cur -> next;
    }
    return jumlah;
}

void createSingleLinkedList(string judul, string pengarang, int tB) {
    head = new Buku();
    head -> judul = judul;
    head -> pengarang = pengarang;
    head -> tahunTerbit = tB;
    head -> next = NULL;
    tail = head;
}

void addFirst(string judul, string pengarang, int tB) {
    newNode = new Buku();
    newNode -> judul = judul;
    newNode -> pengarang = pengarang;
    newNode -> tahunTerbit = tB;
    newNode -> next = head;
    head = newNode;
};

void addLast(string judul, string pengarang, int tB) {
    newNode = new Buku();
    newNode -> judul = judul;
    newNode -> pengarang = pengarang;
    newNode -> tahunTerbit = tB;
    newNode -> next = NULL;
    tail -> next = newNode;
    tail = newNode;
};

void addMiddle(string judul, string pengarang, int tB, int posisi) {
    if(posisi < 1 || posisi > countSingleLinkedList()) {
        cout << "Posisi di luar jangkauan" << endl;
    }
    else if(posisi == 1) {
        cout << "Posisi bukan posisi tengah" << endl;
    }
    else {
        newNode = new Buku();
        newNode -> judul = judul;
        newNode -> pengarang = pengarang;
        newNode -> tahunTerbit = tB;
        cur = head;
        int nomor = 1;
        while(nomor < posisi - 1) {
            cur = cur -> next;
            nomor++;
        }
        newNode -> next = cur -> next;
        cur -> next = newNode;
    }
};

void removeFirst() {
    del = head;
    head = head -> next;
    delete del;
}

void removeLast() {
    del = tail;
    cur = head;
    while( cur -> next != tail) {
        cur = cur -> next;
    }
    tail = cur;
    tail -> next = NULL;
    delete del;
}

void removeMiddle(int posisi) {
    if(posisi < 1 || posisi > countSingleLinkedList()) {
        cout << "Posisi di luar jangkauan" << endl;
    }
    else if(posisi == 1 || posisi == countSingleLinkedList()) {
        cout << "Posisi bukan posisi tengah" << endl;
    }
    else {
        int nomor = 1;
        cur = head;
        while(nomor <= posisi) {
            if(nomor == posisi - 1) {
                before = cur;
            }   
            if(nomor == posisi) {
                del = cur;
            }
            cur = cur -> next;
            nomor++;
        }
        before -> next = cur;
        delete del;
    }
};

void changeFirst(string judul, string pengarang, int tB) {
    head -> judul = judul;
    head -> pengarang = pengarang;
    head -> tahunTerbit = tB;
};

void changeLast(string judul, string pengarang, int tB) {
    tail -> judul = judul;
    tail -> pengarang = pengarang;
    tail -> tahunTerbit = tB;
};

void changeMiddle(string judul, string pengarang, int tB, int posisi) {
    if(posisi < 1 || posisi > countSingleLinkedList()) {
        cout << "Posisi di luar jangkauan" << endl;
    }
    else if(posisi == 1 || posisi == countSingleLinkedList()) {
        cout << "Posisi bukan posisi tengah" << endl;
    }
    else {
        cur = head;
        int nomor = 1;
        while(nomor < posisi) {
            cur = cur -> next;
            nomor++;
        }
        cur -> judul = judul;
        cur -> pengarang = pengarang;
        cur -> tahunTerbit = tB;
    }
};

void printSingleLinkedList() {
    cout << "Jumlah data ada: " << countSingleLinkedList() << endl;
    cur = head;
    while(cur != NULL) {
        cout << "Judul Buku: " << cur -> judul << endl;
        cout << "Pengarang Buku: " << cur -> pengarang << endl;
        cout << "Tahun Terbit: " << cur -> tahunTerbit << endl;

        cur = cur -> next;
    }
}

int main () {
    createSingleLinkedList("Kata", "Geez & Aan", 2018);
    printSingleLinkedList();
    cout << "------------------------------1";
    cout << " \n\n" << endl;

    addFirst("Dia adalah Kakakku", "Tere Liye", 2009);
    printSingleLinkedList();
    cout << "------------------------------2";
    cout << "\n\n" << endl;

    addLast("Aroma Karsa", "Dee Lestari", 2018);
    printSingleLinkedList();
    cout << "------------------------------3";
    cout << "\n\n" << endl;

    removeFirst();
    printSingleLinkedList();
    cout << "------------------------------4";
    cout << "\n\n" << endl;

    addLast("11.11", "Fiersa Bersari", 2018);
    printSingleLinkedList();
    cout << "------------------------------5";
    cout << "\n\n" << endl;

    removeLast();
    printSingleLinkedList();
    cout << "------------------------------6";
    cout << "\n\n" << endl;

    changeFirst("Berhenti di Kamu", "Gia Pratama", 2018);
    printSingleLinkedList();
    cout << "------------------------------7";
    cout << "\n\n" << endl;

    addMiddle("Bumi Manusia", "Pramoedya Ananta Toer", 2005, 2);
    printSingleLinkedList();
    cout << "------------------------------8";
    cout << "\n\n" << endl;

    addMiddle("Negeri 5 Menara", "Ahmad Fuadi", 2009, 2);
    printSingleLinkedList();
    cout << "------------------------------9";
    cout << "\n\n" << endl;

    removeMiddle(1);
    printSingleLinkedList();
    cout << "------------------------------10";
    cout << "\n\n" << endl;

    changeMiddle("Sang Pemimpi", "Andrea Hirata", 2006, 2);
    printSingleLinkedList();
    cout << "------------------------------11";
    cout << "\n\n" << endl;

    return 0;
}
