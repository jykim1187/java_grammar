package C04Interface.BankService;

public class BankKakaoService implements  BankService{
//    필드 선언부
    private BankAccount ba;




//    매서드 오버라이딩
    @Override
    public void deposit(int money, BankAccount ba) {
        ba.updateBalance(money);
        System.out.println(money + "원이 카카오서비스로 입금되었습니다.");
        System.out.println("현재잔액 : " + ba.getBalance() + "원 입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        ba.minusBalance(money);
        System.out.println(money + "원이 카카오서비스로 출금되었습니다.");
        System.out.println("현재잔액 : " + ba.getBalance() + "원 입니다.");
    }
}
