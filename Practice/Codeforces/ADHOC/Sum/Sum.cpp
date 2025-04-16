#include <iostream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int testCases, a,b,c;
    cin >> testCases;

    for(int i = 0; i<testCases; i++){
        cin >> a >> b >> c;

        if((a + b == c) || (a + c == b) || (b + a == c) || (b + c == a) || (c + a == b) || (c + b == a)){
            cout << "YES" << "\n";
        }else{
            cout << "NO" << "\n";
        }
    }

    return 0;
}