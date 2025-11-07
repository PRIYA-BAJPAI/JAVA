public class freq {
        public static void main(String[] args){
            String str="lal_bahadur_shastri";
            int freq[]=new int[256];
            for(char ch:str.toCharArray()){
                freq[ch]++;
            }
            for(int i=0;i<256;i++){
                if(freq[i]>0){
                    System.out.println((char)i + " -> "+freq[i]);
                }
            }
            // int count=0;
            // for(int i=0;i<str.length();i++){
            //     for(int j=0;j<str.length();j++){
            //         if(str.charAt(i)==str.charAt(j)){
            //             count++;
            //         }
                   

            //     }
            //      System.out.print(str.charAt(i));
            //         System.out.println(count);

            // }
        }
}
