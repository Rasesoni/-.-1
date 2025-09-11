#include <iostream>
using namespace std;
int main() {
    char list[6][2] = {"a", "1", "b", "2", "c", "3"};
    for (int i = 0; i < 6; i += 2) {
        cout << list[i] << " ";
    }
    cout << endl;
    for (int i = 1; i < 6; i += 2) {
        cout << list[i] << " ";
    }
    return 0;
}
