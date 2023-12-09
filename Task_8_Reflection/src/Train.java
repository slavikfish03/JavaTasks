public class Train {
    String _number_train;
    int _count_wagons;
    int _load_capacity;

    Train(String nt, int wg, int lc) {
        _number_train = nt;
        _count_wagons = wg;
        _load_capacity = lc;
    }

    Train(String nt) {
        _number_train = nt;
        _count_wagons = 0;
        _load_capacity = 0;
    }

    void InfoTrain() {
        System.out.println("TRAIN №" + _number_train + "\nLoad capacity: " + _count_wagons
        + "\nCount of wagons: " + _count_wagons);
    }

    String GetNumberTrain() {
        return _number_train;
    }

    int GetCapacity() {
        return _load_capacity;
    }

    int GetNumWagons() {
        return _count_wagons;
    }

    void AddWagons(int numb_new_wagons) {
        _count_wagons += numb_new_wagons;
    }
}
