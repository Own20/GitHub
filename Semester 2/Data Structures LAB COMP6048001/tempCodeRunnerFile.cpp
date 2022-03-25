
    vector<int> intList(10);

    // Exercise 2
    for (auto num = intList.begin();
        num != intList.end();
        num++)
        cout << ' ' << *num;
        cout << endl;
    // Answer 0 0 0 0 0 0 0 0 0 0

    // Exercise 3
    intList = {2, 4, 6, 8, 10};
    for (auto num = intList.begin();
        num != intList.end();
        num++)
        cout << ' ' << *num;