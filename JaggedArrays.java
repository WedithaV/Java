public class JaggedArrays {
    public static void main(String[] args){
        int[][] numbers = {
            {1,2},
            {11,22,33,44},
            {423,545,765,785,234}
        };

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
