package cn.zzdev.springboot.biz.service.impl;

import cn.zzdev.springboot.biz.entity.User;
import cn.zzdev.springboot.biz.dao.UserDao;
import cn.zzdev.springboot.biz.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangzhe
 * @since 2018-12-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
