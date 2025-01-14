package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;

    private int balance;

//    생성자 추가
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance =0;
    }


//    계좌에 입금반영 메서드
public void updateBalance(int balance){
    this.balance += balance;
}

// 계좌에 출금반영 메서드
    public  void minusBalance(int balance){
        this.balance-=balance;
    }


//    getter

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
