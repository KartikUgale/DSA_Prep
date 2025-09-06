public class IncrisingOrderNum {
    public static void incresingNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        incresingNum(n - 1); // this will call n times
        System.out.print(n + " "); // this will call after all n times of calls
    }

    public static void main(String[] args) {
        int num = 5;
        incresingNum(num);
    }
}

// How Code will Run ->
// First code start from main function where n=5 is alocate in main stack frame
// of stack memory.
// then main function call function (incresingNum(num))
// it passes n=5 to call function (incresingNum(num))
// n is not equal to 1 hence code will reach to next line "incresingNum(n-1)"
// which is recursion function.
// here it call itself by passing n-1 value.
// this loop will hapend continuesly until n=1;
// when n value is equal to 1. then if statement run and print value of n which
// is 1, and then return command exicute.
// after return command exicuted all lines below the recursion function will
// exicute.
// hence it will print 2 then it exit from function then again print 3 and so
// on.
// all lines after recursion function will run until n=5;