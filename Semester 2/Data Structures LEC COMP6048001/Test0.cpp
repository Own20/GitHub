#include <iostream>
using namespace std;

template <class elemType> 
class arrayListType { 
    protected:
        elemType *list; //array to hold the list elements
        int length; 
        int maxSize;
    public:
        const arrayListType<elemType>& operator= (const arrayListType<elemType>&); //Overloads the assignment operator (=)
        bool isEmpty() const; 
        bool isFull() const; //Function to determine whether the list is full. 
        int listSize() const; //Function to determine the number of elements in the list 
        int maxListSize() const; //Function to determine the size of the list. 
        void print() const; //Function to output the elements of the list 
        bool isItemAtEqual(int location, const elemType& item) const; //Function to determine whether the item is the same 
        void insertAt(int location, const elemType& insertItem); //Function to insert an item in the list at the position specified
        void insertEnd(const elemType& insertItem); //Function to insert an item at the end of the list.
        void removeAt(int location); //Function to remove the item from the list
        void retrieveAt(int location, elemType& retItem) const; //Function to retrieve the element from the list 
        void replaceAt(int location, const elemType& repItem); //Function to replace the elements in the list
        void clearList(); //Function to remove all the elements from the list.
        void insert(const elemType& insertItem); //Function to insert the item 
        void remove(const elemType& removeItem); //Function to remove an item from the list.

        // constructor and destructor
        arrayListType(int size = 100); // constructor
        arrayListType(const arrayListType<elemType>& otherList); //copy constructor
        ~arrayListType();
}

template <class elemType>
void arrayListType<elemType>::insertEnd(const elemType& insertItem)
{
    if (length >= maxsize) {
        cerr << "Cannot insert in a full list" << endl;
    } else {
        list[length] = insertitem; //insert the item at the end
        length++; //ingrement the length
    }
}

template <class elemtype>
void arrayListType<elemtype>::removeAt(int location)
{
    if (location < 0 || location >= length) {
        cerr << "The location of the item to be removed "
             << "is out of range" << endl;
    } else {
        for (int i = location; i < length - 1; i++) {
            list[i] = list[it1];
        }
        length--;
    }
}

int main() {
    int elemType[5] = {10, 58, 93, 98, 23};
    insertEnd<int>a(30);
    removeAt<int>a(3);
}