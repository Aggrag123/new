#include<iostream>;
using namespace std;

class Vehicle{
    public:
    string brand = "TATA";

    void honk(){
        cout<<"tuut,tuut!\n";
    }
};
class Car : public Vehicle{
    public:
    string model = "Altroz";

};

//  void main(){
    // Car myCar;
    // myCar.honk();
    // cout<<myCar.brand<<" "<<myCar.model;
    // return 0;


//     area a1;
//     a1.side = 4;
//    int i = a1.getarea();
//    cout<<i;
// }

class area{
    int side;
    int getarea();
};

int area :: getarea(){
    return side*side;
}

int main(){
    area a1;
    a1.side = 4;
    int i = a1.getarea();
    cout<<i;
}