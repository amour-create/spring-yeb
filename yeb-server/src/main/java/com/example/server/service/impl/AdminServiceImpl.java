package com.example.server.service.impl;

import com.example.server.pojo.Admin;
import com.example.server.mapper.AdminMapper;
import com.example.server.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
