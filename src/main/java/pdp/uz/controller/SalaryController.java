package pdp.uz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pdp.uz.payload.ApiResponse;
import pdp.uz.payload.SalaryDto;
import pdp.uz.service.SalaryService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/salary")
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @PostMapping("/pay")
    public ResponseEntity<?> pay(@Valid @RequestBody SalaryDto dto){
        ApiResponse apiResponse = salaryService.pay(dto);
        return ResponseEntity.status(apiResponse.isStatus() ? 200 : 409).body(apiResponse);
    }

    @PostMapping("/confirm")
    public ResponseEntity<?> confirm(@RequestParam String email, @RequestParam String  emailCode){
        ApiResponse apiResponse = salaryService.confirm(email, emailCode);
        return ResponseEntity.status(apiResponse.isStatus() ? 200 : 409).body(apiResponse);
    }

    @PostMapping("/reject")
    public ResponseEntity<?> reject(@RequestParam String email, @RequestParam String  emailCode){
        ApiResponse apiResponse = salaryService.reject(email, emailCode);
        return ResponseEntity.status(apiResponse.isStatus() ? 200 : 409).body(apiResponse);
    }
}
