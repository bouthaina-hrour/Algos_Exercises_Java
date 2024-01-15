package dynamicProgramming;

import java.util.*;

public class Main {



    public static int climbingStairs(int n) {
        int[] dp = new int[n + 1];

        dp[n] = 1;
        dp[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            dp[i] = dp[i + 1] + dp[n + 2];
        }
        return dp[0];
    }

    public static int climbingStairs2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbingStairs2(n - 1) + climbingStairs2(n - 2);
    }

    /**
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1] result[0]=result[3] = nums[0]
     * result[1]= result[4]=nums[2]
     **/
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i] = result[i + n] = nums[i];
        }
        return result;

    }

    public static int[] replaceElements(int[] arr) {
        int[] arr2 = new int[arr.length];

        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[i] = max;
            max = Math.max(arr[i], max);
        }
        return arr2;
    }

    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        int i = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length() ? true : false;
    }

    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int j = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                if (j == 0) i--;
                else break;

            } else {
                i--;
                j++;
            }
        }
        return j;
    }

    public static int lengthOfLastWord2(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        return longestCommonPrefix(strs[0], strs[strs.length - 1]);

    }

    private static String longestCommonPrefix(String first, String last) {
        StringBuilder sb = new StringBuilder();
        int length = Math.min(first.length(), last.length());
        for (int i = 0; i < length; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> occurence = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            occurence.put(s.charAt(i), occurence.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            occurence.put(t.charAt(i), occurence.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Map.Entry entry : occurence.entrySet()) {
            if (!entry.getValue().equals(0)) return false;
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chart);
        Arrays.sort(chars);
        for (int i = 0; i < chart.length; i++) {
            if (chart[i] != chars[i]) return false;
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> sTot = new HashMap<>();
        Map<Character, Character> tTos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (sTot.containsKey(s.charAt(i)) && sTot.get(s.charAt(i)) != t.charAt(i)) return false;
            if (tTos.containsKey(t.charAt(i)) && tTos.get(t.charAt(i)) != s.charAt(i)) return false;
            sTot.put(s.charAt(i), t.charAt(i));
            tTos.put(t.charAt(i), s.charAt(i));
        }
        return true;

    }

    public static boolean isIsomorphic2(String s, String t) {
        int[] sArray = new int[128];
        int[] tArray = new int[128];
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = -1;
            tArray[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (sArray[s.charAt(i)] != tArray[t.charAt(i)]) return false;
            sArray[s.charAt(i)] = i;
            tArray[t.charAt(i)] = i;
        }
        return true;

    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = i;
        while (j < nums.length) {
            if (nums[i] != val) {
                i++;
                continue;
            }

            if (nums[i] == val && nums[j] != val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;

            }
            j++;
        }
        return i;

    }

    public static String simplifyEmail(String email) {
        String domainName = email.substring(email.indexOf("@") + 1);
        String localName = email.substring(0, email.indexOf("@"));
        // delete + and maba3daha if + exists in local name
        if (localName.contains("+")) {
            localName = localName.substring(0, localName.indexOf("+"));
        }
        localName = localName.replace(String.valueOf('.'), "");
        StringBuilder sb = new StringBuilder(localName);

        return sb.append("@").append(domainName).toString();
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        int numberOfuniqueEmails = 0;
        for (String email : emails) {
            if (!set.contains(simplifyEmail(email))) {
                numberOfuniqueEmails++;
                set.add(simplifyEmail(email));
            }

        }
        return numberOfuniqueEmails;
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] realCost = new int[cost.length + 1];
        realCost[cost.length] = 0;
        realCost[cost.length - 1] = cost[cost.length - 1];

        for (int i = cost.length - 2; i >= 0; i--) {
            realCost[i] = Math.min(realCost[i + 2], realCost[i + 1]) + cost[i];
        }
        return Math.min(realCost[0], realCost[1]);

    }

    public static String longestPalindrome(String s) {
        int maxLength = 1;
        int start = 0;
        int end = 0;
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            if (i != s.length() - 1) {
                dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1) ? 1 : 0;
                if (dp[i][i + 1] == 1) {
                    maxLength = 2;
                    start = i;
                    end = i + 1;
                }
            }
        }
