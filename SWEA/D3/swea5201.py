'''
swea5201. 컨테이너 운반 (D3)

Greedy
1. 해 선택
 - 부분 문제의 최적 해를 구한 뒤, 부분 해 집합에 추가한다.
2. 실행 가능성 검사
 - 새로운 부분 해 집합이 실행가능한지
  (= 문제의 제약 조건을 위반하지 않는지)를 확인한다.
3. 해 검사
 - 새로운 부분 해 집합이 문제의 해가 되는지 확인한다.
 - 아직 전체 문제의 해가 완성되지 않았다면 1의 해 선택부터 다시 시작한다.
'''
