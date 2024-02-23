public class ATMSolution {
    public int solve(int n) {
        int contador = 0;
        int[] billetes = {500, 200, 50, 20, 10};
        for (int billete : billetes) {
            while (n >= billete) {
                n -= billete;
                contador += 1;

            }
        }
        if (n > 0) {
            return -1;
        }
        return contador;
    }
}