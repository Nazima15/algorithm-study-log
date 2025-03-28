nano level1_problem5.javaclass Level1Problem5 {
    public int getMaxValue(int a, int b) {
        int concatValue = Integer.parseInt(a + "" + b); // 숫자를 문자열로 바꿔 이어 붙이기
        int productValue = 2 * a * b; // 두 숫자의 곱을 2배 하기
        return Math.max(concatValue, productValue); // 더 큰 값 반환
    }

    public static void main(String[] args) {
        Level1Problem5 obj = new Level1Problem5();
        System.out.println(obj.getMaxValue(2, 3));  // 23
        System.out.println(obj.getMaxValue(9, 9));  // 162
        System.out.println(obj.getMaxValue(1, 10)); // 110
    }
}
class level1_problem5 {
    public int level1_problem5(int a, int b) {
        int concatValue = Integer.parseInt(a + "" + b);
        
        int productValue = 2 * a * b;
        
        return Math.max(concatValue, productValue);
    
}
}
