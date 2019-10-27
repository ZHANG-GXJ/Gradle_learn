package leetcode;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        StringBuilder curr = new StringBuilder();
        String prev = countAndSay(n-1);

        for(int i=0; i<prev.length(); i++){
            int count = 1;
            char say = prev.charAt(i);
            for(int j=i+1; j<prev.length(); j++){
                if(prev.charAt(j) != say){
                    //  count = 1;
                    // say = prev.charAt(j);
                    //不同时退出循环
                    break;

                }else {
                    count++;
                    i++;
                }
            }

            /**
             * 或者while
             */
         /*   while ((i+1)<str.length()&&str.charAt(i+1)==c){
                count++;
                i++;
            }*/


            curr = curr.append(count).append(say);

        }
        return curr.toString();


    }
}
