class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length;
		int c = mat[0].length;
		int i = 0;
		int[] soldiers = new int[r];
		int[] ans = new int[k];
		while (i < r) {
			if (mat[i][0] == 1) 
            {
				int l = 0;
				int h = c - 1;
				int res = 0;
				while (l <= h) 
                {
					int mid = (l + h)/2;
					if (mat[i][mid] == 1) 
                    {
						res = mid;
						l = mid + 1; 
					} 
                    else if (mat[i][mid] < 1){
                        h = mid - 1;
                    }
				}
				soldiers[i] = res + 1; 
			} 
            else if (mat[i][0] == 0) 
            {
				soldiers[i] = 0;  
			}
			i++;
		}
		for (int x = 0; x < k; x++) 
        {
			int index = 0;
			int min = c + 1;
			for (int j = 0; j < soldiers.length; j++) 
            {
				if (soldiers[j] < min) 
                {
					min = soldiers[j];
					index = j;
				}
			}
			soldiers[index] = c + 1; 
			ans[x] = index;
		}
		return ans;
	}
}