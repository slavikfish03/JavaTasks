public class Triple<T> {
    private final T _first;
    private final T _second;
    private final T _third;

    public Triple(T first, T second, T third) {
        _first = first;
        _second = second;
        _third = third;
    }

    public String toString() {
        return "(" + _first + ", " + _second + ", " + _third + ")";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        return (_first.equals(((Triple<?>) object).getFirst()) &&
            _second.equals(((Triple<?>) object).getSecond()) &&
            _third.equals(((Triple<?>) object).getThird()));

    }

    public T getFirst() {
        return _first;
    }
    public T getSecond() {
        return _second;
    }
    public T getThird() {
        return _third;
    }

    public T min() {
        if (_first instanceof Comparable) {
            T min = _first;
            if (((Comparable)_second).compareTo(min) < 0)
                min = _second;
            if (((Comparable) _third).compareTo(min) < 0)
                min = _third;
            return min;
        }
        else
            throw new RuntimeException("The minimum is impossible to calculate");
    }
    public T max() {
        if (_first instanceof Comparable) {
            T max = _first;
            if (((Comparable)_second).compareTo(max) > 0)
                max = _second;
            if (((Comparable) _third).compareTo(max) > 0)
                max = _third;
            return max;
        }
        else
            throw new RuntimeException("The maximum is impossible to calculate");
    }

    public double mean() {
        if (_first instanceof Number) {
            return (((Number) _first).doubleValue() + ((Number)_second).doubleValue() + ((Number)(_third)).doubleValue())/3;
        }
        else
            throw new RuntimeException("The mean is impossible to calculate");

    }

}
