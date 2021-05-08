package in.java.encapsulation;

import in.java.data_hidding.Bank;

public class Emp {

    private long CurBalance = 0;

        long bank_id;
        String name;

        public long get_balance(long Id)
        {

            if (this.bank_id == Id) {

                return CurBalance;
            }

            return -1;
        }
        public void set_balance(long balance, long Id)
        {

            if (this.bank_id == Id) {

                CurBalance = CurBalance + balance;
            }
        }
    }
    class Emp1 {
        public static void main(String[] args)
        {
            Emp _emp = new Emp();

            _emp.bank_id = 10000;
            _emp.name = "Roshan";

            _emp.set_balance(10000, 10000);
            long emp_balance = _emp.get_balance(10000);
            System.out.println("User Name"
                    + " " + _emp.name);
            System.out.println("Bank_ID"
                    + " " + _emp.bank_id);
            System.out.println("Current Balance"
                    + " " + emp_balance);

        }
    }



