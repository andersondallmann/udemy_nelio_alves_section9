package Entities;

public class Account {

    private int numberAccount;
    private String holderAccount;
    private double balanceAccount;

    public Account() {
    }

    public Account(int numberAccount, String holderAccount) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
    }

    public Account(int numberAccount, String holderAccount, double inicialDeposit) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        deposit(inicialDeposit);
    }

    /*------------------ Get e Set´s ------------------*/
    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    /*------------------ Método Deposit ------------------*/
    public void deposit (double amount){
        balanceAccount += amount;
    }

    /*------------------ Método WithDraw ------------------*/
    public void withdraw (double amount){
        balanceAccount -= amount + 5.0;
    }

    public String toString (){
        return "Account "
                +  numberAccount
                + ", Holder: "
                +  holderAccount
                + ", Balance: $ "
                + String.format("%.2f", balanceAccount);
    }

}
