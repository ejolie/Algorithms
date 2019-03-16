'''
boj2573. 빙산
'''
from sys import stdin

def bfs(a, b):
	q = [(a, b)]
	cnt = 0
	while q != []:
		cnt += 1
		x, y = q.pop(0)
		for i in range(4):
			nx = x + dx[i]
			ny = y + dy[i]
			if nx < 0 or nx > N-1 or ny < 0 or ny > M-1:
				continue
			# Check around seas
			if not mat[nx][ny]:
				around[x][y] += 1
			# BFS
			elif mat[nx][ny] and not visited[nx][ny]:
				visited[nx][ny] = 1
				q.append((nx, ny))
	return cnt

N, M = map(int, stdin.readline().split())
mat = [0] * N
mounts = [] # x, y
len_m = 0
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

for i in range(N):
	mat[i] = list(map(int, stdin.readline().split()))
	# Check mountains
	for j in range(M):
		if mat[i][j]:
			mounts.append((i, j))
			len_m += 1
            
year = -1
is_two = False
while True:
	year += 1
	# Check number of mountains
	visited = [[0] * M for _ in range(N)]
	around = [[0] * M for _ in range(N)]
	for m in mounts:
		x, y = m
		if not visited[x][y] and mat[x][y]:
			visited[x][y] = 1
			cnt_m = bfs(x, y)
			if len_m != cnt_m:
				is_two = True
			break
	if is_two:
		break

	# Melt mountains every year
	for m in mounts:
		x, y = m
		if mat[x][y]:
			mat[x][y] -= around[x][y]
			if mat[x][y] <= 0:
				mat[x][y] = 0
				len_m -= 1
	if len_m == 0:
		break

print(year if is_two else 0)