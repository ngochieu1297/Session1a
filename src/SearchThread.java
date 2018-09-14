public class SearchThread implements Runnable{

    private int start;
    private int end;
    private int x;
    private int pos = -1;
    private int[] arr;

    public SearchThread() {
    }

    public SearchThread(int start, int end, int x, int[] arr) {
        this.start = start;
        this.end = end;
        this.x = x;
        this.arr = arr;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i++) {
            if(arr[i] == x) {
                pos = i;
                System.out.println("Vi tri cua phan tu la : " + pos);
                break;
            }
        }
    }

    public int getPos() {
        return pos;
    }
}
