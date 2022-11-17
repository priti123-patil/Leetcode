class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int x = Math.min(bx2, ax2) > Math.max(bx1, ax1) ? (Math.min(bx2, ax2) - Math.max(bx1, ax1)) : 0;
        
        int y = Math.min(ay2, by2) > Math.max(ay1, by1) ? (Math.min(ay2, by2) - Math.max(ay1, by1)) : 0;
        
        return (ay2 - ay1) * (ax2 - ax1) + (bx2 - bx1) * (by2 - by1) - x * y;
        
    }
}