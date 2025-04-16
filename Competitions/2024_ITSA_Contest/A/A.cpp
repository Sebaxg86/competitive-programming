#include <iostream>
using namespace std;

int main()
{

    freopen("input.txt", "r", stdin); 
    freopen("output.txt", "w", stdout);

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string cadena;

    while (getline(cin, cadena) && !cadena.empty())
    {
        cout << cadena << endl;
    }

    return 0;
}