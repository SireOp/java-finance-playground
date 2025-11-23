package com.codespace.controller;

import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping("/maps")
public class MapController {

    @GetMapping("/balances")
    public Map<String, BigDecimal> getBalances() {
        Map<String, BigDecimal> balances = new HashMap<>();
        balances.put("ACC-123", new BigDecimal("150.50"));
        balances.put("ACC-456", new BigDecimal("250.00"));
        return balances;
    }

    

    @GetMapping("/balances-list")
    public List<BalanceDTO> getBalanceList() {
        return List.of(
                new BalanceDTO("ACC-123", new BigDecimal("150.50")),
                new BalanceDTO("ACC-456", new BigDecimal("250.00"))
        );
    }

    public record BalanceDTO(String accountId, BigDecimal balance) {}
}
