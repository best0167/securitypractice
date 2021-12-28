package kakaocommerce;

import java.util.ArrayList;
import java.util.Arrays;

public class TrainPassenger {
    public static int[] solution(int n, int[] passenger, int[][] train) {
        int[] answer = {};

        int total = passenger[0];

        for(int i = 0; i < n-1; i++) {

        }

        return answer;
    }



    public static void main(String[] args) {
        int n = 6;
        int[] passenger = {1, 1, 1, 1, 1, 1};
        int[][] train = {{1, 2}, {1, 3}, {1, 4}, {3, 5}, {3, 6}};

        System.out.println(Arrays.toString(solution(n, passenger, train))); // {6, 3}

        int n1 = 4;
        int[] passenger1 = {2, 1, 2, 2};
        int[][] train1 = {{1, 2}, {1, 3}, {2, 4}};

        System.out.println(Arrays.toString(solution(n1, passenger1, train1))); // {4, 5}

        int n2 = 5;
        int[] passenger2 = {1, 1, 2, 3, 4};
        int[][] train2 = {{1, 2}, {1, 3}, {1, 4}, {1, 5}};

        System.out.println(Arrays.toString(solution(n2, passenger2, train2))); // {5, 5}

    }
}
