package package1;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k] &&
                            arr[i] + arr[k] > arr[j] &&
                            arr[j] + arr[k] > arr[i]) {
                        count++;
                        System.out.println("Triangle: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }

        System.out.println("Total number of triangles: " + count);
    }
}
