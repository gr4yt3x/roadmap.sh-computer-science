#include <iostream>
using namespace std;

void printPrimes(int n){
    int prime[n + 1];

    for(int i = 2; i <= n; i++){
        prime[i] = true;
    }
    
    for(int divisor = 2; divisor * divisor <= n; divisor++){
        if(prime[divisor]){
            for(int i = 2 * divisor; i <= n; i = i + divisor){
                prime[i] = false;
            }
        }
    }
    
    for(int i = 2; i <= n ; i++){
        if(prime[i]){
            cout << i << endl;
        }
    }
}

int main() {
    printPrimes(20);
    return 0;
}
