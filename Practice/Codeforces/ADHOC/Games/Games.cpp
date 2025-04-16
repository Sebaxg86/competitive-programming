// ------------------------------- A. Games --------------------------------------
// ------------------ https://codeforces.com/problemset/problem/268/A ------------
#include <iostream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    int h[n], a[n];

    for (int i = 0; i < n; i++) {
        cin >> h[i] >> a[i];
    }

    int count = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i != j && h[i] == a[j]) {  
                count++;
            }
        }
    }
    
    cout << count << "\n";

    return 0;
}