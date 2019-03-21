#include <string>
using namespace std;

class Taco {
    private:
        long quantity;
        string meat;

    public:
        void set_quantity(long quantity);
        long get_quantity() const;

        void set_meat(string value);
        string get_meat() const;
};