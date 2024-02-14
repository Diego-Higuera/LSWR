public class lols {
    public static int longestSubstringWithoutRepeat(String s) {     //ENUNCIADO
        int[] letras = new int[128];                                // Array representing ASCII characters to track occurences
        int resultado = 0;
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char letra_d = s.charAt(j);
            letras[letra_d]++;
            while (letras[letra_d] > 1) {
                char letra_i = s.charAt(i);
                letras[letra_i]--;
                i++;
            }
            resultado = Math.max(resultado, j - i + 1);
            j++;
        }
        return resultado;
    }
} 
