class Solution {
    public String freeSlotsFiller(long r, int l) {
        StringBuilder str = new StringBuilder();
        for (int i = 9; i >= 2; i--) {
            while (r % i == 0) {
                str.append((char) (i + '0'));
                r /= i;
            }
        }
        while (str.length()<l) {  
            str.append('1');
        }
        str.reverse();
        return str.toString();
    }
    private long gcd(long a, long b) {
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public String smallestNumber(String num, long t) {
        int n = num.length();
        long temp = t;
        for (int i : new int[]{2, 3, 5, 7}) {
            while (temp % i == 0) {
                temp /= i;
            }
        }
        if (temp != 1) {
            return "-1";
        }
        long[] rf = new long[n + 1];
        rf[0] = t;
        for (int i=0;i<n;i++) {
            int digit = num.charAt(i) - '0';
            if (digit == 0) {
                break;
            }
            rf[i + 1] = rf[i] / gcd(rf[i], digit);
        }
        if (rf[n] == 1) {
            return num;
        }
        int zeroPos = num.indexOf('0');
        int zeroIdx = n - 1;
        if (zeroPos != -1) {
            zeroIdx = zeroPos;
        }
        for (int i = zeroIdx; i >= 0; i--) {
            long r = rf[i];
            int free = n - 1 - i;
            for (int digit = (num.charAt(i) - '0') + 1; digit <= 9; digit++) {
                long a = r / gcd(r, digit);
                String s = freeSlotsFiller(a, free);
                if (s.length() == free) {
                    return num.substring(0, i) + (char) (digit + '0') + s;
                }
            }
        }
        return freeSlotsFiller(t, n + 1);
    }
}