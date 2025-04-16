#include <iostream>
#include <cmath> // Para usar asin, M_PI y ceil

using namespace std;

int main() {
    double x = 0, y = 0, z = 0;  
    double areaTriangulo = 0.0;
    double radioSemicirculo = 0.0; 
    double areaSemicirculo = 0.0;

    cin >> x >> y >> z;
    
    double anguloB = 0.0, anguloD = 0.0; 
    anguloB = asin((y) / x);
    anguloD = asin((z) / x);

    double totalAngulo = ((anguloB * (180.0 / M_PI)) + (anguloD * (180.0 / M_PI)));
    int anguloRecto = ceil(180 - totalAngulo);
    cout << totalAngulo << endl;

    if(anguloRecto == 90){
        areaTriangulo = (z * y) / 2;
        radioSemicirculo = z / 2;
        areaSemicirculo = (M_PI * pow(radioSemicirculo, 2)) / 2.0;

        cout << "AREA = " << areaSemicirculo + areaTriangulo << endl;
        
    } else {
        cout << "Nao eh retangulo!" << endl;
    }

    return 0;
}