// 1ere iteration dp[0][2] dp[1][3] dp[2][4]
        // 2eme dp[0][3] dp[1,4]
        // 0,4 1,3
        for (int j = 2; j < dp.length; j++) {
            for (int i = 0; i < dp.length - 1; i++) {

                if (j != i && j != i + 1) {
                    if (((s.charAt(i) == s.charAt(j)) && (dp[i + 1][j - 1] == 1))) {
                        dp[i][j] = 1;
                        if (j - i + 1 > maxLength) {
                            maxLength = j - i + 1;
                            start = i;
                            end = j;
                        }
                    } else dp[i][j] = 0;

                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            // Iterate over each column in the current row
            for (int j = 0; j < dp[i].length; j++) {
                // Print the element at the current position
                System.out.print(dp[i][j] + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        return s.substring(start, end + 1);

    }

    public int lengthOfLIS(int[] nums) {
        int LIS[] = new int[nums.length];
        Arrays.fill(LIS, 1);
        int max = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) LIS[i] = Math.max(LIS[i], 1 + LIS[j]);
            }
        }
        for (int i = 0; i < LIS.length; i++) {
            max = Math.max(LIS[i], max);
        }

        return max;

    }

    public int findNumberOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        Arrays.fill(LIS, 1);
        int max = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) LIS[i] = Math.max(LIS[i], 1 + LIS[j]);
            }
        }
        max = Arrays.stream(LIS).max().getAsInt();

        return max;
    }

    public static int longestDividingSequence(int num) {
        int[] lds = new int[num + 1];
        int[] cache = new int[num + 1];
        int max = 1;
        Arrays.fill(lds, 1);
        for (int i = num; i >= 1; i--) {
            for (int j = i + 1; j < num + 1; j++) {
                if (j % i == 0) {
                    if (1 + lds[j] > lds[i]) {
                        lds[i] = 1 + lds[j];
                        cache[i] = j;
                    }
                }
            }
        }
        max = Arrays.stream(lds).max().getAsInt();

        System.out.println("max is  " + max);
        System.out.println("longest dividing sequence is ");
        System.out.print(1 + " ");

        int i = 1;
        while (i < cache.length && cache[i] != 0) {
            System.out.print(cache[i] + " ");
            i = cache[i];
        }


        return max;

    }

    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                dp[i] = Math.max(nums[i], dp[i - 1]);
                continue;
            }
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];

    }

    public static int rob2(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(rob(Arrays.stream(nums, 1, nums.length ).toArray()), rob(Arrays.stream(nums, 0, nums.length-1).toArray()));

    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0]=0;
        Arrays.fill(dp, amount + 1);

        for(int i=1;i<amount+1;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i) dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }

        return  dp[amount]!=amount+1?dp[amount]:-1;
    }

    public static void main(String[] args) {
  /*      char[] chars0 = {'A', 'B', 'C'};
        char[] chars1 = {'A', 'B', 'C', 'A'};
        char[] chars2 = {'B', 'C', 'A', 'C', 'B'};
        char[] chars3 = {'A', 'B', 'C', 'A', 'X', 'B'};
        System.out.println("findDuplicate");
        System.out.println(findDuplicate(chars0));
        System.out.println(findDuplicate(chars1));
        System.out.println(findDuplicate(chars2));
        System.out.println(findDuplicate(chars3));

        System.out.println("sumOfTwo");
        System.out.println(sumOfTwo(new int[]{1, 2, 3, 5}, 10));
        int[] result = sumOfTwoWithIndex(new int[]{1, 2, 3, 5}, 10);
        for (int num : result) {
            System.out.println("hellooo 1" + num);
        }
        result = sumOfTwoWithIndex(new int[]{1, 2, 5, 3, 0}, 2);
        for (int num : result) {
            System.out.println("hellooo 2" + num);
        }
        System.out.println("compute");
        System.out.println(compute('+', 1, 3));
        System.out.println(compute('-', 1, 3));
        System.out.println(compute('*', 1, 3));

        System.out.println("orderingParenthesis");
        System.out.println(orderingParenthesis("(Ab)"));
        System.out.println(orderingParenthesis("(AA)b"));
        System.out.println(orderingParenthesis("((aa)b("));
        System.out.println(orderingParenthesis("(AA("));
        System.out.println(orderingParenthesis("A{{{AA}}()}"));
        System.out.println(orderingParenthesis("}}"));

        System.out.println("isPalindrome");
        System.out.println(isPalindrome("AABBAA"));
        System.out.println(isPalindrome("ABA"));
        System.out.println(isPalindrome("AXC"));

        System.out.println("fibonacci");
        System.out.println(fibonacci(3));
        System.out.println(fibonacci2(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci2(4));


        int[] result = replaceElements(new int[]{17,18,5,4,6,1});

        for (int element: result
             ) {
            System.out.println(element);

        }


        System.out.println(isSubsequence("axc", "abcde"));
        System.out.println(isSubsequence("abc", "abcde"));
        System.out.println(lengthOfLastWord2("hello jdjjd      kdl      "));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
        System.out.println(simplifyEmail("hr.ou.r+bouthaina+allez@gm+ail.com"));
        System.out.println(numUniqueEmails(new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"}));
        System.out.println(longestPalindrome("aaaaa"));
        longestDividingSequence(6);*/
        System.out.println(rob2(new int[]{1}));
    }
}
