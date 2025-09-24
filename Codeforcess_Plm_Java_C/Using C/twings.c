#include <stdio.h>
#include <stdlib.h>

int cmp(const void *a, const void *b) {
    return (*(int*)b - *(int*)a);
}

int main() {
    int n;
    scanf("%d", &n);

    int coins[101];   
    int total = 0;

    for (int i = 0; i < n; i++) 
    {
        scanf("%d", &coins[i]);
        total += coins[i];
    }

  
    qsort(coins, n, sizeof(int), cmp);

    int mySum = 0, count = 0;
    for (int i = 0; i < n; i++) {
        mySum += coins[i];
        count++;
        if (mySum > total - mySum) {
            break;
        }
    }

    printf("%d\n", count);
    return 0;
}
