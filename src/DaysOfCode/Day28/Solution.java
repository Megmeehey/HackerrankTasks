package DaysOfCode.Day28;

import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        String emailR = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailR);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = in.next();
            String email = in.next();
            Matcher matcher = pattern.matcher(email);

            if (matcher.find()) {
                list.add(name);
            }
        }

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}

