
public class Main {
    public static void main(String[] args) {
        double[][] arr = {
                {1.5,3.8,2.8,15.6,11.9,24.2},
                {5,6.5,21.4,45.9,28.6,15.4}
        };
        double max = 0f;
        System.out.println("Phần tử lớn nhất sau mỗi lần duyệt mảng:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                    System.out.println(max + " tại vị trí x = " + i + " ; y = " + j);
                }
            }
        }
    }
}