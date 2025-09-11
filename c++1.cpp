#include <iostream>
#include <string>
using namespace std;
int main() {
    string str = "AaBbCcDd";
    string uplet;
    string lowlet;
    for (int i = 0; i < str.length(); i++) {
        if (i % 2 == 0) {
            uplet += str[i];  
        } else {
            lowlet += str[i];  
        }
    }
    cout << "big_lett " << uplet << endl;
    cout << "small_lett= " << lowlet << endl;
}
