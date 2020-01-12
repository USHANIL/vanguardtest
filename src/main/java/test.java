import java.util.*;

public class test {
    public static void main (String[] args) {
//        Stack st = new Stack();
//        st.push(1);
//        st.push(1.1);
//        st.push('z');
//        st.push("Hello");
//        System.out.println(st.size());
//        Integer len = st.size();
//        for (int i = 0; i < len; i++) {
//
//            System.out.println(st.pop());
//
//
//        }

  //      System.out.println(countHoles(630));

    }

        public static Integer countHoles (Integer n) {
            // Write your code here
            String str = n.toString();
            char[] strArray = str.toCharArray();
            Integer noOfHoles = 0;
            for (char ch:strArray ) {
                System.out.println(ch);
                if (ch == '0' || ch == '4' || ch == '6' || ch == '9'){
                    noOfHoles += 1;
                }
                else if (ch == '8'){
                    noOfHoles += 2;
                }
            }
            return noOfHoles;
        }


    public static List<String> funWithAnagrams(List<String> text) {
        // Write your code here
        List<String> ansList = new ArrayList();
        Set<String> foundSet = new HashSet();
        for (int i=0; i<text.size(); i++) {
            String word = text.get(i);
            String key = key(word);
            if (!foundSet.contains(key)){
                ansList.add(word);
                foundSet.add(key);
            }
            // if(sortOrder(text(i)).equals(sortOrder(text(i+1))))

        }
        Collections.sort(ansList);
        return ansList;
    }

    public static String key(String word){
        char[] chArr = word.toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }


    /*
     * Complete the 'usernamesSystem' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY u as parameter.
     */

    public static List<String> usernamesSystem(List<String> u) {
        // Write your code here
        List<String> ansList = new ArrayList();
        Map<String,Integer> foundMap = new HashMap();

        for (int i=0; i<u.size(); i++) {
            String word = u.get(i);

            if (!foundMap.containsKey(word)){
                foundMap.put(word, 0);
                ansList.add(word);
            }
            else{
                Integer valueOfString = foundMap.get(word) + 1;
                foundMap.put(word,valueOfString);
                String strNewWord = word + valueOfString;
                ansList.add(strNewWord);
            }
        }
        return ansList;
    }




}
