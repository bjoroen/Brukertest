
//Given two integers a and b, which can be positive or negative,
// find the sum of all the integers between including them too and return it.
// If the two numbers are equal return a or b.
//
//Note: a and b are not ordered!

//examples
//GetSum(1, 0) == 1   // 1 + 0 = 1
//GetSum(1, 2) == 3   // 1 + 2 = 3
//GetSum(0, 1) == 1   // 0 + 1 = 1
//GetSum(1, 1) == 1   // 1 Since both are same
//GetSum(-1, 0) == -1 // -1 + 0 = -1
//GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2


public class Oppgave2 {

    public int getSum(int a,int b){
        //Good Luck
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
