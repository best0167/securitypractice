package kakaocommerce;

import java.util.*;

public class GiveupPerson {
    public static int solution(int[] gift_cards, int[] wants) {
        int answer = 0;


        Map<Integer, Integer> map = new HashMap<>();

        for(int card : wants) map.put(card, map.getOrDefault(card, 0) + 1);
        for(int card : gift_cards) map.put(card, map.get(card) -1);

        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue() >= 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] gift_cards = {4, 5, 3, 2, 1};
        int[] wants = {2, 4, 4, 5, 1};

        System.out.println(solution(gift_cards, wants)); // 1

        int[] gift_cards1 = {5, 4, 5, 4, 5};
        int[] wants1 = {1, 2, 3, 5, 4};

        System.out.println(solution(gift_cards1, wants1)); // 3
    }
}
