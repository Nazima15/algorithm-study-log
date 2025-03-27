public class level1_problem3 {
    public int solution(int age) {
        return 2023 - age;
    }

    public static void main(String[] args) {
        level1_problem3 solution = new level1_problem3();
        int result = solution.solution(25);
        
        System.out.println("Result: " + result);
    }
}
