package com.codespace.maps;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BalanceMapDemo {

    public static void main(String[] args) {

        // 1. Start with a HashMap
        Map<String, BigDecimal> balances = new HashMap<>();

        // 2. Add balances
        balances.put("ACC-123", new BigDecimal("150.50"));
        balances.put("ACC-456", new BigDecimal("250.00"));

        // Add more (simulate new deposits/changes)
        balances.merge("ACC-123", new BigDecimal("25.00"), BigDecimal::add);  // ACC-123 now 175.50
        balances.merge("ACC-789", new BigDecimal("300.00"), BigDecimal::add); // new account
        balance.merge("ACC-482", new BigDecimal("4500.90"), BigDecimal::add); // Account added
        balanace.merge("ACC-562", new BigDecimal("7331.25"), BigDecimal::add);

        // Print HashMap contents
        System.out.println("=== HashMap Balances ===");
        balances.forEach((acc, bal) ->
                System.out.println(acc + " → " + bal)
        );

        // 3. Add everything into a ConcurrentHashMap
        ConcurrentHashMap<String, BigDecimal> concurrentBalances =
                new ConcurrentHashMap<>(balances);

        // Add something extra (thread-safe)
        concurrentBalances.put("ACC-999", new BigDecimal("99.99"));

        // 4 & 5. Iterate over the ConcurrentHashMap and print entries
        System.out.println("\n=== ConcurrentHashMap Balances ===");
        concurrentBalances.forEach((acc, bal) ->
                System.out.println(acc + " → " + bal)
        );

    }
}
