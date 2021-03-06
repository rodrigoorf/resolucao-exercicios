import java.util.ArrayList;

public class Solution {

	public int solution(int[] A){
		ArrayList<Integer> valores = new ArrayList<Integer>();
		ArrayList<Integer> qtde = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++){
			if (valores.contains(A[i]) == false){
				if (A[i] <= 0){
					return -167;
				}
				valores.add(A[i]);
				int vetor = valores.indexOf(A[i]);
				qtde.add(vetor, 1);
			} else {
				int vetor = valores.indexOf(A[i]);
				qtde.set(vetor, qtde.get(vetor) + 1);
			}
		}
		int result = -167; // resultado definido caso a condição desejada não seja satisfeita
		for (int i = 0; i < valores.size(); i++){
			int tempV = valores.get(i);
			int tempQ = qtde.get(i);
			if (tempQ == 1){
				result = tempV;
			}
		}
		return result;
	}
}