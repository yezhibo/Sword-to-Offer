
public class 二维数组中的查找 {

    public boolean Find(int target, int[][] array){
        boolean flag = false;
        for (int i = 0; i <array.length; i++) {
            for(int j = 0; j<array[0].length; j++){
                if(array[i][j]==target){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("hello word");
    }
}
