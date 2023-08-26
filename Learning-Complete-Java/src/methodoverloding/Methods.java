package methodoverloding;

class Methods {

    public int addNumber() {
        int result = 10 + 20;
        return result;
    }

    public int addNumber(int num) {
        int result = num + 0;
        return result;
    }

    public int addNumber(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int addNumber(int num1, double num2) {
        int result = num1 + (int) num2;
        return result;
    }

    public int addNumber(double num1, int num2) {
        int result = (int) num1 + num2;
        return result;
    }

}
