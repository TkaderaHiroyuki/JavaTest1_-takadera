package test20240328_takadera;

public class Subject1 {

    public static void main(String[] args) {
        // 課題の説明を出力
        System.out.println("配列の中の最小数と最大数を求めるプログラム");
        
        // 配列の設定
        int[] array1 = {5, 10, 3, 8, 15, 2};
        int[] array2 = {20, 7, 12, 6, 9, 25};
        
        // 配列1の最小値と最大値を出力
        int min1 = findMin(array1);
        int max1 = findMax(array1);
        System.out.println("配列1の最小数: " + min1);
        System.out.println("配列1の最大数: " + max1);
        
        // 配列2の最小値と最大値を出力
        int min2 = findMin(array2);
        int max2 = findMax(array2);
        System.out.println("配列2の最小数: " + min2);
        System.out.println("配列2の最大数: " + max2);
    }
    
    // 配列の最小値を求めるメソッド
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    // 配列の最大値を求めるメソッド
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
