public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = new int[10];
        for (int i = 0 ; i < arr.length ; i ++)
            arr[i] = i;

        int [] scores = new int[]{1, 2, 3, 4};
        for(int i = 0; i < scores.length ; i ++)
            System.out.println(scores[i]);

        for(int score: scores)
            System.out.println(score);

        scores[0] = 98;

        for(int score: scores)
            System.out.println(score);
    }
}
