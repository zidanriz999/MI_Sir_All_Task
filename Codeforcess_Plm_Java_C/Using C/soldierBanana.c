#include <stdio.h>

int main() {
    int k, n, w;
    scanf("%d %d %d", &k, &n, &w);

    int total = 0;

    for (int i = 1; i <= w; i++) {
        total = total + i * k;
    }

    if (total > n)
     {
        printf("%d\n", total - n);
     }
     else 
     {
        printf("0\n");
     }

    return 0;
}
