public class ParallelSearch {

    public static int Search(int x, int[] arr, int numThread){
        int range = arr.length/numThread;
        for(int i = 0; i < numThread; i++) {
            Thread search;
            if(i == numThread - 1)
                search = new Thread(new SearchThread(i*range, arr.length - 1, x, arr));
            else
                search = new Thread(new SearchThread(i*range, i*range + range - 1, x, arr));
            search.start();
        }
        return 0;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15};
        int x = 11;
        int numOfThread = 5;
        Search(x, arr, numOfThread);
    }
}