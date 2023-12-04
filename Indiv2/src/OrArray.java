class OrArray implements Array {
    private int[] array;

    public OrArray(int[] array) {
        this.array = array;
    }

    @Override
    public int[] add(int[] arr) {
        int[] union = union(array, arr);
        return union;
    }

    @Override
    public double[] process(int[] arr) {
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = log(arr[i]);
        }
        return result;
    }

    private int[] union(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            result[index++] = num;
        }

        for (int num : arr2) {
            if (!contains(arr1, num)) {
                result[index++] = num;
            }
        }

        int[] trimmedResult = new int[index];
        System.arraycopy(result, 0, trimmedResult, 0, index);
        return trimmedResult;
    }

    private boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    private double log(int num) {
        return Math.log(num);
    }
}