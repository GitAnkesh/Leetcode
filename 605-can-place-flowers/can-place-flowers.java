class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int max = 0;
    int fi = -1;
    int li = -1;
//Find first occurance and last occurance of 1
    for (int i = 0; i < flowerbed.length; i++) {
        if (flowerbed[i] == 0) {
            continue;
        }
        if (fi == -1) {
            fi = i;
            li = i;
        } else {
            li = i;
        }
    }

    // When the entire flowerbed is 0
    if (fi == -1) {
        return (flowerbed.length + 1) / 2 >= n;
    }

    max += fi / 2; // Left side of first index
    max += (flowerbed.length - 1 - li) / 2; // Right side of last index

    // Middle part of first index and last index
    int count=0;
    for(int i=fi+1;i<=li-1;i++){
        if(flowerbed[i]==0){
            count++;
        }
        else{
            max+=(count-1)/2;
            count=0;
        }
    }
    max+=(count-1)/2;
    return n<=max;
}


}