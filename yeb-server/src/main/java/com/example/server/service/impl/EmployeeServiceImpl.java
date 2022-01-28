package com.example.server.service.impl;

import com.example.server.pojo.Employee;
import com.example.server.mapper.EmployeeMapper;
import com.example.server.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiang_meng
 * @since 2022-01-28
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
