package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        Optional<Map.Entry<User, List<Account>>> rsl = users.entrySet().stream()
                .filter((s) -> s.getKey().getPassport().equals(passport)).findFirst();
        return rsl.isEmpty() ? null : rsl.get().getKey();
    }

    public Account findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        User user = findByPassport(passport);
        if (!(user == null)) {
            List<Account> accountList = users.get(user);
            rsl = accountList.stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return rsl.isEmpty() ? null : rsl.get();
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null || srcAccount.getBalance() < amount) {
            rsl = false;
        } else {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
