import java.util.Arrays;

public class Char {
    public static void main(String[] args) {
        char[][] array = new char[3][3];
        array[0][0] = 'x';
        array[0][1] = 'o';
        array[0][2] = 'x';
        array[1][0] = 'o';
        array[1][1] = 'o';
         array[1][2] = 'x';
        array[2][0] = 'x';
        array[2][1] = 'o';
        array[2][2] = 'o';
        ticTac(array, 1);
    }

    public static void ticTac(char[][] array, int num){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (num == 1) {
                    if (array[i][j] == 'x') {
                        array[i][j] = '1';
                    }
                } else if (num == 0) {
                    if (array[i][j] == 'o'){
                        array[i][j] = '0';
                    }
                }
            }
            System.out.println(Arrays.toString(array[i]) + " ");
        }

    }
}
