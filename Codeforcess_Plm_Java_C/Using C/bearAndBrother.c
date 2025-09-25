#include <stdio.h>

int main() {
    int limak, bob;
    scanf("%d %d", &limak, &bob);

    int years = 0;

    while (limak <= bob) {
        limak = limak * 3;
        bob = bob * 2;
        years = years + 1;
    }

    printf("%d\n", years);

    return 0;
}
