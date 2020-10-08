package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (!(user == null && users.get(user).contains(account))) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (!(user == null)) {
            List<Account> accountList = users.get(user);
            for (Account account : accountList) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        if (srcAccount == null || destAccount == null || srcUser == null || destUser == null
                || srcAccount.getBalance() < amount) {
            rsl = false;
        } else {
            List<Account> srcAccounts = users.get(srcUser);
            List<Account> destAccounts = users.get(destUser);
            srcAccounts.get(srcAccounts.indexOf(srcAccount)).setBalance(srcAccount.getBalance() - amount);
            destAccounts.get(destAccounts.indexOf(destAccount)).setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
