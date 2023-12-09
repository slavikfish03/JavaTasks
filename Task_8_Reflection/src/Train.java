public class Train {
    String _number_train;
    int _count_wagons;
    int _load_capacity;

    public Train(String nt, int wg, int lc) {
        _number_train = nt;
        _count_wagons = wg;
        _load_capacity = lc;
    }

    public Train(String nt) {
        _number_train = nt;
        _count_wagons = 0;
        _load_capacity = 0;
    }

    public void InfoTrain() {
        System.out.println("TRAIN №" + _number_train + "\nLoad capacity (t): " + _load_capacity
                + "\nCount of wagons (items): " + _count_wagons);
    }

    public String GetNumberTrain() {
        return _number_train;
    }

    public int GetCapacity() {
        return _load_capacity;
    }

    public int GetNumWagons() {
        return _count_wagons;
    }

    public void AddWagons(int numb_new_wagons) {
        _count_wagons += numb_new_wagons;
        _load_capacity = _load_capacity + 70 * numb_new_wagons;
    }
}
