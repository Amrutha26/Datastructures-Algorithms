public String multiply(String num1, String num2) {
        char[] chs1 = num1.toCharArray();
        char[] chs2 = num2.toCharArray();
        int n1 = chs1.length, n2 = chs2.length;
        char[] res = new char[n1 + n2];
        Arrays.fill(res, '0');
        
        for (int j = n2 - 1; j >= 0; j--) {
            for (int i = n1 - 1; i >= 0; i--) {
                int product = (chs1[i] - '0') * (chs2[j] - '0');
                int tmp = res[i + j + 1] - '0' + product;
                res[i + j + 1] = (char) (tmp % 10 + '0');
                res[i + j] = (char) ((res[i + j] - '0' + tmp / 10) + '0');
            }
        }
        
        StringBuilder sb = new StringBuilder();
        boolean seen = false;
        for (char c : res) {
            if (c == '0' && !seen) continue;
            sb.append(c);
            seen = true;
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
