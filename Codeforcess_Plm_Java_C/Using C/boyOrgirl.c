#include <stdio.h>
#include <string.h>

int main() {
    char username[105];   
    int freq[256] = {0}; 
    int uniqueCount = 0;

    scanf("%s", username);

    int len = strlen(username);

    for (int i = 0; i < len; i++) {
        unsigned char c = username[i];
        if (!freq[c]) {   
            freq[c] = 1;
            uniqueCount++;
        }
    }

    if (uniqueCount % 2 == 0) {
        printf("CHAT WITH HER!\n");
    } else {
        printf("IGNORE HIM!\n");
    }

    return 0;
}
