package com.company;
//백준 2941 크로아티아 알파벳(c=, c-, dz=, d-, lj, nj, s=, z=)
import java.util.Scanner;
public class CroatianAlphabet_2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int result = 0;

        //for문으로 돌면서 result를 증가한다. 이때 크로아티아 알파벳에 해당하는 경우
        //c= 같은 경우에는  i를 +1 하는 식으로 검사하는 인덱스 위치를 옮긴다.
        for (int i = 0; i < input.length(); i++){
            result++;
            switch (input.charAt(i)){
                case 'c' :
                    if (i < input.length() -1 && (input.charAt(i+1) == '=' || input.charAt(i+1)  == '-')){
                        i++;
                    }
                    break;
                case 'd' :
                    if (i < input.length() -2 && input.charAt(i+1) == 'z' && input.charAt(i+2) == '='){
                        i += 2;
                    }
                    else if (i < input.length() -1 && input.charAt(i+1) == '-'){
                        i++;
                    }
                    break;
                case 's' : case 'z' :
                    if (i < input.length() -1 && input.charAt(i+1) == '='){
                        i++;
                    }
                    break;
                case 'l' : case 'n' :
                    if (i < input.length() -1 && input.charAt(i+1) == 'j'){
                        i++;
                    }
                    break;
            }
        }
        System.out.println(result);
    }
}
