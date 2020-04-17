public class demo {
    public static void main(String[] args) {
        String s = "acdk";
        String t = "ckad";
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int win = 0;
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i]==chars2[j]){
                    win++;
                }
            }

        }
        if (win==chars1.length){
            //如果win等于字符长度  说明s可以变成t
            System.out.println(win);
            //移动字符


        }else {
            System.out.println("s不能变换为t");
            System.out.println(-1);
        }

    }


}

