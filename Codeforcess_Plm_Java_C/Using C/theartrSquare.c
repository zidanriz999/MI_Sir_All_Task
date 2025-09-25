#include <stdio.h>
int main() {
  
    long long n, m, a;
    scanf("%lld %lld %lld", &n, &m, &a);

    long long rows = (n + a - 1) / a;
    long long cols = (m + a - 1) / a;

    printf("%lld\n", rows * cols);

    return 0;
}
