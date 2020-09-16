#include <iostream>
#include <string>
#include <sstream>
#include <vector>

using namespace std;

int main() {

    string line;
    while (getline(cin, line)) {

        stringstream input(line);

        vector<int> ints;

        while (true) {
            int n;
            input >> n;
            if (!input)
                break;
            ints.push_back(n);
        }

        int answer = 0;

        // do your work here, store result in variable 'answer'
        // 'ints' is a list of integers

        cout << answer << '\n';

    }

    return 0;
}