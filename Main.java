package javapract2;

public class Main {
	
	public static int[] finder(int[] array, int target) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
	
	
    public static void main(String[] args) {
        int target = 9;
        int[] array = {2, 15, 11, 7, 23};
        
        
        int[] indices = finder(array, target);
        if (indices != null) {
            System.out.println("Индексы: " + indices[0] + "; " + indices[1]);
        } else {
            System.out.println("Нет target");
        }
    }
}



