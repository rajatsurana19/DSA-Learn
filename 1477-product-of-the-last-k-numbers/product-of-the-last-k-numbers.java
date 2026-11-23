class ProductOfNumbers {
    List<Integer> a = new ArrayList<>();

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        a.add(num);
    }
    
    public int getProduct(int k) {
        int n = a.size();
            int sum = 1;

        for (int i = n - k; i < n; i++) {
            sum *= a.get(i);
        }

        return sum;
    }

}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */