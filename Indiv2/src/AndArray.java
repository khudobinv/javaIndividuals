class AndArray implements Array {
    private int[] array;

    public AndArray(int[] array) {
        this.array = array;
    }

    @Override
    public int[] add(int[] arr) {
        return intersection(array, arr);
    }

    @Override
    public double[] process(int[] arr) {
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = sqrt(arr[i]);
        }
        return result;
    }

    private int[] intersection(int[] arr1, int[] arr2) {
        int[] result = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;
        for (int num : arr1) {
            if (contains(arr2, num)) {
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

    private double sqrt(int num) {
        return Math.sqrt(num);
    }
}
