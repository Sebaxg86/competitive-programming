#include <iostream>
using namespace std;

int main()
{

    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int a = 0, b = 0, c = 0, d = 0;
    
    if (!(cin >> a >> b >> c >> d)) {
        cout << "no" << "\n";
        return 0;
    }

    cin >> a >> b >> c >> d;

    if (a <= 0 || b <= 0 || c <= 0 || d <= 0)
    {
        cout << "no" << "\n";
    }
    else
    {
        if (a <= c && b <= d)
        {
            cout << "yes" << "\n";
        }
        else if (a > c && b > d)
        {
            cout << "no" << "\n";
        }
        else if (a <= d && b <= c)
        {
            cout << "yes" << "\n";
        }
        else if (a > d && b > c)
        {
            cout << "no" << "\n";
        }
        else
        {
            cout << "no" << "\n";
        }
    }

    return 0;
}