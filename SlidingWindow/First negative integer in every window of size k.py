amount = 5
n = 4

# dp = [[0 for i in range(amount+1)]for j in range(n+1)]
#
# for i in range(0, n+1):
#     dp[i][0] = 1
# for j in range(1, amount+1):
#     dp[0][j] = 0
# dp[0][0] = 1
dp = [[0] * (amount + 1) for _ in range(n + 1) ]
print(dp)
for i in range(n + 1):
    dp[i][0] = 1

print(dp)
