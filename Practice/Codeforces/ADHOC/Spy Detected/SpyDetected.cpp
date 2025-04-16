#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int testCases;  
    cin >> testCases;

    while (testCases > 0) {
        int arraySize;  
        cin >> arraySize;
        vector<int> array (arraySize);

        for(int i = 0; i<arraySize; i++){
            cin >> array[i];
        }

        int spy;
        if(array[0] == array[1] && array[1] == array[2]){
            for(int i = 3; i<arraySize; i++){
                if(array[i] != array[0]){
                    spy = i + 1;
                    break;
                }
            }
        }else if(array[0] != array[1] && array[0] != array[2]){
            spy = 1;
        }else if(array[1] != array[0] && array[1] != array[2]){
            spy = 2;
        }else if(array[2] != array[0] && array[2] != array[1]){
            spy = 3;
        }
            
        cout << spy << "\n";

        testCases--;
    }

    return 0;
}