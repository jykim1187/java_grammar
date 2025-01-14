package C02ClassBasic;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class BankService2 {

    public static void main(String[] args) throws IOException {
        Map<String, BankAccount> userList = new HashMap<>();
        BankAccount testUser = new BankAccount("1234", 100000);
        userList.put("1234", testUser);

        BankAccount testUser2 = new BankAccount("12345", 200000);
        userList.put("12345", testUser2);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------서비스 번호를 입력하세요-------------------");
            System.out.println("계좌가 있다면 1번 계좌가 없다면 0번을 눌러 계좌를 먼저 개설합니다. 종료하려면 다른 숫자번호 아무거나 누르세요");
            int fisrtInputNumber = sc.nextInt();

            if (fisrtInputNumber == 0) {
                System.out.println("계좌 개설입니다. 먼저 원하시는 계좌번호를 입력해주세요");
                String userAcNumber = sc.next();
                System.out.println("처음에 넣으실 금액을 입력하세요. 없다면 0을 눌러주세요");
                int fisrtInputMoney = sc.nextInt();

                if (userList.containsKey(userAcNumber)) {
                    System.out.println("있는 계좌번호입니다. 다른 계좌번호를 입력하세요");
                } else {
                    BankAccount user = new BankAccount(userAcNumber, fisrtInputMoney);
                    userList.put(userAcNumber, user);
                    System.out.println("계좌가 성공적으로 개설되었습니다.");
                    System.out.println();
                }

            } else if (fisrtInputNumber == 1) {
                System.out.println("계좌번호를 입력해주세요");
                String inputAcNumber = sc.next();  // inputAcNumber:사용자 계좌 번호 즉, 맵의 키값


                if (userList.containsKey(inputAcNumber)) {
                    BankAccount user = userList.get(inputAcNumber);  // 맵에 계좌 번호 키값이 있다면 그 키값에 해당하는 밸류를 뱅크어카운트에 대입

                    loop1:
                    while (true) {
                        System.out.println("해당하는 서비스 번호를 입력해주세요");
                        System.out.println("1.조회 2.입금 3.출금 4.송금 5.종료");
                        System.out.println();
                        int inputButton = sc.nextInt();
                        switch (inputButton) {
                            case 1:
                                System.out.println("잔액 조회 서비스입니다.");
                                System.out.println("현재 금액: " + user.getAccountBalance() + "원 입니다");
                                System.out.println();
                                break;

                            case 2:
                                System.out.println("입금 서비스입니다.");
                                System.out.println("입금하실 금액을 입력하세요");
                                System.out.println();
                                int inputMoney = sc.nextInt();
                                user.deposit(inputMoney);
                                System.out.println("입금이 완료되었습니다");
                                System.out.println("현재 금액: " + user.getAccountBalance() + "원 입니다");
                                break;

                            case 3:
                                System.out.println("출금서비스입니다.");
                                System.out.println("출금하실 금액을 입력하세요");
                                System.out.println();
                                int withdrawalMoney = sc.nextInt();
                                user.withdrawl(withdrawalMoney);
                                System.out.println("현재 금액: " + user.getAccountBalance() + "원 입니다");
                                break;

                            case 4:
                                System.out.println("송금서비스입니다.");
                                System.out.println("송금하실 금액을 입력하세요.");
                                System.out.println();
                                int transferMoney = sc.nextInt();
                                System.out.println("상대방 계좌를 입력해주세요");
                                String yourAcNumber = sc.next();
                                if(yourAcNumber.equals(inputAcNumber)){
                                    System.out.println("본인 계좌번호를 입력하셨습니다");
                                    break;
                                }
                                else if (userList.containsKey(yourAcNumber)) {
                                    BankAccount you = userList.get(yourAcNumber);

                                    user.transfer(you, transferMoney);
                                    System.out.println("현재 금액: " + user.getAccountBalance() + "원 입니다");
                                    break;
                                } //자기계좌 입력했을 때 어케 잘못처리? 본인계좌도 키값에 있다...
                                else {
                                    System.out.println("계좌를 잘못입력하셨습니다");
                                    break;
                                }

                            case 5:
                                break loop1;

                        }
                    }

                } else {
                    System.out.println("없는 계좌번호를 입력하셨습니다.");
                }
            }else{
                System.out.println("종료합니다");
                break;
            }
        }
    }
}


    class BankAccount {
        //필드선언
        private static int id = 0;
        private String accountNumber;
        private int accountBalance;


        //생성자 선언
        public BankAccount(String accountNumber, int accountBalance) {

            this.accountNumber = accountNumber;
            this.accountBalance = accountBalance;
            id++;
        }

        //getter메서드 선언

        public String getAccountNumber() {
            return accountNumber;
        }

        public int getAccountBalance() {
            return accountBalance;
        }

        //입금 메서드 선언
        public void deposit(int money) {
            this.accountBalance += money;
        }

        //출금 메서드 선언
        public boolean withdrawl(int money) {
            if (this.accountBalance >= money) {
                this.accountBalance -= money;
                return true;
            } else {
                System.out.println("계좌에 있는 금액을 초과합니다.");
                System.out.println("계좌 잔액: " + this.getAccountBalance() + "원");
                return false;
            }

        }

        //          송금메서드 선언
        public void transfer(BankAccount user, int money) {

            if (withdrawl(money)) {
                user.deposit(money);
                System.out.println("송금이 완료되었습니다");
            } else{
                System.out.println("송금이 실패하였습니다");
                return;
            }

            }
        }


















