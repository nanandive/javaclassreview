package days03;

/**
 * @author kenik
 * @date 2023. 1. 30. - 오후 12:47:50
 * @subject   [ 음수 -> 2진수 표현 방법 ]  2:00 수업시작.~
 * @content   1. 부호와 절대치
 *                       2. 1의 보수법
 *                       3. 2의 보수법( 현재 )  = 1의 보수 + 1
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		// 'A' -> 문자코드표-> 65             -> 0100 0001
		// -10 [음수]/양수                        -> [][][][] [][][][]
		/*
		 * 
		 * -10                     [][][][] [][][][]
		 * 1) 절대치  |-10|        10   양수
		 *     X [1]000 1010  -10   음수
		 *     X [0]000 1010  10    양수
		 *      
		 *      0000 1010
		 *  2) 1의 보수   0-> 1   1-> 0
		 *       1111 0101
		 *  3) 1 더하기
		 *       1111    0101
		 *       0000 0001
		 *       ----------
		 *      [ 1111   0110 ]     
		 * */
		
		// [문제] -36                    [][][][] [][][][]  
		//                                         1101      1100
		//                                        [1]101 1100 
		// 
		/*
		* 1) 절대치  |-36|        36   양수		  
		 *      0010 0100
		 *      
		 *  2) 1의 보수   0-> 1   1-> 0
		 *       1101 1011
		 *       
		 *  3) 1 더하기
		 *       1101     1011
		 *       0000 0001
		 *       ----------
		 *      [ 1101 1100 ]     
		 */
		

	} // main

} // class





