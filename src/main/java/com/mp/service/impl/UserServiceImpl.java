package com.mp.service.impl;

import com.mp.pojo.User;
import com.mp.mapper.UserMapper;
import com.mp.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yixin
 * @since 2022-09-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
