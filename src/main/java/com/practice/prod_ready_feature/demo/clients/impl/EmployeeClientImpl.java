package com.practice.prod_ready_feature.demo.clients.impl;

import com.practice.prod_ready_feature.demo.advice.ApiResponse;
import com.practice.prod_ready_feature.demo.clients.EmployeeClient;
import com.practice.prod_ready_feature.demo.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.lang.reflect.Type;

@Service
@RequiredArgsConstructor
public class EmployeeClientImpl implements EmployeeClient {

//    private final RestClient restClient;

    /*
    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {
        try{
            ApiResponse<EmployeeDTO> employeeResponse = restClient.get()
                    .uri("employees/{employeeId}/{abc}", employeeId)
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });
            return employeeResponse.getData();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        try{
           ApiResponse<List<EmployeeDTO>> employeeDTOList = (List<EmployeeDTO>) restClient.get()
                    .uri("employees")
                    .retrieve()
                    .body(new ParameterizedTypeReference<Object>() {
                    });
            return employeeDTOList.getData();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
     }
     */

}
